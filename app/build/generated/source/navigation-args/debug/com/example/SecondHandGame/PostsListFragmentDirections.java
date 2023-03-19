package com.example.SecondHandGame;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PostsListFragmentDirections {
  private PostsListFragmentDirections() {
  }

  @NonNull
  public static ActionPostsListFragmentToBlueFragment actionPostsListFragmentToBlueFragment(
      @NonNull String blueTitle) {
    return new ActionPostsListFragmentToBlueFragment(blueTitle);
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

  public static class ActionPostsListFragmentToBlueFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionPostsListFragmentToBlueFragment(@NonNull String blueTitle) {
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueTitle", blueTitle);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToBlueFragment setBlueTitle(@NonNull String blueTitle) {
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueTitle", blueTitle);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("blueTitle")) {
        String blueTitle = (String) arguments.get("blueTitle");
        __result.putString("blueTitle", blueTitle);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_postsListFragment_to_blueFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getBlueTitle() {
      return (String) arguments.get("blueTitle");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionPostsListFragmentToBlueFragment that = (ActionPostsListFragmentToBlueFragment) object;
      if (arguments.containsKey("blueTitle") != that.arguments.containsKey("blueTitle")) {
        return false;
      }
      if (getBlueTitle() != null ? !getBlueTitle().equals(that.getBlueTitle()) : that.getBlueTitle() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getBlueTitle() != null ? getBlueTitle().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionPostsListFragmentToBlueFragment(actionId=" + getActionId() + "){"
          + "blueTitle=" + getBlueTitle()
          + "}";
    }
  }
}
