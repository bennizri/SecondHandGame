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

// user page
//public class UserPostPageFragment extends PostsListFragment {
//    FragmentMyProfileBinding binding;
//    String email;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        Log.d("BOB", "enter to userPostPage");
//        adapter = new PostRecyclerAdapter(getLayoutInflater(), new ArrayList<>());
//        binding = FragmentMyProfileBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        // *******get the details of user from firebase *********
//        Model.instance().getCurrentUser(currentUser-> {
//            email = currentUser.getEmail();
//            binding.email.setText(currentUser.email);
//            binding.firstName.setText(currentUser.firstName);
//            binding.lastName.setText(currentUser.lastName);
//            if(!Objects.equals(currentUser.avatarUrl, ""))
//                Picasso.get().load(currentUser.avatarUrl).error(R.drawable.game_avatar).into(binding.avatarImg3);
//        });
//
//        //**********list *******:
//        binding.recyclerView.setHasFixedSize(true);
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        //set to inflater and data live list
//        // adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData());
//        binding.recyclerView.setAdapter(adapter);
//
//        //click on recipe (get pos)
//        adapter.setOnItemClickListener(new PostRecyclerAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int pos) {
//                Log.d("TAG", "Row was clicked111 " + pos);
//                Post re = viewModel.getData().get(pos);   //save the recipe in line "pos"(int) ;
//
//                // send the arguments to userRecipeFragment
//                 ProfileFragmentDirections.ActionProfileToFragmentUserPostPage action = ProfileFragmentDirections.actionProfileToFragmentUserPostPage(re.getName(),re.getPrice(),re.getDescription(),re.getAvatarUrl());
//                 Navigation.findNavController(view).navigate(action);
//            }
//        });
//
//
//        return view;
//    }
//
//
//    @Override
//    void reloadData(){
//
//        binding.progressBar3.setVisibility(View.VISIBLE); //show loading
//
//        //not live data !!!
//        Model.instance().getAllPosts((reList)->{
//           // viewModel.getData().removeAll(viewModel.getData());
//
//            adapter.setData((List<Post>) viewModel.getData());
//            binding.progressBar3.setVisibility(View.GONE); //remove loading
//        });
//    }
//
//}

//public class UserPostPageFragment extends PostFragment {
//
//    FragmentUserPostPageBinding binding;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        binding = FragmentUserPostPageBinding.inflate(inflater,container,false);
//        View view = binding.getRoot();
//        this.getElement();
//
//        avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());
//
//        if (name != null){
//            binding.nameTv.setText(name);
//        }
//        if (description != null){
//            binding.descriptionTv.setText(description);
//        }
//        if (avatarImg.isEmpty() || avatarImg == ""){
//            binding.avatarImg.setImageResource(R.drawable.gamer_avatar);
//        }else{
//            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);
//        }
//
//        binding.postEditBtn.setOnClickListener((view2)->{
//            UserPostPageFragmentDirections.ActionFragmentUserPostPageToEditUserPostPageFragment2 action = UserPostPageFragmentDirections.actionFragmentUserPostPageToEditUserPostPageFragment2(name,price
//                    ,description,avatarImg);
//            Navigation.findNavController(view).navigate(action);
//        });
//
//        binding.backBtn.setOnClickListener((view1)->{
//            Navigation.findNavController(view1).popBackStack();
//        });
//
//        return view;
//    }
//}

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.SecondHandGame.databinding.FragmentUserPostPageBinding;
import com.example.SecondHandGame.model.Model;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class UserPostPageFragment extends PostFragment {

    FragmentUserPostPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentUserPostPageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        this.getElement();

        avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());

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
        if ( avatarImg.isEmpty() ||avatarImg == ""){
            binding.avatarImg.setImageResource(R.drawable.photorecipe);
        }else{
            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);
        }

        binding.postEditBtn.setOnClickListener((view2)->{
            UserPostPageFragmentDirections.ActionFragmentUserPostPageToEditUserPostPageFragment2 action = UserPostPageFragmentDirections.actionFragmentUserPostPageToEditUserPostPageFragment2(name,avatarImg,description,price,sellerName,sellerNumber);
            Navigation.findNavController(view).navigate(action);
        });

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });

        return view;
    }
}