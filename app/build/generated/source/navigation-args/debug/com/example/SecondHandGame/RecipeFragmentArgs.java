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

public class RecipeFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RecipeFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private RecipeFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RecipeFragmentArgs __result = new RecipeFragmentArgs();
    bundle.setClassLoader(RecipeFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("NameRecipe")) {
      String NameRecipe;
      NameRecipe = bundle.getString("NameRecipe");
      if (NameRecipe == null) {
        throw new IllegalArgumentException("Argument \"NameRecipe\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("NameRecipe", NameRecipe);
    } else {
      throw new IllegalArgumentException("Required argument \"NameRecipe\" is missing and does not have an android:defaultValue");
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
  public static RecipeFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    RecipeFragmentArgs __result = new RecipeFragmentArgs();
    if (savedStateHandle.contains("NameRecipe")) {
      String NameRecipe;
      NameRecipe = savedStateHandle.get("NameRecipe");
      if (NameRecipe == null) {
        throw new IllegalArgumentException("Argument \"NameRecipe\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("NameRecipe", NameRecipe);
    } else {
      throw new IllegalArgumentException("Required argument \"NameRecipe\" is missing and does not have an android:defaultValue");
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
  public String getNameRecipe() {
    return (String) arguments.get("NameRecipe");
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
    if (arguments.containsKey("NameRecipe")) {
      String NameRecipe = (String) arguments.get("NameRecipe");
      __result.putString("NameRecipe", NameRecipe);
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
    if (arguments.containsKey("NameRecipe")) {
      String NameRecipe = (String) arguments.get("NameRecipe");
      __result.set("NameRecipe", NameRecipe);
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
    RecipeFragmentArgs that = (RecipeFragmentArgs) object;
    if (arguments.containsKey("NameRecipe") != that.arguments.containsKey("NameRecipe")) {
      return false;
    }
    if (getNameRecipe() != null ? !getNameRecipe().equals(that.getNameRecipe()) : that.getNameRecipe() != null) {
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
    result = 31 * result + (getNameRecipe() != null ? getNameRecipe().hashCode() : 0);
    result = 31 * result + (getIngredients() != null ? getIngredients().hashCode() : 0);
    result = 31 * result + (getInstructions() != null ? getInstructions().hashCode() : 0);
    result = 31 * result + (getAvatarUrl() != null ? getAvatarUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RecipeFragmentArgs{"
        + "NameRecipe=" + getNameRecipe()
        + ", Ingredients=" + getIngredients()
        + ", Instructions=" + getInstructions()
        + ", avatarUrl=" + getAvatarUrl()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull RecipeFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String NameRecipe, @NonNull String Ingredients,
        @NonNull String Instructions, @Nullable String avatarUrl) {
      if (NameRecipe == null) {
        throw new IllegalArgumentException("Argument \"NameRecipe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("NameRecipe", NameRecipe);
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
    public RecipeFragmentArgs build() {
      RecipeFragmentArgs result = new RecipeFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNameRecipe(@NonNull String NameRecipe) {
      if (NameRecipe == null) {
        throw new IllegalArgumentException("Argument \"NameRecipe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("NameRecipe", NameRecipe);
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
    public String getNameRecipe() {
      return (String) arguments.get("NameRecipe");
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
