package com.example.SecondHandGame;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditUserFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditUserFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private EditUserFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditUserFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditUserFragmentArgs __result = new EditUserFragmentArgs();
    bundle.setClassLoader(EditUserFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("firstName")) {
      String firstName;
      firstName = bundle.getString("firstName");
      if (firstName == null) {
        throw new IllegalArgumentException("Argument \"firstName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("firstName", firstName);
    } else {
      throw new IllegalArgumentException("Required argument \"firstName\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("lastName")) {
      String lastName;
      lastName = bundle.getString("lastName");
      if (lastName == null) {
        throw new IllegalArgumentException("Argument \"lastName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("lastName", lastName);
    } else {
      throw new IllegalArgumentException("Required argument \"lastName\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("email")) {
      String email;
      email = bundle.getString("email");
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("email", email);
    } else {
      throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("avatarUrl")) {
      String avatarUrl;
      avatarUrl = bundle.getString("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditUserFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    EditUserFragmentArgs __result = new EditUserFragmentArgs();
    if (savedStateHandle.contains("firstName")) {
      String firstName;
      firstName = savedStateHandle.get("firstName");
      if (firstName == null) {
        throw new IllegalArgumentException("Argument \"firstName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("firstName", firstName);
    } else {
      throw new IllegalArgumentException("Required argument \"firstName\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("lastName")) {
      String lastName;
      lastName = savedStateHandle.get("lastName");
      if (lastName == null) {
        throw new IllegalArgumentException("Argument \"lastName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("lastName", lastName);
    } else {
      throw new IllegalArgumentException("Required argument \"lastName\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("email")) {
      String email;
      email = savedStateHandle.get("email");
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("email", email);
    } else {
      throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("avatarUrl")) {
      String avatarUrl;
      avatarUrl = savedStateHandle.get("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("firstName")) {
      String firstName = (String) arguments.get("firstName");
      __result.set("firstName", firstName);
    }
    if (arguments.containsKey("lastName")) {
      String lastName = (String) arguments.get("lastName");
      __result.set("lastName", lastName);
    }
    if (arguments.containsKey("email")) {
      String email = (String) arguments.get("email");
      __result.set("email", email);
    }
    if (arguments.containsKey("avatarUrl")) {
      String avatarUrl = (String) arguments.get("avatarUrl");
      __result.set("avatarUrl", avatarUrl);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditUserFragmentArgs that = (EditUserFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
    result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
    result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
    result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditUserFragmentArgs{"
        + "firstName=" + getFirstName()
        + ", lastName=" + getLastName()
        + ", email=" + getEmail()
        + ", avatarUrl=" + getAvatarUrl()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull EditUserFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String firstName, @NonNull String lastName, @NonNull String email,
        @Nullable String avatarUrl) {
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
    public EditUserFragmentArgs build() {
      EditUserFragmentArgs result = new EditUserFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFirstName(@NonNull String firstName) {
      if (firstName == null) {
        throw new IllegalArgumentException("Argument \"firstName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("firstName", firstName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setLastName(@NonNull String lastName) {
      if (lastName == null) {
        throw new IllegalArgumentException("Argument \"lastName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("lastName", lastName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setAvatarUrl(@Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getFirstName() {
      return (String) arguments.get("firstName");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getLastName() {
      return (String) arguments.get("lastName");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getEmail() {
      return (String) arguments.get("email");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
    }
  }
}
