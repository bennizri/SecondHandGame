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

public class UserPostPageFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private UserPostPageFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private UserPostPageFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UserPostPageFragmentArgs fromBundle(@NonNull Bundle bundle) {
    UserPostPageFragmentArgs __result = new UserPostPageFragmentArgs();
    bundle.setClassLoader(UserPostPageFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("Name")) {
      String Name;
      Name = bundle.getString("Name");
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Name", Name);
    } else {
      throw new IllegalArgumentException("Required argument \"Name\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("price")) {
      String price;
      price = bundle.getString("price");
      if (price == null) {
        throw new IllegalArgumentException("Argument \"price\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("price", price);
    } else {
      throw new IllegalArgumentException("Required argument \"price\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("description")) {
      String description;
      description = bundle.getString("description");
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("description", description);
    } else {
      throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("avatarUrl")) {
      String avatarUrl;
      avatarUrl = bundle.getString("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("key")) {
      String key;
      key = bundle.getString("key");
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("key", key);
    } else {
      throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UserPostPageFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    UserPostPageFragmentArgs __result = new UserPostPageFragmentArgs();
    if (savedStateHandle.contains("Name")) {
      String Name;
      Name = savedStateHandle.get("Name");
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Name", Name);
    } else {
      throw new IllegalArgumentException("Required argument \"Name\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("price")) {
      String price;
      price = savedStateHandle.get("price");
      if (price == null) {
        throw new IllegalArgumentException("Argument \"price\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("price", price);
    } else {
      throw new IllegalArgumentException("Required argument \"price\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("description")) {
      String description;
      description = savedStateHandle.get("description");
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("description", description);
    } else {
      throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("avatarUrl")) {
      String avatarUrl;
      avatarUrl = savedStateHandle.get("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("key")) {
      String key;
      key = savedStateHandle.get("key");
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("key", key);
    } else {
      throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getName() {
    return (String) arguments.get("Name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getPrice() {
    return (String) arguments.get("price");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getDescription() {
    return (String) arguments.get("description");
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getAvatarUrl() {
    return (String) arguments.get("avatarUrl");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getKey() {
    return (String) arguments.get("key");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("Name")) {
      String Name = (String) arguments.get("Name");
      __result.putString("Name", Name);
    }
    if (arguments.containsKey("price")) {
      String price = (String) arguments.get("price");
      __result.putString("price", price);
    }
    if (arguments.containsKey("description")) {
      String description = (String) arguments.get("description");
      __result.putString("description", description);
    }
    if (arguments.containsKey("avatarUrl")) {
      String avatarUrl = (String) arguments.get("avatarUrl");
      __result.putString("avatarUrl", avatarUrl);
    }
    if (arguments.containsKey("key")) {
      String key = (String) arguments.get("key");
      __result.putString("key", key);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("Name")) {
      String Name = (String) arguments.get("Name");
      __result.set("Name", Name);
    }
    if (arguments.containsKey("price")) {
      String price = (String) arguments.get("price");
      __result.set("price", price);
    }
    if (arguments.containsKey("description")) {
      String description = (String) arguments.get("description");
      __result.set("description", description);
    }
    if (arguments.containsKey("avatarUrl")) {
      String avatarUrl = (String) arguments.get("avatarUrl");
      __result.set("avatarUrl", avatarUrl);
    }
    if (arguments.containsKey("key")) {
      String key = (String) arguments.get("key");
      __result.set("key", key);
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
    UserPostPageFragmentArgs that = (UserPostPageFragmentArgs) object;
    if (arguments.containsKey("Name") != that.arguments.containsKey("Name")) {
      return false;
    }
    if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
      return false;
    }
    if (arguments.containsKey("price") != that.arguments.containsKey("price")) {
      return false;
    }
    if (getPrice() != null ? !getPrice().equals(that.getPrice()) : that.getPrice() != null) {
      return false;
    }
    if (arguments.containsKey("description") != that.arguments.containsKey("description")) {
      return false;
    }
    if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null) {
      return false;
    }
    if (arguments.containsKey("avatarUrl") != that.arguments.containsKey("avatarUrl")) {
      return false;
    }
    if (getAvatarUrl() != null ? !getAvatarUrl().equals(that.getAvatarUrl()) : that.getAvatarUrl() != null) {
      return false;
    }
    if (arguments.containsKey("key") != that.arguments.containsKey("key")) {
      return false;
    }
    if (getKey() != null ? !getKey().equals(that.getKey()) : that.getKey() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
    result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
    result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
    result = 31 * result + (getKey() != null ? getKey().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UserPostPageFragmentArgs{"
        + "Name=" + getName()
        + ", price=" + getPrice()
        + ", description=" + getDescription()
        + ", avatarUrl=" + getAvatarUrl()
        + ", key=" + getKey()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UserPostPageFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String Name, @NonNull String price, @NonNull String description,
        @Nullable String avatarUrl, @NonNull String key) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      if (price == null) {
        throw new IllegalArgumentException("Argument \"price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("price", price);
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("description", description);
      this.arguments.put("avatarUrl", avatarUrl);
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("key", key);
    }

    @NonNull
    public UserPostPageFragmentArgs build() {
      UserPostPageFragmentArgs result = new UserPostPageFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setName(@NonNull String Name) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPrice(@NonNull String price) {
      if (price == null) {
        throw new IllegalArgumentException("Argument \"price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("price", price);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDescription(@NonNull String description) {
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("description", description);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setAvatarUrl(@Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setKey(@NonNull String key) {
      if (key == null) {
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("key", key);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getName() {
      return (String) arguments.get("Name");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPrice() {
      return (String) arguments.get("price");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getDescription() {
      return (String) arguments.get("description");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getKey() {
      return (String) arguments.get("key");
    }
  }
}
