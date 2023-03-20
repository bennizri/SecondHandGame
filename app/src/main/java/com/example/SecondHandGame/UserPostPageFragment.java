package com.example.SecondHandGame;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.SecondHandGame.databinding.FragmentMyProfileBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;
import com.squareup.picasso.Picasso;

import java.util.List;

// user page
public class UserPostPageFragment extends PostsListFragment {
    FragmentMyProfileBinding binding;
    String email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMyProfileBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // *******get the details of user from firebase *********
        Model.instance().getCurrentUser(currentUser-> {
            email = currentUser.getEmail();
            binding.email.setText(currentUser.email);
            binding.firstName.setText(currentUser.firstName);
            binding.lastName.setText(currentUser.lastName);
            if(currentUser.avatarUrl !="")
                Picasso.get().load(currentUser.avatarUrl).error(R.drawable.game_avatar).into(binding.avatarImg3);
        });

        //**********list *******:
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //set to inflater and data live list
        // adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData());
        binding.recyclerView.setAdapter(adapter);

        //click on recipe (get pos)
        adapter.setOnItemClickListener(new PostRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Log.d("TAG", "Row was clicked " + pos);
                //Post re = viewModel.getData().get(pos);   //save the recipe in line "pos"(int) ;

                // send the arguments to userRecipeFragment
                // ProfileFragmentDirections.ActionProfileToFragmentUserRecipePage action = ProfileFragmentDirections.actionProfileToFragmentUserRecipePage(re.getName(),re.getIngredients(),re.getInstructions(),re.getAvatarUrl());
                // Navigation.findNavController(view).navigate(action);
            }
        });


        return view;
    }


    @Override
    void reloadData(){

        binding.progressBar3.setVisibility(View.VISIBLE); //show loading

        //not live data !!!
        Model.instance().getAllPosts((reList)->{
           // viewModel.getData().removeAll(viewModel.getData());

            adapter.setData((List<Post>) viewModel.getData());
            binding.progressBar3.setVisibility(View.GONE); //remove loading
        });
    }

}