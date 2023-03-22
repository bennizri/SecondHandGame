package com.example.SecondHandGame.model;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.SecondHandGame.MyApplication;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FieldValue;

import java.util.HashMap;
import java.util.Map;

@Entity
public class Post {
    @PrimaryKey
    @NonNull
    public String key = "";
    public String name="";
    public String price="";

    public String email="";
    public String description="";
    public String avatarUrl="";
    public Boolean cb=false;
    public Long lastUpdated;

    public Post(){
    }
    public Post(String price, String name,String description, String avatarUrl, Boolean cb,String email,String key) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.avatarUrl = avatarUrl;
        this.cb = cb;
        this.email = email;
        this.key=key;
    }

    static final String NAME = "name";
    static final String KEY ="key";
    static final String DESCRIPTION = "description";
    static final String PRICE = "price";
    static final String EMAIL = "email";
    static final String AVATAR = "avatar";
    static final String CB = "cb";
    static final String COLLECTION = "posts";
    static final String LAST_UPDATED = "lastUpdated";
    static final String LOCAL_LAST_UPDATED = "posts_local_last_update";

    public static Post fromJson(Map<String,Object> json){
        String price = (String)json.get(PRICE);
        String name = (String)json.get(NAME);
        String description = (String)json.get(DESCRIPTION);
        String avatar = (String)json.get(AVATAR);
        Boolean cb = (Boolean) json.get(CB);
        String email = (String)json.get(EMAIL);
        String key = (String)json.get(KEY);
        Post st = new Post(price,name,description,avatar,cb,email,key);
        try{
            Timestamp time = (Timestamp) json.get(LAST_UPDATED);
            st.setLastUpdated(time.getSeconds());
        }catch(Exception e){

        }
        return st;
    }

    public static Long getLocalLastUpdate() {
        SharedPreferences sharedPref = MyApplication.getAppContext().getSharedPreferences("TAG", Context.MODE_PRIVATE);
        return sharedPref.getLong(LOCAL_LAST_UPDATED, 0);
    }

    public static void setLocalLastUpdate(Long time) {
        SharedPreferences sharedPref = MyApplication.getAppContext().getSharedPreferences("TAG", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong(LOCAL_LAST_UPDATED,time);
        editor.commit();
    }



    public Map<String,Object> toJson(){
        Map<String, Object> json = new HashMap<>();
        json.put(PRICE, getPrice());
        json.put(DESCRIPTION, getDescription());
        json.put(NAME, getName());
        json.put(AVATAR, getAvatarUrl());
        json.put(CB, getCb());
        json.put(EMAIL, getEmail());
        json.put(KEY, getKey());
        json.put(LAST_UPDATED, FieldValue.serverTimestamp());
        return json;
    }



    public String getKey() {
        return key;
    }

    public void setKey( String key) {
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPrice( String price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }


    public String getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Boolean getCb() {
        return cb;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
