//package com.example.SecondHandGame.model;
//
//import android.graphics.Bitmap;
//import android.net.Uri;
//
//import androidx.annotation.NonNull;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.Timestamp;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.firestore.DocumentSnapshot;
//import com.google.firebase.firestore.FirebaseFirestore;
//import com.google.firebase.firestore.FirebaseFirestoreSettings;
//import com.google.firebase.firestore.QuerySnapshot;
//import com.google.firebase.firestore.SetOptions;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
//
//import java.io.ByteArrayOutputStream;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.Executor;
//
//public class FirebaseModel{
//    FirebaseFirestore db;
//    FirebaseStorage storage;
//    FirebaseAuth mAuth;
//
//    FirebaseModel(){
//        db = FirebaseFirestore.getInstance();
//        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
//                .setPersistenceEnabled(false)
//                .build();
//        db.setFirestoreSettings(settings);
//        storage = FirebaseStorage.getInstance();
//
//    }
//    public void getAllPosts(Model.Listener<List<Post>> callback ) {
//        db.collection("Posts").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                List<Post> Posts = new LinkedList<>();
//                if(task.isSuccessful()){
//                    QuerySnapshot jsonsList = task.getResult();
//                    for(DocumentSnapshot json: jsonsList){
//                        Post re = Post.fromJson(json.getData());
//                        Posts.add(re);
//
//                    }
//                }
//                callback.onComplete(Posts);
//            }
//        });
//    }
//    public void getAllPostsSince(Long since, Model.Listener<List<Post>> callback){
//        db.collection(Post.COLLECTION)
//                .whereGreaterThanOrEqualTo(Post.LAST_UPDATED, new Timestamp(since,0))
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                List<Post> list = new LinkedList<>();
//                if (task.isSuccessful()){
//                    QuerySnapshot jsonsList = task.getResult();
//                    for (DocumentSnapshot json: jsonsList){
//                        Post st = Post.fromJson(json.getData());
//                        list.add(st);
//                    }
//                }
//                callback.onComplete(list);
//            }
//        });
//    }
//    public void addUser(User us, Model.Listener<Void> listener) {  //add user to firebase
//        db.collection("users").document(us.getEmail()).set(us.toJson()).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                listener.onComplete(null);
//            }
//        });
//
//    }
//
//    public void addPost(Post st, Model.Listener<Void> listener) {
//        db.collection(Post.COLLECTION).document(st.getId()).set(st.toJson())
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                listener.onComplete(null);
//            }
//        });
//    }
//    public void createAccount(String email, String password, Model.Listener<Boolean> listener){
//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                FirebaseUser user = mAuth.getCurrentUser();
//                listener.onComplete(task.isSuccessful());
//
//            }
//        });
//    }
//
//    public void login(String email, String password,Model.Listener<Boolean> listener){ // login user
//        if(!email.isEmpty() && !password.isEmpty()) {
//            mAuth.signInWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            FirebaseUser user = mAuth.getCurrentUser();
//                            listener.onComplete(task.isSuccessful());
//                        }
//                    });
//        }
//    }
//    public void isSignedIn(Model.Listener<Boolean> listener){ //check if the user connected to app
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        if (user != null) {
//            listener.onComplete(true);
//        } else {
//            listener.onComplete(false);
//        }
//
//    }
//    public void getCurrentUser(Model.Listener<User> listener){
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        db.collection("users").document(user.getEmail()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                User us = null;
//                if(task.isSuccessful()){
//                    DocumentSnapshot json = task.getResult();
//                    if(json !=null) {
//                        us = User.fromJson(json.getData());
//                    }
//                }
//                listener.onComplete(us);
//            }
//        });
//    }
//
//    public void logOut(){
//        FirebaseAuth.getInstance().signOut();
//    }
//
//
//
//    void uploadImage(String name, Bitmap bitmap, Model.Listener<String> listener){
//        StorageReference storageRef = storage.getReference();
//        StorageReference imagesRef = storageRef.child("images/" + name + ".jpg");
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
//        byte[] data = baos.toByteArray();
//
//        UploadTask uploadTask = imagesRef.putBytes(data);
//        uploadTask.addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                listener.onComplete(null);
//            }
//        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                imagesRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//                    @Override
//                    public void onSuccess(Uri uri) {
//                        listener.onComplete(uri.toString());
//                    }
//                });
//            }
//        });
//
//    }
//}
package com.example.SecondHandGame.model;

import static com.google.android.material.internal.ContextUtils.getActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.SecondHandGame.MyApplication;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class FirebaseModel {

    FirebaseFirestore db; //user,likes,Posts
    FirebaseStorage storage; // images
    FirebaseAuth mAuth; //users accounts

    FirebaseModel(){
        db = FirebaseFirestore.getInstance();
        FirebaseFirestoreSettings settings = new
                FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(false)
                .build();
        db.setFirestoreSettings(settings);
        storage = FirebaseStorage.getInstance();
        mAuth = FirebaseAuth.getInstance();
    }



    public void getAllPosts(Model.Listener<List<Post>> callback ) {
        db.collection("Posts").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                List<Post> Posts = new LinkedList<>();
                if(task.isSuccessful()){
                    QuerySnapshot jsonsList = task.getResult();
                    for(DocumentSnapshot json: jsonsList){
                        Post re = Post.fromJson(json.getData());
                        Posts.add(re);

                    }
                }
                callback.onComplete(Posts);
            }
        });
    }

    // for cache
    public void getAllPostsSince(Long since, Model.Listener<List<Post>> callback){
        db.collection("recipes")
                .whereGreaterThanOrEqualTo(Post.LAST_UPDATED, new Timestamp(since,0))
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        List<Post> list = new LinkedList<>();
                        if (task.isSuccessful()){
                            QuerySnapshot jsonsList = task.getResult();
                            for (DocumentSnapshot json: jsonsList){
                                Post re = Post.fromJson(json.getData());
                                list.add(re);
                            }
                        }
                        callback.onComplete(list);
                    }
                });
    }


    public void addRecipe(Post re, Model.Listener<Void> listener) { // add recipe to firebase

        db.collection("recipes").document(re.getId()).set(re.toJson()).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                listener.onComplete(null);
            }
        });


    }

    public void addUser(User us, Model.Listener<Void> listener) {  //add user to firebase
        db.collection("users").document(us.getEmail()).set(us.toJson()).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                listener.onComplete(null);
            }
        });

    }

    public void createAccount(String email, String password, Model.Listener<Boolean> listener){
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                FirebaseUser user = mAuth.getCurrentUser();
                listener.onComplete(task.isSuccessful());

            }
        });
    }

    public void login(String email, String password,Model.Listener<Boolean> listener){ // login user
        if(!email.isEmpty() && !password.isEmpty()) {
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            listener.onComplete(task.isSuccessful());
                        }
                    });
        }
    }

    public void updateUser(User us , Model.Listener<Boolean> listener){
        db.collection("users").document(us.getEmail()).set(us.toJson()).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                listener.onComplete(null);
            }
        });
    }

    public void isSignedIn(Model.Listener<Boolean> listener){ //check if the user connected to app
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            listener.onComplete(true);
        } else {
            listener.onComplete(false);
        }

    }


    public void getCurrentUser(Model.Listener<User> listener){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        db.collection("users").document(user.getEmail()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                User us = null;
                if(task.isSuccessful()){
                    DocumentSnapshot json = task.getResult();
                    if(json !=null) {
                        us = User.fromJson(json.getData());
                    }
                }
                listener.onComplete(us);
            }
        });
    }

    public void logOut(){
        FirebaseAuth.getInstance().signOut();
    }

    public void uploadImage(String name, Bitmap bitmap, Model.Listener<String> listener){
        StorageReference storageRef = storage.getReference();
        StorageReference imagesRef = storageRef.child("images/" + name + ".jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] data = baos.toByteArray();

        UploadTask uploadTask = imagesRef.putBytes(data);

        uploadTask.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                listener.onComplete(null);
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                imagesRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        listener.onComplete(uri.toString());
                    }
                });

            }
        });
    }


    public void saveLike(String namePost){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        db.collection("likes").document(user.getEmail()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                DocumentSnapshot json = task.getResult();
                List<String> posts = new ArrayList<>();

                if(!json.contains("post")){
                    posts.add(namePost);
                    Map<String ,List<String>> p = new HashMap<>();
                    p.put("post",posts);
                    db.collection("likes").document(user.getEmail()).set(p);
                }
                else {
                    posts.addAll((List<String>) json.get("post"));
                    if (!posts.contains(namePost)) {
                        posts.add(namePost);
                        Map<String, Object> map = new HashMap<>();
                        map.put("post", posts);
                        db.collection("likes").document(user.getEmail()).set(map);

                    } else {
                        posts.remove(namePost);
                        Map<String, Object> map = new HashMap<>();
                        map.put("post", posts);
                        db.collection("likes").document(user.getEmail()).set(map);
                    }
                }
            }
        });
    }



    public void getLike(Model.Listener<List<String>> listener){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        db.collection("likes").document(user.getEmail()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                DocumentSnapshot json = task.getResult();
                List<String> posts = new LinkedList<>();
                if(json.contains("post")) {
                    posts.addAll((List<String>) json.get("post"));
                }
                listener.onComplete(posts);

            }
        });
    }

}

