// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityModule_GetActivityFactory implements Factory<Activity> {
  private final ActivityModule module;

  public ActivityModule_GetActivityFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {
    return Preconditions.checkNotNull(
        module.getActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Activity> create(ActivityModule module) {
    return new ActivityModule_GetActivityFactory(module);
  }
}
