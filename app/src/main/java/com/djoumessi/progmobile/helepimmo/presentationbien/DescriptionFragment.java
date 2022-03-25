package com.djoumessi.progmobile.helepimmo.presentationbien;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.djoumessi.progmobile.helepimmo.databinding.DescriptionBienBinding;

public class DescriptionFragment extends Fragment {
    private DescriptionBienBinding binding;
    private ProductInfoViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DescriptionBienBinding.inflate(inflater, container, false);
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
            if (product!=null){
                binding.area.setText(product.getSurface());
                binding.price.setText(product.getPrice().substring(0,product.getPrice().indexOf(".")));
                binding.description.setText(product.getDescription());
            }
        });
    }
}
