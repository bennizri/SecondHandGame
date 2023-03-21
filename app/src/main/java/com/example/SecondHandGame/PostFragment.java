package com.example.SecondHandGame;

//import static com.example.SecondHandGame.MyApplication.getAppContext;
//import static com.example.SecondHandGame.model.Model.isOnline;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.SecondHandGame.databinding.FragmentPostPageBinding;
import com.squareup.picasso.Picasso;


// post
public class PostFragment extends Fragment {
    String name;
    String description;
    String price;
    String sellerName;
    String sellerNumber;
    String avatarImg;
    FragmentPostPageBinding binding;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //save state
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentPostPageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        //save element argument
        getElement();

        // **********set the details post into ui ***********
        if (name != null){
            binding.postPostNameTv.setText(name);
        }
        if (description != null){
            binding.descriptionTv.setText(description);
        }
        if (price != null){
            binding.priceTv.setText(price);
        }

        if (sellerName != null){
            binding.SellerNameTv.setText(sellerName);
        }

        if (sellerNumber != null){
            binding.SellerNumberTv.setText(sellerNumber);
        }
        if (avatarImg.isEmpty()){
            binding.avatarImg.setImageResource(R.drawable.game_avatar);

        }
        else{
            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);

        }

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });

        return view;

    }

    public void getElement() {

        //Bundle jsonData = getArguments();
        name = (String)getArguments().get("Name");
        description = (String)getArguments().get("description");
        price = (String)getArguments().get("price");
        avatarImg = (String)getArguments().get("avatarUrl");
        //name = PostFragmentArgs.fromBundle(getArguments()).getName();
        //email = PostFragmentArgs.fromBundle(getArguments()).getEmail();
       //description = PostFragmentArgs.fromBundle(getArguments()).getDescription();

        //price = PostFragmentArgs.fromBundle(getArguments()).getPrice();
        //sellerName=PostFragmentArgs.fromBundle(getArguments()).getSellerName();
        //sellerNumber=PostFragmentArgs.fromBundle(getArguments()).getSellerNumber();
        //avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());

    }
}