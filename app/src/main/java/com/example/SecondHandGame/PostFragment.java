package com.example.SecondHandGame;

//import static com.example.SecondHandGame.MyApplication.getAppContext;
//import static com.example.SecondHandGame.model.Model.isOnline;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.SecondHandGame.databinding.FragmentPostPageBinding;
import com.squareup.picasso.Picasso;


// post
public class PostFragment extends Fragment {
    String name;
    String description;
    String price;
    String avatarImg;
    FragmentPostPageBinding binding;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //save state
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentPostPageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        //save element argument
        getElement();

        // **********set the details post into ui ***********
        if (name != null){
            binding.nameTv.setText(name);
        }
        if (description != null){
            binding.IngredientsTv.setText(description);
        }
        if (price != null){
            binding.InstructionsTv.setText(price);
        }
        if (avatarImg.isEmpty()){
            binding.avatarImg.setImageResource(R.drawable.game_avatar);

        }else{
            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);
        }

        //******* get the status of like post and set him to ui *********
//        if(isOnline(getAppContext())) {
//            Model.instance().getAllLikes(likes -> {
//                if (likes.contains(title))
//                    binding.like.setChecked(true);
//                else {
//                    binding.like.setChecked(false);
//                }
//            });
//        }

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });

        // *********** when click like or unlike >> update the likes if firebase *****
//        binding.like.setOnClickListener(view1->{
//            Model.instance().saveLike(title);
//        });

        // *************** rest api ***************
        binding.translateBtn.setOnClickListener(view1->{

            //send the name of post to api and get the translate
//            Model.instance().restApi(binding.postTitleTv.getText().toString(), trans->{
//                binding.postTitleTv.setText(trans.toString());
//
//            });
        });
        return view;

    }

    public void getElement() {
        name = PostFragmentArgs.fromBundle(getArguments()).getName();
        description = PostFragmentArgs.fromBundle(getArguments()).getDescription();
        price = PostFragmentArgs.fromBundle(getArguments()).getPrice();
        avatarImg = (PostFragmentArgs.fromBundle(getArguments()).getAvatarUrl());

    }
}