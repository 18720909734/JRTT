// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class VideoListModule_ProvideAdapterFactory implements Factory<BaseQuickAdapter> {
  private final VideoListModule module;

  public VideoListModule_ProvideAdapterFactory(VideoListModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseQuickAdapter get() {
    return Preconditions.checkNotNull(
        module.provideAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseQuickAdapter> create(VideoListModule module) {
    return new VideoListModule_ProvideAdapterFactory(module);
  }
}
