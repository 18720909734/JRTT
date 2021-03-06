// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.adapter.ViewPagerAdapter;
import com.dl7.mvp.injector.modules.DownloadModule;
import com.dl7.mvp.injector.modules.DownloadModule_ProvideVideosPresenterFactory;
import com.dl7.mvp.injector.modules.DownloadModule_ProvideViewPagerAdapterFactory;
import com.dl7.mvp.module.base.IRxBusPresenter;
import com.dl7.mvp.module.manage.download.DownloadActivity;
import com.dl7.mvp.module.manage.download.DownloadActivity_MembersInjector;
import com.dl7.mvp.rxbus.RxBus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerDownloadComponent implements DownloadComponent {
  private Provider<RxBus> getRxBusProvider;

  private Provider<IRxBusPresenter> provideVideosPresenterProvider;

  private Provider<ViewPagerAdapter> provideViewPagerAdapterProvider;

  private MembersInjector<DownloadActivity> downloadActivityMembersInjector;

  private DaggerDownloadComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getRxBusProvider =
        new Factory<RxBus>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public RxBus get() {
            return Preconditions.checkNotNull(
                applicationComponent.getRxBus(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideVideosPresenterProvider =
        DoubleCheck.provider(
            DownloadModule_ProvideVideosPresenterFactory.create(
                builder.downloadModule, getRxBusProvider));

    this.provideViewPagerAdapterProvider =
        DoubleCheck.provider(
            DownloadModule_ProvideViewPagerAdapterFactory.create(builder.downloadModule));

    this.downloadActivityMembersInjector =
        DownloadActivity_MembersInjector.create(
            provideVideosPresenterProvider, provideViewPagerAdapterProvider);
  }

  @Override
  public void inject(DownloadActivity activity) {
    downloadActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private DownloadModule downloadModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public DownloadComponent build() {
      if (downloadModule == null) {
        throw new IllegalStateException(DownloadModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerDownloadComponent(this);
    }

    public Builder downloadModule(DownloadModule downloadModule) {
      this.downloadModule = Preconditions.checkNotNull(downloadModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
