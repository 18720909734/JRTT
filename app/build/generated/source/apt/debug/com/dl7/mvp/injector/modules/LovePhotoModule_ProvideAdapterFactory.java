// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class LovePhotoModule_ProvideAdapterFactory implements Factory<BaseQuickAdapter> {
  private final LovePhotoModule module;

  public LovePhotoModule_ProvideAdapterFactory(LovePhotoModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseQuickAdapter get() {
    return Preconditions.checkNotNull(
        module.provideAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseQuickAdapter> create(LovePhotoModule module) {
    return new LovePhotoModule_ProvideAdapterFactory(module);
  }
}
