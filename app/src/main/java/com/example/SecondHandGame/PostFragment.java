package com.example.SecondHandGame;

//import static com.example.SecondHandGame.MyApplication.getAppContext;
//import static com.example.SecondHandGame.model.Model.isOnline;

import android.os.Bundle;

import android.util.Log;
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
    String sellerName;
    String sellerNumber;
    String avatarImg;
    FragmentPostPageBinding binding;
    String key;


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
            binding.postPostNameTv.setText(name);
        }
        if (description != null){
            binding.descriptionTv.setText(description);
        }
        if (price != null){
            binding.priceTv.setText(price);
        }

        if (avatarImg.isEmpty()){
            binding.avatarImg.setImageResource(R.drawable.game_avatar);

        }
        else{
            Picasso.get().load(avatarImg).error(R.drawable.game_avatar).into(binding.avatarImg);

        }

        binding.backBtn.setOnClickListener((view1)->{
            Navigation.findNavController(view1).popBackStack();
        });

        return view;

    }

    public void getElement() {

        //Bundle jsonData = getArguments();
        name = (String)getArguments().get("Name");
        key= (String) getArguments().get("key");
        description = (String)getArguments().get("Description");
        if(description == null)
            description = (String)getArguments().get("description");
        price = (String)getArguments().get("Price");
        if(price == null)
            price = (String)getArguments().get("price");
        avatarImg = (String)getArguments().get("avatarUrl");
        sellerName = "Ben";
        sellerNumber = "123";

    }
}