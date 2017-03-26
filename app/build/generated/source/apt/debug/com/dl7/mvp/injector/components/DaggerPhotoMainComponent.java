// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.adapter.ViewPagerAdapter;
import com.dl7.mvp.injector.modules.PhotoMainModule;
import com.dl7.mvp.injector.modules.PhotoMainModule_ProvidePhotosPresenterFactory;
import com.dl7.mvp.injector.modules.PhotoMainModule_ProvideViewPagerAdapterFactory;
import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.module.base.IRxBusPresenter;
import com.dl7.mvp.module.photo.main.PhotoMainFragment;
import com.dl7.mvp.module.photo.main.PhotoMainFragment_MembersInjector;
import com.dl7.mvp.rxbus.RxBus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerPhotoMainComponent implements PhotoMainComponent {
  private Provider<DaoSession> getDaoSessionProvider;

  private Provider<RxBus> getRxBusProvider;

  private Provider<IRxBusPresenter> providePhotosPresenterProvider;

  private Provider<ViewPagerAdapter> provideViewPagerAdapterProvider;

  private MembersInjector<PhotoMainFragment> photoMainFragmentMembersInjector;

  private DaggerPhotoMainComponent(Builder builder) {
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

    this.providePhotosPresenterProvider =
        DoubleCheck.provider(
            PhotoMainModule_ProvidePhotosPresenterFactory.create(
                builder.photoMainModule, getDaoSessionProvider, getRxBusProvider));

    this.provideViewPagerAdapterProvider =
        DoubleCheck.provider(
            PhotoMainModule_ProvideViewPagerAdapterFactory.create(builder.photoMainModule));

    this.photoMainFragmentMembersInjector =
        PhotoMainFragment_MembersInjector.create(
            providePhotosPresenterProvider, provideViewPagerAdapterProvider);
  }

  @Override
  public void inject(PhotoMainFragment fragment) {
    photoMainFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private PhotoMainModule photoMainModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public PhotoMainComponent build() {
      if (photoMainModule == null) {
        throw new IllegalStateException(PhotoMainModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerPhotoMainComponent(this);
    }

    public Builder photoMainModule(PhotoMainModule photoMainModule) {
      this.photoMainModule = Preconditions.checkNotNull(photoMainModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
