// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.module.base;

import com.dl7.mvp.adapter.BaseVideoDLAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseVideoDLFragment_MembersInjector<T extends IBasePresenter>
    implements MembersInjector<BaseVideoDLFragment<T>> {
  private final Provider<T> mPresenterProvider;

  private final Provider<BaseVideoDLAdapter> mAdapterProvider;

  public BaseVideoDLFragment_MembersInjector(
      Provider<T> mPresenterProvider, Provider<BaseVideoDLAdapter> mAdapterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static <T extends IBasePresenter> MembersInjector<BaseVideoDLFragment<T>> create(
      Provider<T> mPresenterProvider, Provider<BaseVideoDLAdapter> mAdapterProvider) {
    return new BaseVideoDLFragment_MembersInjector<T>(mPresenterProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(BaseVideoDLFragment<T> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFragment) instance).mPresenter = mPresenterProvider.get();
    instance.mAdapter = mAdapterProvider.get();
  }

  public static <T extends IBasePresenter> void injectMAdapter(
      BaseVideoDLFragment<T> instance, Provider<BaseVideoDLAdapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }
}