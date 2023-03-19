package com.example.SecondHandGame;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BlueFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private BlueFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private BlueFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static BlueFragmentArgs fromBundle(@NonNull Bundle bundle) {
    BlueFragmentArgs __result = new BlueFragmentArgs();
    bundle.setClassLoader(BlueFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("blueTitle")) {
      String blueTitle;
      blueTitle = bundle.getString("blueTitle");
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueTitle", blueTitle);
    } else {
      throw new IllegalArgumentException("Required argument \"blueTitle\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static BlueFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    BlueFragmentArgs __result = new BlueFragmentArgs();
    if (savedStateHandle.contains("blueTitle")) {
      String blueTitle;
      blueTitle = savedStateHandle.get("blueTitle");
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueTitle", blueTitle);
    } else {
      throw new IllegalArgumentException("Required argument \"blueTitle\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getBlueTitle() {
    return (String) arguments.get("blueTitle");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("blueTitle")) {
      String blueTitle = (String) arguments.get("blueTitle");
      __result.putString("blueTitle", blueTitle);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("blueTitle")) {
      String blueTitle = (String) arguments.get("blueTitle");
      __result.set("blueTitle", blueTitle);
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
    BlueFragmentArgs that = (BlueFragmentArgs) object;
    if (arguments.containsKey("blueTitle") != that.arguments.containsKey("blueTitle")) {
      return false;
    }
    if (getBlueTitle() != null ? !getBlueTitle().equals(that.getBlueTitle()) : that.getBlueTitle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getBlueTitle() != null ? getBlueTitle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "BlueFragmentArgs{"
        + "blueTitle=" + getBlueTitle()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull BlueFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String blueTitle) {
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueTitle", blueTitle);
    }

    @NonNull
    public BlueFragmentArgs build() {
      BlueFragmentArgs result = new BlueFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBlueTitle(@NonNull String blueTitle) {
      if (blueTitle == null) {
        throw new IllegalArgumentException("Argument \"blueTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueTitle", blueTitle);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getBlueTitle() {
      return (String) arguments.get("blueTitle");
    }
  }
}
