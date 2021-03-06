// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.mvp.module.base.IBasePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class NewsArticleModule_ProvidePresenterFactory implements Factory<IBasePresenter> {
  private final NewsArticleModule module;

  public NewsArticleModule_ProvidePresenterFactory(NewsArticleModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public IBasePresenter get() {
    return Preconditions.checkNotNull(
        module.providePresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IBasePresenter> create(NewsArticleModule module) {
    return new NewsArticleModule_ProvidePresenterFactory(module);
  }
}
