package com.example.SecondHandGame;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SecondHandGame.databinding.FragmentAddPostBinding;
import com.example.SecondHandGame.databinding.FragmentEditUserPostPageBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;
import com.squareup.picasso.Picasso;


//for edit recipe user and save (photo recipe, ingredients,instructions )
public class EditUserPostPageFragment extends AddPostFragment {
    String name;
    String description;
    String price;
    String imageString;
    String key;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        binding = FragmentAddPostBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        key=(String)getArguments().get("key");
        getElement();
        Model.instance().getCurrentUser(user -> {
            email = user.getEmail();
        });

        binding.saveBtn.setOnClickListener(view1 -> {
            saveRecipe(view1);
        });


        binding.cancellBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
            Navigation.findNavController(view1).popBackStack();

        });

        binding.cameraButton.setOnClickListener(view1->{
            cameraLauncher.launch(null);
        });
        binding.galleryButton.setOnClickListener(view1->{
            galleryLauncher.launch("image/*");
        });

        return view;
    }

    public void getElement(){

        //set from argument fragment to Strings;
        name = PostFragmentArgs.fromBundle(getArguments()).getName();
        description = PostFragmentArgs.fromBundle(getArguments()).getDescription();
        price = PostFragmentArgs.fromBundle(getArguments()).getPrice();
        imageString = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());

        // set data user in the ui
        if (name != null){
            binding.NameEt.setText(name);
        }
        if (description != null){
            binding.DescriptionEt.setText(description);
        }
        if (price != null){
            binding.PriceEt.setText(price);
        }
        if (imageString.isEmpty() || imageString ==""){
            binding.avatarImg.setImageResource(R.drawable.gamer_avatar);

        }else{
            Picasso.get().load(imageString).error(R.drawable.game_avatar).into(binding.avatarImg);
        }

        binding.NameEt.setEnabled(false);
    }

//    @Override
    public void saveRecipe(View view1) {

        String name = binding.NameEt.getText().toString();
        String description = binding.DescriptionEt.getText().toString();
        String price = binding.PriceEt.getText().toString();
        String id = email;
       //String blabla = String.valueOf(((BitmapDrawable) binding.avatarImg.getDrawable()).getBitmap());

        // create new post object
        Post post = new Post(price,name,description, imageString, false,/*email*/"",key);

        //********** save post image****************
        if (isAvatarSelected || imageString != "") {
            Log.d("tag",post.getKey()+"enter if!!!!!!!!!!!!!!!!");
                binding.avatarImg.setDrawingCacheEnabled(true);
                binding.avatarImg.buildDrawingCache();
                Bitmap bitmap = ((BitmapDrawable) binding.avatarImg.getDrawable()).getBitmap();

                //save the photo in firebase and return the url
                Model.instance().uploadImage(id, bitmap, url -> {
                    if (url != null) {
                        post.setAvatarUrl(url);
                    }

                    Model.instance().editPost(post, (unused) -> {
                        Navigation.findNavController(view1).popBackStack();
                    });
                });

            } else {
                    Log.d("tag",post.getKey()+"enter else!!!!!!!!!!!!!!!!");
                    Model.instance().editPost(post, (unused) -> {
                    Navigation.findNavController(view1).popBackStack();
                });
            }

    }
}