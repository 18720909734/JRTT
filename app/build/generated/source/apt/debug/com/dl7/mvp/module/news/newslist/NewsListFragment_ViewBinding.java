// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.newslist;

import android.support.v7.widget.RecyclerView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class NewsListFragment_ViewBinding<T extends NewsListFragment> extends BaseFragment_ViewBinding<T> {
  public NewsListFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mRvNewsList = finder.findRequiredViewAsType(source, R.id.rv_news_list, "field 'mRvNewsList'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRvNewsList = null;
  }
}
