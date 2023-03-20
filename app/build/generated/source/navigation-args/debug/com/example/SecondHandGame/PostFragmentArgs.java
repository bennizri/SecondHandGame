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

public class PostFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PostFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PostFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PostFragmentArgs __result = new PostFragmentArgs();
    bundle.setClassLoader(PostFragmentArgs.class.getClassLoader());
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
    if (bundle.containsKey("Description")) {
      String Description;
      Description = bundle.getString("Description");
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Description", Description);
    } else {
      throw new IllegalArgumentException("Required argument \"Description\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("Price")) {
      String Price;
      Price = bundle.getString("Price");
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Price", Price);
    } else {
      throw new IllegalArgumentException("Required argument \"Price\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("avatarUrl")) {
      String avatarUrl;
      avatarUrl = bundle.getString("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("SellerName")) {
      String SellerName;
      SellerName = bundle.getString("SellerName");
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SellerName", SellerName);
    } else {
      throw new IllegalArgumentException("Required argument \"SellerName\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("SellerNumber")) {
      String SellerNumber;
      SellerNumber = bundle.getString("SellerNumber");
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SellerNumber", SellerNumber);
    } else {
      throw new IllegalArgumentException("Required argument \"SellerNumber\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    PostFragmentArgs __result = new PostFragmentArgs();
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
    if (savedStateHandle.contains("Description")) {
      String Description;
      Description = savedStateHandle.get("Description");
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Description", Description);
    } else {
      throw new IllegalArgumentException("Required argument \"Description\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("Price")) {
      String Price;
      Price = savedStateHandle.get("Price");
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Price", Price);
    } else {
      throw new IllegalArgumentException("Required argument \"Price\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("avatarUrl")) {
      String avatarUrl;
      avatarUrl = savedStateHandle.get("avatarUrl");
      __result.arguments.put("avatarUrl", avatarUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("SellerName")) {
      String SellerName;
      SellerName = savedStateHandle.get("SellerName");
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SellerName", SellerName);
    } else {
      throw new IllegalArgumentException("Required argument \"SellerName\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("SellerNumber")) {
      String SellerNumber;
      SellerNumber = savedStateHandle.get("SellerNumber");
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SellerNumber", SellerNumber);
    } else {
      throw new IllegalArgumentException("Required argument \"SellerNumber\" is missing and does not have an android:defaultValue");
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("Name")) {
      String Name = (String) arguments.get("Name");
      __result.set("Name", Name);
    }
    if (arguments.containsKey("Description")) {
      String Description = (String) arguments.get("Description");
      __result.set("Description", Description);
    }
    if (arguments.containsKey("Price")) {
      String Price = (String) arguments.get("Price");
      __result.set("Price", Price);
    }
    if (arguments.containsKey("avatarUrl")) {
      String avatarUrl = (String) arguments.get("avatarUrl");
      __result.set("avatarUrl", avatarUrl);
    }
    if (arguments.containsKey("SellerName")) {
      String SellerName = (String) arguments.get("SellerName");
      __result.set("SellerName", SellerName);
    }
    if (arguments.containsKey("SellerNumber")) {
      String SellerNumber = (String) arguments.get("SellerNumber");
      __result.set("SellerNumber", SellerNumber);
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
    PostFragmentArgs that = (PostFragmentArgs) object;
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
    return result;
  }

  @Override
  public String toString() {
    return "PostFragmentArgs{"
        + "Name=" + getName()
        + ", Description=" + getDescription()
        + ", Price=" + getPrice()
        + ", avatarUrl=" + getAvatarUrl()
        + ", SellerName=" + getSellerName()
        + ", SellerNumber=" + getSellerNumber()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PostFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String Name, @NonNull String Description, @NonNull String Price,
        @Nullable String avatarUrl, @NonNull String SellerName, @NonNull String SellerNumber) {
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
    public PostFragmentArgs build() {
      PostFragmentArgs result = new PostFragmentArgs(arguments);
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
    public Builder setDescription(@NonNull String Description) {
      if (Description == null) {
        throw new IllegalArgumentException("Argument \"Description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Description", Description);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPrice(@NonNull String Price) {
      if (Price == null) {
        throw new IllegalArgumentException("Argument \"Price\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Price", Price);
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
    public Builder setSellerName(@NonNull String SellerName) {
      if (SellerName == null) {
        throw new IllegalArgumentException("Argument \"SellerName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerName", SellerName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSellerNumber(@NonNull String SellerNumber) {
      if (SellerNumber == null) {
        throw new IllegalArgumentException("Argument \"SellerNumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SellerNumber", SellerNumber);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getName() {
      return (String) arguments.get("Name");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getDescription() {
      return (String) arguments.get("Description");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPrice() {
      return (String) arguments.get("Price");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getSellerName() {
      return (String) arguments.get("SellerName");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getSellerNumber() {
      return (String) arguments.get("SellerNumber");
    }
  }
}