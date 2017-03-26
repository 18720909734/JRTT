// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.module.news.main;

import com.dl7.mvp.adapter.ViewPagerAdapter;
import com.dl7.mvp.module.base.IRxBusPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NewsMainFragment_MembersInjector implements MembersInjector<NewsMainFragment> {
  private final Provider<IRxBusPresenter> mPresenterProvider;

  private final Provider<ViewPagerAdapter> mPagerAdapterProvider;

  public NewsMainFragment_MembersInjector(
      Provider<IRxBusPresenter> mPresenterProvider,
      Provider<ViewPagerAdapter> mPagerAdapterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mPagerAdapterProvider != null;
    this.mPagerAdapterProvider = mPagerAdapterProvider;
  }

  public static MembersInjector<NewsMainFragment> create(
      Provider<IRxBusPresenter> mPresenterProvider,
      Provider<ViewPagerAdapter> mPagerAdapterProvider) {
    return new NewsMainFragment_MembersInjector(mPresenterProvider, mPagerAdapterProvider);
  }

  @Override
  public void injectMembers(NewsMainFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.dl7.mvp.module.base.BaseFragment_MembersInjector.injectMPresenter(
        instance, mPresenterProvider);
    instance.mPagerAdapter = mPagerAdapterProvider.get();
  }

  public static void injectMPagerAdapter(
      NewsMainFragment instance, Provider<ViewPagerAdapter> mPagerAdapterProvider) {
    instance.mPagerAdapter = mPagerAdapterProvider.get();
  }
}