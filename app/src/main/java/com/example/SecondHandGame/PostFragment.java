package com.example.SecondHandGame;

//import static com.example.SecondHandGame.MyApplication.getAppContext;
//import static com.example.SecondHandGame.model.Model.isOnline;

import android.os.Bundle;

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
   // String email;
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
            binding.nameTv.setText(name);
        }
        if (description != null){
            binding.IngredientsTv.setText(description);
        }
        if (price != null){
            binding.priceTv.setText(price);
        }
        if (avatarImg.isEmpty()){
            binding.avatarImg.setImageResource(R.drawable.game_avatar);

        }
        if (sellerName != null){
            binding.SellerNameTv.setText(sellerName);
        }

        if (sellerNumber != null){
            binding.SellerNumberTv.setText(sellerNumber);
        }

        else{
            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);

        }

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });


        // *************** rest api ***************
//        binding.translateBtn.setOnClickListener(view1->{
//
//            //send the name of post to api and get the translate
////            Model.instance().restApi(binding.postTitleTv.getText().toString(), trans->{
////                binding.postTitleTv.setText(trans.toString());
////
////            });
//        });
        return view;

    }

    public void getElement() {
        name = PostFragmentArgs.fromBundle(getArguments()).getName();
        //email = PostFragmentArgs.fromBundle(getArguments()).getEmail();
        description = PostFragmentArgs.fromBundle(getArguments()).getDescription();
        price = PostFragmentArgs.fromBundle(getArguments()).getPrice();
        sellerName=PostFragmentArgs.fromBundle(getArguments()).getSellerName();
        sellerNumber=PostFragmentArgs.fromBundle(getArguments()).getSellerNumber();
        avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());

    }
}