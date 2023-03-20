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
  public static ActionPostsListFragmentToPostFragment actionPostsListFragmentToPostFragment(
      @NonNull String Name, @NonNull String Description, @NonNull String Price,
      @Nullable String avatarUrl, @NonNull String SellerName, @NonNull String SellerNumber) {
    return new ActionPostsListFragmentToPostFragment(Name, Description, Price, avatarUrl, SellerName, SellerNumber);
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

  public static class ActionPostsListFragmentToPostFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionPostsListFragmentToPostFragment(@NonNull String Name, @NonNull String Description,
        @NonNull String Price, @Nullable String avatarUrl, @NonNull String SellerName,
        @NonNull String SellerNumber) {
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
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerName", SellerName);
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerNumber", SellerNumber);
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

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setSellerName(@NonNull String SellerName) {
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerName", SellerName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPostsListFragmentToPostFragment setSellerNumber(@NonNull String SellerNumber) {
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerNumber", SellerNumber);
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
      if (arguments.containsKey("SellerName")) {
        String SellerName = (String) arguments.get("SellerName");
        __result.putString("SellerName", SellerName);
      }
      if (arguments.containsKey("SellerNumber")) {
        String SellerNumber = (String) arguments.get("SellerNumber");
        __result.putString("SellerNumber", SellerNumber);
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

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSellerName() {
      return (String) arguments.get("SellerName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSellerNumber() {
      return (String) arguments.get("SellerNumber");
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
      if (arguments.containsKey("SellerName") != that.arguments.containsKey("SellerName")) {
        return false;
      }
      if (getSellerName() != null ? !getSellerName().equals(that.getSellerName()) : that.getSellerName() != null) {
        return false;
      }
      if (arguments.containsKey("SellerNumber") != that.arguments.containsKey("SellerNumber")) {
        return false;
      }
      if (getSellerNumber() != null ? !getSellerNumber().equals(that.getSellerNumber()) : that.getSellerNumber() != null) {
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
      result = 31 * result + (getSellerName() != null ? getSellerName().hashCode() : 0);
      result = 31 * result + (getSellerNumber() != null ? getSellerNumber().hashCode() : 0);
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
          + ", SellerName=" + getSellerName()
          + ", SellerNumber=" + getSellerNumber()
          + "}";
    }
  }
}
