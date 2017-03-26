// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.injector.modules.BeautyListModule;
import com.dl7.mvp.injector.modules.BeautyListModule_ProvideAdapterFactory;
import com.dl7.mvp.injector.modules.BeautyListModule_ProvidePresenterFactory;
import com.dl7.mvp.module.base.IBasePresenter;
import com.dl7.mvp.module.photo.beauty.BeautyListFragment;
import com.dl7.mvp.module.photo.beauty.BeautyListFragment_MembersInjector;
import com.dl7.recycler.adapter.BaseQuickAdapter;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerBeautyListComponent implements BeautyListComponent {
  private Provider<IBasePresenter> providePresenterProvider;

  private Provider<BaseQuickAdapter> provideAdapterProvider;

  private MembersInjector<BeautyListFragment> beautyListFragmentMembersInjector;

  private DaggerBeautyListComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.providePresenterProvider =
        DoubleCheck.provider(
            BeautyListModule_ProvidePresenterFactory.create(builder.beautyListModule));

    this.provideAdapterProvider =
        DoubleCheck.provider(
            BeautyListModule_ProvideAdapterFactory.create(builder.beautyListModule));

    this.beautyListFragmentMembersInjector =
        BeautyListFragment_MembersInjector.create(providePresenterProvider, provideAdapterProvider);
  }

  @Override
  public void inject(BeautyListFragment fragment) {
    beautyListFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private BeautyListModule beautyListModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public BeautyListComponent build() {
      if (beautyListModule == null) {
        throw new IllegalStateException(BeautyListModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerBeautyListComponent(this);
    }

    public Builder beautyListModule(BeautyListModule beautyListModule) {
      this.beautyListModule = Preconditions.checkNotNull(beautyListModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
