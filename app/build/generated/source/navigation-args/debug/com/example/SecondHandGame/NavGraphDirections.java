package com.example.SecondHandGame;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class NavGraphDirections {
  private NavGraphDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalAddPostFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_addPostFragment);
  }

  @NonNull
  public static NavDirections actionGlobalAddStudentFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_addStudentFragment);
  }

  @NonNull
  public static NavDirections actionGlobalLikesFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_LikesFragment);
  }

  @NonNull
  public static NavDirections actionGlobalProfile() {
    return new ActionOnlyNavDirections(R.id.action_global_Profile);
  }

  @NonNull
  public static NavDirections settingsFragment2() {
    return new ActionOnlyNavDirections(R.id.settingsFragment2);
  }
}
