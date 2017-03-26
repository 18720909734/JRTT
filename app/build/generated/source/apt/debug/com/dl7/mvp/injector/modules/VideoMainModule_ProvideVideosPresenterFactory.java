// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.module.base.IRxBusPresenter;
import com.dl7.mvp.rxbus.RxBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class VideoMainModule_ProvideVideosPresenterFactory
    implements Factory<IRxBusPresenter> {
  private final VideoMainModule module;

  private final Provider<DaoSession> daoSessionProvider;

  private final Provider<RxBus> rxBusProvider;

  public VideoMainModule_ProvideVideosPresenterFactory(
      VideoMainModule module,
      Provider<DaoSession> daoSessionProvider,
      Provider<RxBus> rxBusProvider) {
    assert module != null;
    this.module = module;
    assert daoSessionProvider != null;
    this.daoSessionProvider = daoSessionProvider;
    assert rxBusProvider != null;
    this.rxBusProvider = rxBusProvider;
  }

  @Override
  public IRxBusPresenter get() {
    return Preconditions.checkNotNull(
        module.provideVideosPresenter(daoSessionProvider.get(), rxBusProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IRxBusPresenter> create(
      VideoMainModule module,
      Provider<DaoSession> daoSessionProvider,
      Provider<RxBus> rxBusProvider) {
    return new VideoMainModule_ProvideVideosPresenterFactory(
        module, daoSessionProvider, rxBusProvider);
  }
}