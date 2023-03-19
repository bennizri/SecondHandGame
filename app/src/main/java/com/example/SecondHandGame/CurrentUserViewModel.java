package com.example.SecondHandGame;

import androidx.lifecycle.ViewModel;

import com.example.SecondHandGame.model.Post;
import com.example.SecondHandGame.model.User;

import java.util.LinkedList;
import java.util.List;


// details of user connected
public class CurrentUserViewModel extends ViewModel {

    private static User user = null;

    public void setUser(User user1) {
        user = user1;
    }

    public User getUser() {
        return user;
    }
}
