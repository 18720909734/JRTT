// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.mvp.adapter.ViewPagerAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class NewsMainModule_ProvideViewPagerAdapterFactory
    implements Factory<ViewPagerAdapter> {
  private final NewsMainModule module;

  public NewsMainModule_ProvideViewPagerAdapterFactory(NewsMainModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ViewPagerAdapter get() {
    return Preconditions.checkNotNull(
        module.provideViewPagerAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewPagerAdapter> create(NewsMainModule module) {
    return new NewsMainModule_ProvideViewPagerAdapterFactory(module);
  }
}
