package com.example.SecondHandGame;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SecondHandGame.databinding.FragmentRecipeListBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;

import java.util.Collections;
import java.util.Comparator;

public class RecipesListFragment extends Fragment {
    FragmentRecipeListBinding binding;
    //RecipeRecyclerAdapter adapter;
    PostRecyclerAdapter adapter;
    //    RecipeListFragmentViewModel viewModel;
    PostsListFragmentViewModel viewModel;
    CurrentUserViewModel currentUser;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecipeListBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        getActivity().findViewById(R.id.main_bottomNavigationView).setVisibility(View.VISIBLE);

        //**********list *******:
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //set to inflater and data live list
        adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData().getValue());
        binding.recyclerView.setAdapter(adapter);

        //click on recipe (get pos)

        adapter.setOnItemClickListener( new PostRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                // set the recipe
                Post re = viewModel.getData().getValue().get(pos);

                //send data of recipes to next fragment (userRecipePage)
                RecipesListFragmentDirections.ActionRecipesListFragmentToRecipeFragment action = RecipesListFragmentDirections.actionRecipesListFragmentToRecipeFragment(re.getName(),re.getId(),re.getName(),re.getAvatarUrl());
                Navigation.findNavController(view).navigate(action);
            }
        });

//****************************:

        //done loading
        binding.progressBar.setVisibility(View.GONE);

        //refresh >> update loading status
        Model.instance().EventPostsListLoadingState.observe(getViewLifecycleOwner(),status->{
            binding.swipeRefresh.setRefreshing(status == Model.LoadingState.LOADING);
        });


        //update the data list by data live (cache)
        viewModel.getData().observe( getViewLifecycleOwner(),list->{
            //list == cache - update
            Collections.sort(list, Comparator.comparing(Post::getName));  //sort the cache
            adapter.setData(list);   //set cache in the data list
        });

        //update
        binding.swipeRefresh.setOnRefreshListener(()->{
            reloadData();
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        viewModel = new ViewModelProvider(this).get(PostsListFragmentViewModel.class);
        //currentUser = new ViewModelProvider(this).get(CurrentUserViewModel.class);

    }

    @Override
    public void onResume() {
        super.onResume();
        reloadData();
        //list of recipe
    }

    void reloadData(){
        //get recipes by live data !!
        Model.instance().refreshAllPosts();
    }
}