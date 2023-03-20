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

public class SettingsFragmentDirections {
  private SettingsFragmentDirections() {
  }

  @NonNull
  public static ActionSettingsFragmentToEditUserFragment actionSettingsFragmentToEditUserFragment(
      @NonNull String firstName, @NonNull String lastName, @NonNull String email,
      @Nullable String avatarUrl) {
    return new ActionSettingsFragmentToEditUserFragment(firstName, lastName, email, avatarUrl);
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

  public static class ActionSettingsFragmentToEditUserFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSettingsFragmentToEditUserFragment(@NonNull String firstName,
        @NonNull String lastName, @NonNull String email, @Nullable String avatarUrl) {
      if (firstName == null) {
        throw new IllegalArgumentException("Argument \"firstName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("firstName", firstName);
      if (lastName == null) {
        throw new IllegalArgumentException("Argument \"lastName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("lastName", lastName);
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      this.arguments.put("avatarUrl", avatarUrl);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSettingsFragmentToEditUserFragment setFirstName(@NonNull String firstName) {
      if (firstName == null) {
        throw new IllegalArgumentException("Argument \"firstName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("firstName", firstName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSettingsFragmentToEditUserFragment setLastName(@NonNull String lastName) {
      if (lastName == null) {
        throw new IllegalArgumentException("Argument \"lastName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("lastName", lastName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSettingsFragmentToEditUserFragment setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSettingsFragmentToEditUserFragment setAvatarUrl(@Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("firstName")) {
        String firstName = (String) arguments.get("firstName");
        __result.putString("firstName", firstName);
      }
      if (arguments.containsKey("lastName")) {
        String lastName = (String) arguments.get("lastName");
        __result.putString("lastName", lastName);
      }
      if (arguments.containsKey("email")) {
        String email = (String) arguments.get("email");
        __result.putString("email", email);
      }
      if (arguments.containsKey("avatarUrl")) {
        String avatarUrl = (String) arguments.get("avatarUrl");
        __result.putString("avatarUrl", avatarUrl);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_settingsFragment_to_editUserFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFirstName() {
      return (String) arguments.get("firstName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLastName() {
      return (String) arguments.get("lastName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getEmail() {
      return (String) arguments.get("email");
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
      ActionSettingsFragmentToEditUserFragment that = (ActionSettingsFragmentToEditUserFragment) object;
      if (arguments.containsKey("firstName") != that.arguments.containsKey("firstName")) {
        return false;
      }
      if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null) {
        return false;
      }
      if (arguments.containsKey("lastName") != that.arguments.containsKey("lastName")) {
        return false;
      }
      if (getLastName() != null ? !getLastName().equals(that.getLastName()) : that.getLastName() != null) {
        return false;
      }
      if (arguments.containsKey("email") != that.arguments.containsKey("email")) {
        return false;
      }
      if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) {
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
      result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
      result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
      result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
      result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSettingsFragmentToEditUserFragment(actionId=" + getActionId() + "){"
          + "firstName=" + getFirstName()
          + ", lastName=" + getLastName()
          + ", email=" + getEmail()
          + ", avatarUrl=" + getAvatarUrl()
          + "}";
    }
  }
}
