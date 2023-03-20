package com.example.SecondHandGame;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;

public class BlueFragmentDirections {
  private BlueFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalAddPostFragment() {
    return NavGraphDirections.actionGlobalAddPostFragment();
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
