package com.djoumessi.progmobile.helepimmo.presentationbien;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.djoumessi.progmobile.helepimmo.R;
import com.djoumessi.progmobile.helepimmo.common.ApiImage;
import com.djoumessi.progmobile.helepimmo.common.EcmFile;
import com.djoumessi.progmobile.helepimmo.common.EcmFilesInfo;
import com.djoumessi.progmobile.helepimmo.common.remote.ApiUtil;
import com.djoumessi.progmobile.helepimmo.databinding.DescriptionBienBinding;
import com.djoumessi.progmobile.helepimmo.databinding.PhotoItemBinding;
import com.djoumessi.progmobile.helepimmo.databinding.PhotosBienBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PhotosFragment extends Fragment {
    private PhotosBienBinding binding;
    private ProductInfoViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = PhotosBienBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(ProductInfoViewModel.class);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel.getProduct().observe(getViewLifecycleOwner(), product -> {
            if (product != null) {
                binding.grid.setColumnCount(4);
                Call<EcmFilesInfo> requestForDocuments = ApiUtil.getImageService().getImages("product", "" + product.getId());
                Callback<EcmFilesInfo> onDocumentsRequested = new Callback<EcmFilesInfo>() {
                    @Override
                    public void onResponse(Call<EcmFilesInfo> call, Response<EcmFilesInfo> response) {
                        if (response.isSuccessful()) {
                            EcmFilesInfo photos = response.body();

                            for (EcmFile ecmFile : photos.getEcmFiles()) {
                                Call<ApiImage> requestForImage = ApiUtil.getImageService().getImage("product", ecmFile.getFilepath().replace("produit/", "") + "/" + ecmFile.getFilename());
                                Callback<ApiImage> onGetImage = new Callback<ApiImage>() {
                                    @Override
                                    public void onResponse(Call<ApiImage> call, Response<ApiImage> response) {
                                        if (response.isSuccessful()) {
                                            ApiImage image = response.body();
                                            byte[] imageBytes = Base64.decode(image.getContent(), Base64.DEFAULT);
                                            Bitmap imageBitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                                            PhotoItemBinding imageView = PhotoItemBinding.inflate(getLayoutInflater());
                                            imageView.logo.setImageBitmap(imageBitmap);
                                            binding.grid.addView(imageView.getRoot());
//                    holder.logo.setTint(ColorStateList.valueOf(R.color.colorPrimary));
                                        } else {
                                            Log.e("J-Purple", "HomeAdapter::onResponse: is not successful with error ={" + response.raw() + "}");
                                        }
                                    }

                                    @Override
                                    public void onFailure(Call<ApiImage> call, Throwable t) {
                                        Log.e("J-Purple", "HomeAdapter::onFailure: ", t);
                                    }
                                };
                                requestForImage.enqueue(onGetImage);
                            }
                        } else {
                            Log.e("J-Purple", "PhotosFragment::onResponse: unsuccessful with error = {" + response.raw() + "}");
                        }
                    }

                    @Override
                    public void onFailure(Call<EcmFilesInfo> call, Throwable t) {
                        Log.e("J-Purple", "PhotosFragment::onFailure: ", t);
                    }
                };
                requestForDocuments.enqueue(onDocumentsRequested);
            }
        });
    }
}
