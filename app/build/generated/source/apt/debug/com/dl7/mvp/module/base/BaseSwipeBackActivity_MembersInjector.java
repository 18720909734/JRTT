// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.module.base;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseSwipeBackActivity_MembersInjector<T extends IBasePresenter>
    implements MembersInjector<BaseSwipeBackActivity<T>> {
  private final Provider<T> mPresenterProvider;

  public BaseSwipeBackActivity_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends IBasePresenter> MembersInjector<BaseSwipeBackActivity<T>> create(
      Provider<T> mPresenterProvider) {
    return new BaseSwipeBackActivity_MembersInjector<T>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseSwipeBackActivity<T> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseActivity) instance).mPresenter = mPresenterProvider.get();
  }
}