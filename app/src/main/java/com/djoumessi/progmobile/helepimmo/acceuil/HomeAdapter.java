package com.djoumessi.progmobile.helepimmo.acceuil;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.djoumessi.progmobile.helepimmo.R;
import com.djoumessi.progmobile.helepimmo.common.ApiImage;
import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.common.remote.ApiUtil;
import com.djoumessi.progmobile.helepimmo.databinding.CategoryItemBinding;
import com.djoumessi.progmobile.helepimmo.produits.Produits;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<Category> categories = new ArrayList<>();

    public HomeAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(CategoryItemBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = categories.get(position);

        holder.text.setText(category.getLabel());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Produits.class);
                intent.putExtra("category_id", category);
//                intent.putExtra("type", ""+categories.get(holder.getAdapterPosition()).getFkParent());
                holder.itemView.getContext().startActivity(intent);
            }
        });

        int len = category.getId().length();
        String v = category.getId();
        String str = "";
        if (len == 1) {
            str  = 0 + "" + category.getId();
        }else
        {
            str =  v.substring(len - 2, len - 1) + v.substring(len - 1);
        }

        Call<ApiImage> requestForLogo = ApiUtil.getImageService().getImage("category", str.substring(1) + "/" + str.substring(0, 1) + "/" + category.getId() + "/photos/logo.png");
        Callback<ApiImage> onGetLogo = new Callback<ApiImage>() {
            @Override
            public void onResponse(Call<ApiImage> call, Response<ApiImage> response) {
                if (response.isSuccessful()){
                    ApiImage image = response.body();
                    byte[] imageBytes = Base64.decode(image.getContent(), Base64.DEFAULT);
                    Bitmap imageBitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                    holder.logo.setImageBitmap(imageBitmap);
//                    holder.logo.setTint(ColorStateList.valueOf(R.color.colorPrimary));
                } else {
                    Log.e("J-Purple", "HomeAdapter::onResponse: is not successful with error ={"+response.raw()+"}" );
                }
            }

            @Override
            public void onFailure(Call<ApiImage> call, Throwable t) {
                Log.e("J-Purple", "HomeAdapter::onFailure: ",t );
            }
        };
        requestForLogo.enqueue(onGetLogo);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView logo;
        private TextView text;

        public ViewHolder(@NonNull CategoryItemBinding binding) {
            super(binding.getRoot());
            this.logo = binding.logo;
            this.text = binding.text;
        }
    }
}
