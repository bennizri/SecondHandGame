// Generated by view binder compiler. Do not edit!
package com.example.SecondHandGame.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.SecondHandGame.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView avatarImg3;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView firstName;

  @NonNull
  public final TextView lastName;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ProgressBar progressBar3;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentMyProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView avatarImg3, @NonNull TextView email, @NonNull TextView firstName,
      @NonNull TextView lastName, @NonNull LinearLayout linearLayout,
      @NonNull ProgressBar progressBar3, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.avatarImg3 = avatarImg3;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.linearLayout = linearLayout;
    this.progressBar3 = progressBar3;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarImg3;
      ImageView avatarImg3 = ViewBindings.findChildViewById(rootView, id);
      if (avatarImg3 == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.firstName;
      TextView firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.lastName;
      TextView lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.progressBar3;
      ProgressBar progressBar3 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar3 == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentMyProfileBinding((ConstraintLayout) rootView, avatarImg3, email, firstName,
          lastName, linearLayout, progressBar3, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
