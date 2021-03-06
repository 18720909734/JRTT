// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.module.base;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseFragment_MembersInjector<T extends IBasePresenter>
    implements MembersInjector<BaseFragment<T>> {
  private final Provider<T> mPresenterProvider;

  public BaseFragment_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends IBasePresenter> MembersInjector<BaseFragment<T>> create(
      Provider<T> mPresenterProvider) {
    return new BaseFragment_MembersInjector<T>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseFragment<T> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static <T extends IBasePresenter> void injectMPresenter(
      BaseFragment<T> instance, Provider<T> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
