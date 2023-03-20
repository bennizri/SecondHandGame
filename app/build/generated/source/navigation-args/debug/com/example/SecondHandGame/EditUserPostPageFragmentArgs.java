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

public class EditUserPostPageFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditUserPostPageFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private EditUserPostPageFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditUserPostPageFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditUserPostPageFragmentArgs __result = new EditUserPostPageFragmentArgs();
    bundle.setClassLoader(EditUserPostPageFragmentArgs.class.getClassLoader());
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
    if (bundle.containsKey("Ingredients")) {
      String Ingredients;
      Ingredients = bundle.getString("Ingredients");
      if (Ingredients == null) {
        throw new IllegalArgumentException("Argument \"Ingredients\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Ingredients", Ingredients);
    } else {
      throw new IllegalArgumentException("Required argument \"Ingredients\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("Instructions")) {
      String Instructions;
      Instructions = bundle.getString("Instructions");
      if (Instructions == null) {
        throw new IllegalArgumentException("Argument \"Instructions\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Instructions", Instructions);
    } else {
      throw new IllegalArgumentException("Required argument \"Instructions\" is missing and does not have an android:defaultValue");
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
  public static EditUserPostPageFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    EditUserPostPageFragmentArgs __result = new EditUserPostPageFragmentArgs();
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
    if (savedStateHandle.contains("Ingredients")) {
      String Ingredients;
      Ingredients = savedStateHandle.get("Ingredients");
      if (Ingredients == null) {
        throw new IllegalArgumentException("Argument \"Ingredients\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Ingredients", Ingredients);
    } else {
      throw new IllegalArgumentException("Required argument \"Ingredients\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("Instructions")) {
      String Instructions;
      Instructions = savedStateHandle.get("Instructions");
      if (Instructions == null) {
        throw new IllegalArgumentException("Argument \"Instructions\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Instructions", Instructions);
    } else {
      throw new IllegalArgumentException("Required argument \"Instructions\" is missing and does not have an android:defaultValue");
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
  public String getName() {
    return (String) arguments.get("Name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getIngredients() {
    return (String) arguments.get("Ingredients");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getInstructions() {
    return (String) arguments.get("Instructions");
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
    if (arguments.containsKey("Name")) {
      String Name = (String) arguments.get("Name");
      __result.putString("Name", Name);
    }
    if (arguments.containsKey("Ingredients")) {
      String Ingredients = (String) arguments.get("Ingredients");
      __result.putString("Ingredients", Ingredients);
    }
    if (arguments.containsKey("Instructions")) {
      String Instructions = (String) arguments.get("Instructions");
      __result.putString("Instructions", Instructions);
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
    if (arguments.containsKey("Name")) {
      String Name = (String) arguments.get("Name");
      __result.set("Name", Name);
    }
    if (arguments.containsKey("Ingredients")) {
      String Ingredients = (String) arguments.get("Ingredients");
      __result.set("Ingredients", Ingredients);
    }
    if (arguments.containsKey("Instructions")) {
      String Instructions = (String) arguments.get("Instructions");
      __result.set("Instructions", Instructions);
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
    EditUserPostPageFragmentArgs that = (EditUserPostPageFragmentArgs) object;
    if (arguments.containsKey("Name") != that.arguments.containsKey("Name")) {
      return false;
    }
    if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
      return false;
    }
    if (arguments.containsKey("Ingredients") != that.arguments.containsKey("Ingredients")) {
      return false;
    }
    if (getIngredients() != null ? !getIngredients().equals(that.getIngredients()) : that.getIngredients() != null) {
      return false;
    }
    if (arguments.containsKey("Instructions") != that.arguments.containsKey("Instructions")) {
      return false;
    }
    if (getInstructions() != null ? !getInstructions().equals(that.getInstructions()) : that.getInstructions() != null) {
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
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    result = 31 * result + (getIngredients() != null ? getIngredients().hashCode() : 0);
    result = 31 * result + (getInstructions() != null ? getInstructions().hashCode() : 0);
    result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditUserPostPageFragmentArgs{"
        + "Name=" + getName()
        + ", Ingredients=" + getIngredients()
        + ", Instructions=" + getInstructions()
        + ", avatarUrl=" + getAvatarUrl()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull EditUserPostPageFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String Name, @NonNull String Ingredients, @NonNull String Instructions,
        @Nullable String avatarUrl) {
      if (Name == null) {
        throw new IllegalArgumentException("Argument \"Name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Name", Name);
      if (Ingredients == null) {
        throw new IllegalArgumentException("Argument \"Ingredients\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Ingredients", Ingredients);
      if (Instructions == null) {
        throw new IllegalArgumentException("Argument \"Instructions\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Instructions", Instructions);
      this.arguments.put("avatarUrl", avatarUrl);
    }

    @NonNull
    public EditUserPostPageFragmentArgs build() {
      EditUserPostPageFragmentArgs result = new EditUserPostPageFragmentArgs(arguments);
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
    public Builder setIngredients(@NonNull String Ingredients) {
      if (Ingredients == null) {
        throw new IllegalArgumentException("Argument \"Ingredients\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Ingredients", Ingredients);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setInstructions(@NonNull String Instructions) {
      if (Instructions == null) {
        throw new IllegalArgumentException("Argument \"Instructions\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Instructions", Instructions);
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
    public String getName() {
      return (String) arguments.get("Name");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getIngredients() {
      return (String) arguments.get("Ingredients");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getInstructions() {
      return (String) arguments.get("Instructions");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getAvatarUrl() {
      return (String) arguments.get("avatarUrl");
    }
  }
}
