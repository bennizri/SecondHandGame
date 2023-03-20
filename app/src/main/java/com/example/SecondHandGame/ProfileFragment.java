package com.example.SecondHandGame;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.SecondHandGame.databinding.FragmentMyProfileBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Movie;
import com.example.SecondHandGame.model.MovieModel;
import com.example.SecondHandGame.model.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProfileFragment extends PostsListFragment {
    FragmentMyProfileBinding binding;
    String name;

//        FragmentPostsListBinding binding;
//    PostRecyclerAdapter adapter;
//    PostsListFragmentViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMyProfileBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new PostRecyclerAdapter(getLayoutInflater(),viewModel.getData().getValue());
        binding.recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new PostRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Log.d("TAG", "Row was clicked " + pos);
                Post st = Objects.requireNonNull(viewModel.getData().getValue()).get(pos);
//                PostsListFragmentDirections. action = PostsListFragmentDirections.actionPostsListFragmentToBlueFragment(st.name);
                Navigation.findNavController(view).navigate(PostsListFragmentDirections.actionPostsListFragmentToBlueFragment(st.name));
            }
        });

        View addButton = view.findViewById(R.id.btnAdd);
        NavDirections action = PostsListFragmentDirections.actionGlobalAddPostFragment();
        addButton.setOnClickListener(Navigation.createNavigateOnClickListener(action));

        View profileButton = view.findViewById(R.id.ProfileFragment);
        NavDirections action1 = PostsListFragmentDirections.actionGlobalProfile();
        profileButton.setOnClickListener(Navigation.createNavigateOnClickListener(action1));


        // binding.progressBar.setVisibility(View.GONE);

        viewModel.getData().observe(getViewLifecycleOwner(),list->{
            adapter.setData(list);
        });

        Model.instance().EventPostsListLoadingState.observe(getViewLifecycleOwner(),status->{
            binding.swipeRefresh.setRefreshing(status == Model.LoadingState.LOADING);
        });

        binding.swipeRefresh.setOnRefreshListener(this::reloadData);

        LiveData<List<Movie>> data = MovieModel.instance.searchMoviesByTitle("avatar");
        data.observe(getViewLifecycleOwner(),list->{
            list.forEach(item->{
                Log.d("TAG","got movie: " + item.getTitle() + " " + item.getPoster());
            });
        });

        return view;
    }

    @Override
    void reloadData() {
        List<Post> myList = new ArrayList<>();
        binding.progressBar3.setVisibility(View.VISIBLE);
        Model.instance().getAllPosts((postList)-> {
            binding.progressBar3.setVisibility(View.GONE);
            viewModel.getData().removeObservers((LifecycleOwner) viewModel.getData());
            for(Post post : postList) {
               if(post.sellerName.equals(name))
                  myList.add(post);
                  // viewModel.getData().add(post);
            }
            adapter.setData(myList);
        });

    }

}