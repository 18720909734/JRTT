// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.module.base.ILocalPresenter;
import com.dl7.mvp.rxbus.RxBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class LoveVideoModule_ProvidePresenterFactory implements Factory<ILocalPresenter> {
  private final LoveVideoModule module;

  private final Provider<DaoSession> daoSessionProvider;

  private final Provider<RxBus> rxBusProvider;

  public LoveVideoModule_ProvidePresenterFactory(
      LoveVideoModule module,
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
  public ILocalPresenter get() {
    return Preconditions.checkNotNull(
        module.providePresenter(daoSessionProvider.get(), rxBusProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ILocalPresenter> create(
      LoveVideoModule module,
      Provider<DaoSession> daoSessionProvider,
      Provider<RxBus> rxBusProvider) {
    return new LoveVideoModule_ProvidePresenterFactory(module, daoSessionProvider, rxBusProvider);
  }
}
