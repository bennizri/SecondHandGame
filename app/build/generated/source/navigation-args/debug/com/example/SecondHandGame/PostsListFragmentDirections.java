package com.example.SecondHandGame;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
  public static ActionPostsListFragmentToPostFragment actionPostsListFragmentToPostFragment(
      @NonNull String Name, @NonNull String Description, @NonNull String Price,
      @Nullable String avatarUrl) {
    return new ActionPostsListFragmentToPostFragment(Name, Description, Price, avatarUrl);
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

  public static class ActionPostsListFragmentToPostFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionPostsListFragmentToPostFragment(@NonNull String Name, @NonNull String Description,
        @NonNull String Price, @Nullable String avatarUrl) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Description", Description);
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Price", Price);
      this.arguments.put("avatarUrl", avatarUrl);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setName(@NonNull String Name) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setDescription(@NonNull String Description) {
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Description", Description);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setPrice(@NonNull String Price) {
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Price", Price);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setAvatarUrl(@Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("Name")) {
        String Name = (String) arguments.get("Name");
        __result.putString("Name", Name);
      }
      if (arguments.containsKey("Description")) {
        String Description = (String) arguments.get("Description");
        __result.putString("Description", Description);
      }
      if (arguments.containsKey("Price")) {
        String Price = (String) arguments.get("Price");
        __result.putString("Price", Price);
      }
      if (arguments.containsKey("avatarUrl")) {
        String avatarUrl = (String) arguments.get("avatarUrl");
        __result.putString("avatarUrl", avatarUrl);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_postsListFragment_to_postFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getName() {
      return (String) arguments.get("Name");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDescription() {
      return (String) arguments.get("Description");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPrice() {
      return (String) arguments.get("Price");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionPostsListFragmentToPostFragment that = (ActionPostsListFragmentToPostFragment) object;
      if (arguments.containsKey("Name") != that.arguments.containsKey("Name")) {
        return false;
      }
      if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
        return false;
      }
      if (arguments.containsKey("Description") != that.arguments.containsKey("Description")) {
        return false;
      }
      if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null) {
        return false;
      }
      if (arguments.containsKey("Price") != that.arguments.containsKey("Price")) {
        return false;
      }
      if (getPrice() != null ? !getPrice().equals(that.getPrice()) : that.getPrice() != null) {
        return false;
      }
      if (arguments.containsKey("avatarUrl") != that.arguments.containsKey("avatarUrl")) {
        return false;
      }
      if (getAvatarUrl() != null ? !getAvatarUrl().equals(that.getAvatarUrl()) : that.getAvatarUrl() != null) {
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
      result = 31 * result + (getName() != null ? getName().hashCode() : 0);
      result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
      result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
      result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionPostsListFragmentToPostFragment(actionId=" + getActionId() + "){"
          + "Name=" + getName()
          + ", Description=" + getDescription()
          + ", Price=" + getPrice()
          + ", avatarUrl=" + getAvatarUrl()
          + "}";
    }
  }
}
