// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.modules;

import com.dl7.mvp.module.base.IRxBusPresenter;
import com.dl7.mvp.rxbus.RxBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DownloadModule_ProvideVideosPresenterFactory
    implements Factory<IRxBusPresenter> {
  private final DownloadModule module;

  private final Provider<RxBus> rxBusProvider;

  public DownloadModule_ProvideVideosPresenterFactory(
      DownloadModule module, Provider<RxBus> rxBusProvider) {
    assert module != null;
    this.module = module;
    assert rxBusProvider != null;
    this.rxBusProvider = rxBusProvider;
  }

  @Override
  public IRxBusPresenter get() {
    return Preconditions.checkNotNull(
        module.provideVideosPresenter(rxBusProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IRxBusPresenter> create(
      DownloadModule module, Provider<RxBus> rxBusProvider) {
    return new DownloadModule_ProvideVideosPresenterFactory(module, rxBusProvider);
  }
}
