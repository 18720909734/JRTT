// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.module.photo.news;

import com.dl7.mvp.module.base.IBasePresenter;
import com.dl7.recycler.adapter.BaseQuickAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class PhotoNewsFragment_MembersInjector implements MembersInjector<PhotoNewsFragment> {
  private final Provider<IBasePresenter> mPresenterProvider;

  private final Provider<BaseQuickAdapter> mAdapterProvider;

  public PhotoNewsFragment_MembersInjector(
      Provider<IBasePresenter> mPresenterProvider, Provider<BaseQuickAdapter> mAdapterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<PhotoNewsFragment> create(
      Provider<IBasePresenter> mPresenterProvider, Provider<BaseQuickAdapter> mAdapterProvider) {
    return new PhotoNewsFragment_MembersInjector(mPresenterProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(PhotoNewsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.dl7.mvp.module.base.BaseFragment_MembersInjector.injectMPresenter(
        instance, mPresenterProvider);
    instance.mAdapter = mAdapterProvider.get();
  }

  public static void injectMAdapter(
      PhotoNewsFragment instance, Provider<BaseQuickAdapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }
}
