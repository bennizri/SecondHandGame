//package com.example.SecondHandGame;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.lifecycle.LifecycleOwner;
//import androidx.lifecycle.LiveData;
//import androidx.navigation.NavDirections;
//import androidx.navigation.Navigation;
//import androidx.recyclerview.widget.LinearLayoutManager;
//
//import com.example.SecondHandGame.databinding.FragmentMyProfileBinding;
//import com.example.SecondHandGame.model.Model;
//import com.example.SecondHandGame.model.Movie;
//import com.example.SecondHandGame.model.MovieModel;
//import com.example.SecondHandGame.model.Post;
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class ProfileFragment extends PostsListFragment {
//    FragmentMyProfileBinding binding;
//    String email;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        binding = FragmentMyProfileBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        Model.instance().getCurrentUser(currentUser-> {
//            email = currentUser.getEmail();
//            binding.firstName.setText(currentUser.getFirstName());
//            binding.lastName.setText(currentUser.getLastName());
//            if(currentUser.avatarUrl !="")
//                Picasso.get().load(currentUser.avatarUrl).error(R.drawable.game_avatar).into(binding.avatarImg3);
//        });
//
//        binding.recyclerView.setHasFixedSize(true);
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData());
//        binding.recyclerView.setAdapter(adapter);
//
//        adapter.setOnItemClickListener(new PostRecyclerAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int pos) {
//                Log.d("TAG", "Row was clicked " + pos);
//                Post st = Objects.requireNonNull(viewModel.getData().get(pos));
//            }
//        });
//
//
//        // binding.progressBar.setVisibility(View.GONE);
//
//
////        viewModel.getLiveData().observe(getViewLifecycleOwner(),list->{
////            adapter.setData(list);
////        });
////
//        return view;
//    }
//
//
//    @Override
//    void reloadData() {
//        //binding.progressBar3.setVisibility(View.VISIBLE);
//        List<Post> list = new ArrayList<>();
//        Model.instance().getAllPosts((re)->{
//            viewModel.getData().removeAll(viewModel.getData());
//            Log.d("FUCKK" , "!!!!!!!!!!!!!!!!!" +email );
//            for(Post post: re){
//                Log.d("FUCKK" , "######################" +post.getEmail() );
//                if(post.getEmail().equals(email)){
//                    viewModel.getData().add(post);
//                }
//            }
//            adapter.setData(viewModel.getData());
//            //binding.progressBar3.setVisibility(View.GONE);
//        });
//    }
//
//}

package com.example.SecondHandGame;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.SecondHandGame.databinding.FragmentMyProfileBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ProfileFragment extends PostsListFragment {
    FragmentMyProfileBinding binding;
    String email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMyProfileBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // get the details of user from firebase
        Model.instance().getCurrentUser(currentUser-> {
            email = currentUser.getFirstName();
            binding.email.setText(currentUser.email);
            binding.firstName.setText(currentUser.firstName);
            binding.lastName.setText(currentUser.lastName);
            if(!Objects.equals(currentUser.avatarUrl, ""))
                Picasso.get().load(currentUser.avatarUrl).error(R.drawable.game_avatar).into(binding.avatarImg3);
        });

        // list
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // set to inflater and data live list
        adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData());
        binding.recyclerView.setAdapter(adapter);

        // click on post (get pos)
        adapter.setOnItemClickListener(new PostRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Log.d("TAG", "Row was clicked33333 " + pos);
                Post post = viewModel.getData().get(pos);   // save the post in line "pos"(int) ;

                // send the arguments to userPostFragment
//                ProfileFragmentDirections.ActionProfileFragmentToEditUserPostPageFragment action = ProfileFragmentDirections.actionProfileFragmentToEditUserPostPageFragment(post.getName(),post.getPrice(),post.getDescription(),post.getAvatarUrl());
//                Navigation.findNavController(view).navigate(action);

                ProfileFragmentDirections.ActionProfileToFragmentUserPostPage action = ProfileFragmentDirections.actionProfileToFragmentUserPostPage(post.getName(),post.getDescription(),post.getPrice(),post.getAvatarUrl());
                Navigation.findNavController(view).navigate(action);
            }
        });

        return view;
    }

    @Override
    void reloadData() {
       // Log.d("test1",email);
        binding.progressBar3.setVisibility(View.VISIBLE);
        Model.instance().getAllPosts((postList)-> {
            binding.progressBar3.setVisibility(View.GONE);
            viewModel.getData().removeAll(viewModel.getData());
            for(Post post : postList) {
                //Log.d("test1",email);
                if(post.sellerName.equals(email)) {
                    //Log.d("test2",post.sellerName);
                    viewModel.getData().add(post);
                }
            }
            adapter.setData(viewModel.getData());
        });

    }

}