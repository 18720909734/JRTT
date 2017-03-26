// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.adapter.ViewPagerAdapter;
import com.dl7.mvp.injector.modules.VideoMainModule;
import com.dl7.mvp.injector.modules.VideoMainModule_ProvideVideosPresenterFactory;
import com.dl7.mvp.injector.modules.VideoMainModule_ProvideViewPagerAdapterFactory;
import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.module.base.IRxBusPresenter;
import com.dl7.mvp.module.video.main.VideoMainFragment;
import com.dl7.mvp.module.video.main.VideoMainFragment_MembersInjector;
import com.dl7.mvp.rxbus.RxBus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerVideoMainComponent implements VideoMainComponent {
  private Provider<DaoSession> getDaoSessionProvider;

  private Provider<RxBus> getRxBusProvider;

  private Provider<IRxBusPresenter> provideVideosPresenterProvider;

  private Provider<ViewPagerAdapter> provideViewPagerAdapterProvider;

  private MembersInjector<VideoMainFragment> videoMainFragmentMembersInjector;

  private DaggerVideoMainComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDaoSessionProvider =
        new Factory<DaoSession>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DaoSession get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDaoSession(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

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
            VideoMainModule_ProvideVideosPresenterFactory.create(
                builder.videoMainModule, getDaoSessionProvider, getRxBusProvider));

    this.provideViewPagerAdapterProvider =
        DoubleCheck.provider(
            VideoMainModule_ProvideViewPagerAdapterFactory.create(builder.videoMainModule));

    this.videoMainFragmentMembersInjector =
        VideoMainFragment_MembersInjector.create(
            provideVideosPresenterProvider, provideViewPagerAdapterProvider);
  }

  @Override
  public void inject(VideoMainFragment fragment) {
    videoMainFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private VideoMainModule videoMainModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public VideoMainComponent build() {
      if (videoMainModule == null) {
        throw new IllegalStateException(VideoMainModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerVideoMainComponent(this);
    }

    public Builder videoMainModule(VideoMainModule videoMainModule) {
      this.videoMainModule = Preconditions.checkNotNull(videoMainModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
