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

public class UserPostPageFragmentDirections {
  private UserPostPageFragmentDirections() {
  }

  @NonNull
  public static ActionFragmentUserPostPageToEditUserPostPageFragment2 actionFragmentUserPostPageToEditUserPostPageFragment2(
      @NonNull String Name, @Nullable String avatarUrl, @NonNull String Description,
      @NonNull String Price, @NonNull String SellerName, @NonNull String SellerNumber,
      @NonNull String key) {
    return new ActionFragmentUserPostPageToEditUserPostPageFragment2(Name, avatarUrl, Description, Price, SellerName, SellerNumber, key);
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

  @NonNull
  public static NavDirections actionGlobalWeatherFragment() {
    return NavGraphDirections.actionGlobalWeatherFragment();
  }

  public static class ActionFragmentUserPostPageToEditUserPostPageFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionFragmentUserPostPageToEditUserPostPageFragment2(@NonNull String Name,
        @Nullable String avatarUrl, @NonNull String Description, @NonNull String Price,
        @NonNull String SellerName, @NonNull String SellerNumber, @NonNull String key) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      this.arguments.put("avatarUrl", avatarUrl);
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Description", Description);
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Price", Price);
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerName", SellerName);
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerNumber", SellerNumber);
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("key", key);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setName(@NonNull String Name) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setAvatarUrl(
        @Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setDescription(
        @NonNull String Description) {
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Description", Description);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setPrice(@NonNull String Price) {
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Price", Price);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setSellerName(
        @NonNull String SellerName) {
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerName", SellerName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setSellerNumber(
        @NonNull String SellerNumber) {
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerNumber", SellerNumber);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFragmentUserPostPageToEditUserPostPageFragment2 setKey(@NonNull String key) {
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("key", key);
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
      if (arguments.containsKey("avatarUrl")) {
        String avatarUrl = (String) arguments.get("avatarUrl");
        __result.putString("avatarUrl", avatarUrl);
      }
      if (arguments.containsKey("Description")) {
        String Description = (String) arguments.get("Description");
        __result.putString("Description", Description);
      }
      if (arguments.containsKey("Price")) {
        String Price = (String) arguments.get("Price");
        __result.putString("Price", Price);
      }
      if (arguments.containsKey("SellerName")) {
        String SellerName = (String) arguments.get("SellerName");
        __result.putString("SellerName", SellerName);
      }
      if (arguments.containsKey("SellerNumber")) {
        String SellerNumber = (String) arguments.get("SellerNumber");
        __result.putString("SellerNumber", SellerNumber);
      }
      if (arguments.containsKey("key")) {
        String key = (String) arguments.get("key");
        __result.putString("key", key);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_fragment_user_post_page_to_editUserPostPageFragment2;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getName() {
      return (String) arguments.get("Name");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
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
    @NonNull
    public String getSellerName() {
      return (String) arguments.get("SellerName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSellerNumber() {
      return (String) arguments.get("SellerNumber");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getKey() {
      return (String) arguments.get("key");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFragmentUserPostPageToEditUserPostPageFragment2 that = (ActionFragmentUserPostPageToEditUserPostPageFragment2) object;
      if (arguments.containsKey("Name") != that.arguments.containsKey("Name")) {
        return false;
      }
      if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
        return false;
      }
      if (arguments.containsKey("avatarUrl") != that.arguments.containsKey("avatarUrl")) {
        return false;
      }
      if (getAvatarUrl() != null ? !getAvatarUrl().equals(that.getAvatarUrl()) : that.getAvatarUrl() != null) {
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
      if (arguments.containsKey("key") != that.arguments.containsKey("key")) {
        return false;
      }
      if (getKey() != null ? !getKey().equals(that.getKey()) : that.getKey() != null) {
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
      result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
      result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
      result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
      result = 31 * result + (getSellerName() != null ? getSellerName().hashCode() : 0);
      result = 31 * result + (getSellerNumber() != null ? getSellerNumber().hashCode() : 0);
      result = 31 * result + (getKey() != null ? getKey().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFragmentUserPostPageToEditUserPostPageFragment2(actionId=" + getActionId() + "){"
          + "Name=" + getName()
          + ", avatarUrl=" + getAvatarUrl()
          + ", Description=" + getDescription()
          + ", Price=" + getPrice()
          + ", SellerName=" + getSellerName()
          + ", SellerNumber=" + getSellerNumber()
          + ", key=" + getKey()
          + "}";
    }
  }
}
