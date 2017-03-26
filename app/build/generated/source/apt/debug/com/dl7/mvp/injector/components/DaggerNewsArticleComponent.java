// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dl7.mvp.injector.components;

import com.dl7.mvp.injector.modules.NewsArticleModule;
import com.dl7.mvp.injector.modules.NewsArticleModule_ProvidePresenterFactory;
import com.dl7.mvp.module.base.IBasePresenter;
import com.dl7.mvp.module.news.article.NewsArticleActivity;
import com.dl7.mvp.module.news.article.NewsArticleActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerNewsArticleComponent implements NewsArticleComponent {
  private Provider<IBasePresenter> providePresenterProvider;

  private MembersInjector<NewsArticleActivity> newsArticleActivityMembersInjector;

  private DaggerNewsArticleComponent(Builder builder) {
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
            NewsArticleModule_ProvidePresenterFactory.create(builder.newsArticleModule));

    this.newsArticleActivityMembersInjector =
        NewsArticleActivity_MembersInjector.create(providePresenterProvider);
  }

  @Override
  public void inject(NewsArticleActivity activity) {
    newsArticleActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private NewsArticleModule newsArticleModule;

    private Builder() {}

    public NewsArticleComponent build() {
      if (newsArticleModule == null) {
        throw new IllegalStateException(
            NewsArticleModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerNewsArticleComponent(this);
    }

    public Builder newsArticleModule(NewsArticleModule newsArticleModule) {
      this.newsArticleModule = Preconditions.checkNotNull(newsArticleModule);
      return this;
    }
  }
}