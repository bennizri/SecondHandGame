package com.example.SecondHandGame;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SecondHandGame.databinding.FragmentSettingsBinding;
import com.example.SecondHandGame.model.Model;
import com.example.SecondHandGame.model.User;


public class SettingsFragment extends Fragment {
    FragmentSettingsBinding binding;
    User us;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        //save connect user
        Model.instance().getCurrentUser(user->{
           us=user;
        });

        binding.editProfile.setOnClickListener(view1->{
            //send the details of the user to editUserFragment
            Navigation.findNavController(view).navigate(SettingsFragmentDirections.actionSettingsFragmentToEditUserFragment(us.firstName,us.lastName,us.email,us.avatarUrl));
        });


        binding.logout.setOnClickListener(view1 ->{
            Navigation.findNavController(view).popBackStack(); //back
            Navigation.findNavController(view).popBackStack(); //back

            //move to main Activity
            Intent i = new Intent(getActivity(), LoginPage.class);
            startActivity(i); // start login activity

            getActivity().finish(); //close the currect activity (main activity)

        });

        return view;

    }

}