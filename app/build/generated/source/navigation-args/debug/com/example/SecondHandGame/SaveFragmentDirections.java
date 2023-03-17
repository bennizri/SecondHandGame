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

public class SaveFragmentDirections {
  private SaveFragmentDirections() {
  }

  @NonNull
  public static ActionLikesFragmentToRecipeFragment actionLikesFragmentToRecipeFragment(
      @NonNull String NameRecipe, @NonNull String Ingredients, @NonNull String Instructions,
      @Nullable String avatarUrl) {
    return new ActionLikesFragmentToRecipeFragment(NameRecipe, Ingredients, Instructions, avatarUrl);
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

  public static class ActionLikesFragmentToRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionLikesFragmentToRecipeFragment(@NonNull String NameRecipe,
        @NonNull String Ingredients, @NonNull String Instructions, @Nullable String avatarUrl) {
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
    @SuppressWarnings("unchecked")
    public ActionLikesFragmentToRecipeFragment setNameRecipe(@NonNull String NameRecipe) {
      if (NameRecipe == null) {
        throw new IllegalArgumentException("Argument \"NameRecipe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("NameRecipe", NameRecipe);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLikesFragmentToRecipeFragment setIngredients(@NonNull String Ingredients) {
      if (Ingredients == null) {
        throw new IllegalArgumentException("Argument \"Ingredients\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Ingredients", Ingredients);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLikesFragmentToRecipeFragment setInstructions(@NonNull String Instructions) {
      if (Instructions == null) {
        throw new IllegalArgumentException("Argument \"Instructions\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Instructions", Instructions);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLikesFragmentToRecipeFragment setAvatarUrl(@Nullable String avatarUrl) {
      this.arguments.put("avatarUrl", avatarUrl);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_LikesFragment_to_recipeFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionLikesFragmentToRecipeFragment that = (ActionLikesFragmentToRecipeFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionLikesFragmentToRecipeFragment(actionId=" + getActionId() + "){"
          + "NameRecipe=" + getNameRecipe()
          + ", Ingredients=" + getIngredients()
          + ", Instructions=" + getInstructions()
          + ", avatarUrl=" + getAvatarUrl()
          + "}";
    }
  }
}
