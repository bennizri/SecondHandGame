// Generated by view binder compiler. Do not edit!
package com.example.SecondHandGame.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.SecondHandGame.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView avatarImg2;

  @NonNull
  public final TextInputLayout blabla;

  @NonNull
  public final ImageButton camerabutton;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final TextInputEditText firstName;

  @NonNull
  public final ImageButton gallerybutton;

  @NonNull
  public final TextInputEditText lastName;

  @NonNull
  public final Button saveBtnUser;

  @NonNull
  public final ScrollView scrollView2;

  private FragmentEditUserBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView avatarImg2,
      @NonNull TextInputLayout blabla, @NonNull ImageButton camerabutton,
      @NonNull TextInputEditText email, @NonNull TextInputEditText firstName,
      @NonNull ImageButton gallerybutton, @NonNull TextInputEditText lastName,
      @NonNull Button saveBtnUser, @NonNull ScrollView scrollView2) {
    this.rootView = rootView;
    this.avatarImg2 = avatarImg2;
    this.blabla = blabla;
    this.camerabutton = camerabutton;
    this.email = email;
    this.firstName = firstName;
    this.gallerybutton = gallerybutton;
    this.lastName = lastName;
    this.saveBtnUser = saveBtnUser;
    this.scrollView2 = scrollView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarImg2;
      ImageView avatarImg2 = ViewBindings.findChildViewById(rootView, id);
      if (avatarImg2 == null) {
        break missingId;
      }

      id = R.id.blabla;
      TextInputLayout blabla = ViewBindings.findChildViewById(rootView, id);
      if (blabla == null) {
        break missingId;
      }

      id = R.id.camerabutton;
      ImageButton camerabutton = ViewBindings.findChildViewById(rootView, id);
      if (camerabutton == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.first_name;
      TextInputEditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.gallerybutton;
      ImageButton gallerybutton = ViewBindings.findChildViewById(rootView, id);
      if (gallerybutton == null) {
        break missingId;
      }

      id = R.id.last_name;
      TextInputEditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.saveBtnUser;
      Button saveBtnUser = ViewBindings.findChildViewById(rootView, id);
      if (saveBtnUser == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      return new FragmentEditUserBinding((ConstraintLayout) rootView, avatarImg2, blabla,
          camerabutton, email, firstName, gallerybutton, lastName, saveBtnUser, scrollView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}