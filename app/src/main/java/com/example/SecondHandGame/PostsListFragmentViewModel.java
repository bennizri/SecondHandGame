package com.example.SecondHandGame;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.Post;

import java.util.LinkedList;
import java.util.List;

public class PostsListFragmentViewModel extends ViewModel {
   // private LiveData<List<Post>> data = Model.instance().getAllPosts();

  //  LiveData<List<Post>> getData(){
    //    return data;
    //}
  private List<Post> data = new LinkedList<>();  //list recipes - for display data that not in cache (likes, user recipes)

    private LiveData<List<Post>> liveData = Model.instance().getAllPostsNew(); //cache recipes = livedata

    List<Post> getData(){
        return data;
    }

    LiveData<List<Post>> getLiveData(){
        return liveData;
    }



}
