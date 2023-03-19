package com.example.SecondHandGame;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class WelcomeFragmentDirections {
  private WelcomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWelcomeFragmentToRecipesListFragment() {
    return new ActionOnlyNavDirections(R.id.action_welcomeFragment_to_RecipesListFragment);
  }

  @NonNull
  public static NavDirections actionGlobalAddPostFragment() {
    return NavGraphDirections.actionGlobalAddPostFragment();
  }

  @NonNull
  public static NavDirections actionGlobalAddStudentFragment() {
    return NavGraphDirections.actionGlobalAddStudentFragment();
  }

  @NonNull
  public static NavDirections actionGlobalLikesFragment() {
    return NavGraphDirections.actionGlobalLikesFragment();
  }

  @NonNull
  public static NavDirections actionGlobalProfile() {
    return NavGraphDirections.actionGlobalProfile();
  }

  @NonNull
  public static NavDirections settingsFragment2() {
    return NavGraphDirections.settingsFragment2();
  }
}
