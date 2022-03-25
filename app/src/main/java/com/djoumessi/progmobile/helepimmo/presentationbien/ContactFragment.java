package com.djoumessi.progmobile.helepimmo.presentationbien;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.djoumessi.progmobile.helepimmo.common.ThirdParty;
import com.djoumessi.progmobile.helepimmo.common.remote.ApiUtil;
import com.djoumessi.progmobile.helepimmo.databinding.ContactProprioBinding;
import com.djoumessi.progmobile.helepimmo.databinding.DescriptionBienBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactFragment extends Fragment {
    private ContactProprioBinding binding;
    private ProductInfoViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = ContactProprioBinding.inflate(inflater, container, false);
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
                Call<ThirdParty> requestForOwner = ApiUtil.getThirdPartyService().getThirdParty(product.getArrayOptions().getOptionsOwner());
                Callback<ThirdParty> onOwnerRequested = new Callback<ThirdParty>() {
                    @Override
                    public void onResponse(Call<ThirdParty> call, Response<ThirdParty> response) {
                        if (response.isSuccessful()){
                            ThirdParty owner = response.body();
                            binding.names.setText(owner != null ? owner.getName() : "non specifie");
                            binding.email.setText(owner != null ? owner.getEmail() : "non specifie");
                            binding.phone.setText(owner != null ? owner.getPhone() : "non specifie");
                            binding.address.setText(owner != null ? owner.getAddress() : "non specifie");
                            binding.details.setText(owner != null ? owner.getUrl() : "non specifie");
                        } else {
                            Log.e("J-Purple", "ContactFragment::onResponse: unsuccessful with error = {"+response.raw()+"}" );
                        }
                    }

                    @Override
                    public void onFailure(Call<ThirdParty> call, Throwable t) {
                        Log.e("J-Purple", "ContactFragment::onFailure: ",t );
                    }
                };
                requestForOwner.enqueue(onOwnerRequested);
            }
        });
    }
}
