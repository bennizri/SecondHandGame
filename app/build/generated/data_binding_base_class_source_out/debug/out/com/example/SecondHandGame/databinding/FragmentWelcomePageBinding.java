// Generated by view binder compiler. Do not edit!
package com.example.SecondHandGame.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
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

public final class FragmentWelcomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView avatarImg2;

  @NonNull
  public final TextInputLayout blabla;

  @NonNull
  public final ImageButton camerabutton;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextInputEditText email1;

  @NonNull
  public final TextInputEditText emailEt;

  @NonNull
  public final TextInputEditText firstName;

  @NonNull
  public final ImageButton gallerybutton;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextInputEditText lastName;

  @NonNull
  public final Button login;

  @NonNull
  public final TextView pass;

  @NonNull
  public final TextInputEditText passEt;

  @NonNull
  public final TextInputEditText password1;

  @NonNull
  public final TextView registerTv2;

  @NonNull
  public final Button saveBtnUser;

  @NonNull
  public final ImageView scroll;

  @NonNull
  public final ScrollView scrollWelcome;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView welcome;

  @NonNull
  public final TextView wrong1;

  private FragmentWelcomePageBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView avatarImg2, @NonNull TextInputLayout blabla,
      @NonNull ImageButton camerabutton, @NonNull TextView email, @NonNull TextInputEditText email1,
      @NonNull TextInputEditText emailEt, @NonNull TextInputEditText firstName,
      @NonNull ImageButton gallerybutton, @NonNull ImageView imageView2,
      @NonNull TextInputEditText lastName, @NonNull Button login, @NonNull TextView pass,
      @NonNull TextInputEditText passEt, @NonNull TextInputEditText password1,
      @NonNull TextView registerTv2, @NonNull Button saveBtnUser, @NonNull ImageView scroll,
      @NonNull ScrollView scrollWelcome, @NonNull TextView textView, @NonNull TextView textView4,
      @NonNull TextView welcome, @NonNull TextView wrong1) {
    this.rootView = rootView;
    this.avatarImg2 = avatarImg2;
    this.blabla = blabla;
    this.camerabutton = camerabutton;
    this.email = email;
    this.email1 = email1;
    this.emailEt = emailEt;
    this.firstName = firstName;
    this.gallerybutton = gallerybutton;
    this.imageView2 = imageView2;
    this.lastName = lastName;
    this.login = login;
    this.pass = pass;
    this.passEt = passEt;
    this.password1 = password1;
    this.registerTv2 = registerTv2;
    this.saveBtnUser = saveBtnUser;
    this.scroll = scroll;
    this.scrollWelcome = scrollWelcome;
    this.textView = textView;
    this.textView4 = textView4;
    this.welcome = welcome;
    this.wrong1 = wrong1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWelcomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWelcomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_welcome_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWelcomePageBinding bind(@NonNull View rootView) {
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
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.email1;
      TextInputEditText email1 = ViewBindings.findChildViewById(rootView, id);
      if (email1 == null) {
        break missingId;
      }

      id = R.id.emailEt;
      TextInputEditText emailEt = ViewBindings.findChildViewById(rootView, id);
      if (emailEt == null) {
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

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.last_name;
      TextInputEditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.pass;
      TextView pass = ViewBindings.findChildViewById(rootView, id);
      if (pass == null) {
        break missingId;
      }

      id = R.id.passEt;
      TextInputEditText passEt = ViewBindings.findChildViewById(rootView, id);
      if (passEt == null) {
        break missingId;
      }

      id = R.id.password1;
      TextInputEditText password1 = ViewBindings.findChildViewById(rootView, id);
      if (password1 == null) {
        break missingId;
      }

      id = R.id.register_tv2;
      TextView registerTv2 = ViewBindings.findChildViewById(rootView, id);
      if (registerTv2 == null) {
        break missingId;
      }

      id = R.id.saveBtnUser;
      Button saveBtnUser = ViewBindings.findChildViewById(rootView, id);
      if (saveBtnUser == null) {
        break missingId;
      }

      id = R.id.scroll;
      ImageView scroll = ViewBindings.findChildViewById(rootView, id);
      if (scroll == null) {
        break missingId;
      }

      id = R.id.scrollWelcome;
      ScrollView scrollWelcome = ViewBindings.findChildViewById(rootView, id);
      if (scrollWelcome == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.welcome;
      TextView welcome = ViewBindings.findChildViewById(rootView, id);
      if (welcome == null) {
        break missingId;
      }

      id = R.id.wrong1;
      TextView wrong1 = ViewBindings.findChildViewById(rootView, id);
      if (wrong1 == null) {
        break missingId;
      }

      return new FragmentWelcomePageBinding((ConstraintLayout) rootView, avatarImg2, blabla,
          camerabutton, email, email1, emailEt, firstName, gallerybutton, imageView2, lastName,
          login, pass, passEt, password1, registerTv2, saveBtnUser, scroll, scrollWelcome, textView,
          textView4, welcome, wrong1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
