package com.djoumessi.progmobile.helepimmo.produits;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.djoumessi.progmobile.helepimmo.R;
import com.djoumessi.progmobile.helepimmo.acceuil.HomeAdapter;
import com.djoumessi.progmobile.helepimmo.databinding.CategoryItemBinding;
import com.djoumessi.progmobile.helepimmo.databinding.ProductItemBinding;
import com.djoumessi.progmobile.helepimmo.presentationbien.PresentationBien;
import com.djoumessi.progmobile.helepimmo.common.Product;

import java.io.Serializable;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {
    private final List<Product> products;

    public ProductsAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ViewHolder(ProductItemBinding.inflate(LayoutInflater.from(parent.getContext())));
//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = products.get(position);

        holder.price.setText(product.getPrice().substring(0,product.getPrice().indexOf(".")));
        holder.label.setText(product.getLabel());
        holder.productDescription.setText(product.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(holder.itemView.getContext(), PresentationBien.class);
                intent.putExtra("product_id",  product);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView price;
        TextView label;
        TextView productDescription;
        ImageView productLogo;
        public ViewHolder(@NonNull ProductItemBinding binding) {
            super(binding.getRoot());

            this.price = binding.price;
            this.label = binding.label;
            this.productDescription = binding.productDescription;
            this.productLogo = binding.productLogo;
        }
    }
}
