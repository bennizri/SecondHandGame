package com.example.SecondHandGame;

import static com.example.SecondHandGame.MyApplication.getAppContext;
import static com.example.SecondHandGame.model.Model.isOnline;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.SecondHandGame.databinding.FragmentSaveRecipeBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class SaveFragment extends RecipesListFragment {
    FragmentSaveRecipeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaveRecipeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        //*******************************list ********************:
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //set to inflater and data live list
        //adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData());
        binding.recyclerView.setAdapter(adapter);

        //click on recipe (get pos)
//        adapter.setOnItemClickListener(new PostRecyclerAdapter().OnItemClickListener() {
//            @Override
//            public void onItemClick(int pos) {
//                // set the recipe
//                Post re = viewModel.getData().get(pos);
//
//                //send data of recipes to next fragment (RecipeFragment)
//                SaveFragmentDirections.ActionLikesFragmentToRecipeFragment action = SaveFragmentDirections.actionLikesFragmentToRecipeFragment(re.name,re.ingredients,re.instructions,re.avatarUrl);
//                Navigation.findNavController(view).navigate(action);
//            }
//        });
        return view;
    }

    @Override
    void reloadData(){
        binding.progressBar2.setVisibility(View.VISIBLE);

        //get all recipes (not live data)
        Model.instance().getAllRecipes((reList)->{
            //relist = all the recipes in app
            //clear the data list
           // viewModel.getData().removeAll(viewModel.getData());
        });

        binding.progressBar2.setVisibility(View.GONE);

    }
}