package com.example.SecondHandGame;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.SecondHandGame.databinding.FragmentMyProfileBinding;
import com.example.SecondHandGame.databinding.FragmentUserPostPageBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class UserPostPageFragment extends PostFragment {
public class UserPostPageFragment extends PostFragment {

    FragmentUserPostPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentUserPostPageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        this.getElement();

       // avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());
        avatarImg = (String)getArguments().get("avatarUrl");
        if (name != null){
            binding.postPostNameTv.setText(name);
        }
        if (description != null){
            binding.descriptionTv.setText(description);
        }
        if (price != null){
            binding.priceTv.setText(price);
        }
        if ( avatarImg.isEmpty() ||avatarImg == ""){
            binding.avatarImg.setImageResource(R.drawable.gamer_icon);
        }else{
            Picasso.get().load(avatarImg).error(R.drawable.gamer_icon).into(binding.avatarImg);
        }

        binding.postEditBtn.setOnClickListener((view2)->{
            UserPostPageFragmentDirections.ActionFragmentUserPostPageToEditUserPostPageFragment2 action = UserPostPageFragmentDirections.actionFragmentUserPostPageToEditUserPostPageFragment2(name,avatarImg,price,description,sellerName,sellerNumber,key);
            Navigation.findNavController(view).navigate(action);
        });

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });

        return view;
    }
}