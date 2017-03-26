// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.injector.modules.VideoPlayerModule;
import com.dl7.mvp.injector.modules.VideoPlayerModule_ProvidePresenterFactory;
import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.module.video.player.IVideoPresenter;
import com.dl7.mvp.module.video.player.VideoPlayerActivity;
import com.dl7.mvp.module.video.player.VideoPlayerActivity_MembersInjector;
import com.dl7.mvp.rxbus.RxBus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerVideoPlayerComponent implements VideoPlayerComponent {
  private Provider<DaoSession> getDaoSessionProvider;

  private Provider<RxBus> getRxBusProvider;

  private Provider<IVideoPresenter> providePresenterProvider;

  private MembersInjector<VideoPlayerActivity> videoPlayerActivityMembersInjector;

  private DaggerVideoPlayerComponent(Builder builder) {
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

    this.providePresenterProvider =
        DoubleCheck.provider(
            VideoPlayerModule_ProvidePresenterFactory.create(
                builder.videoPlayerModule, getDaoSessionProvider, getRxBusProvider));

    this.videoPlayerActivityMembersInjector =
        VideoPlayerActivity_MembersInjector.create(providePresenterProvider);
  }

  @Override
  public void inject(VideoPlayerActivity activity) {
    videoPlayerActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private VideoPlayerModule videoPlayerModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public VideoPlayerComponent build() {
      if (videoPlayerModule == null) {
        throw new IllegalStateException(
            VideoPlayerModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerVideoPlayerComponent(this);
    }

    public Builder videoPlayerModule(VideoPlayerModule videoPlayerModule) {
      this.videoPlayerModule = Preconditions.checkNotNull(videoPlayerModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
