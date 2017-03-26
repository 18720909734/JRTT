// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.article;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.mvp.widget.EmptyLayout;
import com.dl7.mvp.widget.PullScrollView;
import java.lang.Object;
import java.lang.Override;

public class NewsArticleActivity_ViewBinding<T extends NewsArticleActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689839;

  private View view2131689698;

  private View view2131689699;

  public NewsArticleActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    view = finder.findRequiredView(source, R.id.iv_back, "field 'mIvBack' and method 'onClick'");
    target.mIvBack = finder.castView(view, R.id.iv_back, "field 'mIvBack'", ImageView.class);
    view2131689839 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mTvTime = finder.findRequiredViewAsType(source, R.id.tv_time, "field 'mTvTime'", TextView.class);
    target.mTvTitle = finder.findRequiredViewAsType(source, R.id.tv_title, "field 'mTvTitle'", TextView.class);
    target.mLlPreToolbar = finder.findRequiredViewAsType(source, R.id.ll_pre_toolbar, "field 'mLlPreToolbar'", LinearLayout.class);
    target.mTvContent = finder.findRequiredViewAsType(source, R.id.tv_content, "field 'mTvContent'", TextView.class);
    target.mTvNextTitle = finder.findRequiredViewAsType(source, R.id.tv_next_title, "field 'mTvNextTitle'", TextView.class);
    target.mLlFootView = finder.findRequiredViewAsType(source, R.id.ll_foot_view, "field 'mLlFootView'", LinearLayout.class);
    target.mScrollView = finder.findRequiredViewAsType(source, R.id.scroll_view, "field 'mScrollView'", PullScrollView.class);
    target.mEmptyLayout = finder.findRequiredViewAsType(source, R.id.empty_layout, "field 'mEmptyLayout'", EmptyLayout.class);
    view = finder.findRequiredView(source, R.id.iv_back_2, "field 'mIvBack2' and method 'onClick'");
    target.mIvBack2 = finder.castView(view, R.id.iv_back_2, "field 'mIvBack2'", ImageView.class);
    view2131689698 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.tv_title_2, "field 'mTvTitle2' and method 'onClick'");
    target.mTvTitle2 = finder.castView(view, R.id.tv_title_2, "field 'mTvTitle2'", TextView.class);
    view2131689699 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mLlTopBar = finder.findRequiredViewAsType(source, R.id.ll_top_bar, "field 'mLlTopBar'", LinearLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mIvBack = null;
    target.mTvTime = null;
    target.mTvTitle = null;
    target.mLlPreToolbar = null;
    target.mTvContent = null;
    target.mTvNextTitle = null;
    target.mLlFootView = null;
    target.mScrollView = null;
    target.mEmptyLayout = null;
    target.mIvBack2 = null;
    target.mTvTitle2 = null;
    target.mLlTopBar = null;

    view2131689839.setOnClickListener(null);
    view2131689839 = null;
    view2131689698.setOnClickListener(null);
    view2131689698 = null;
    view2131689699.setOnClickListener(null);
    view2131689699 = null;
  }
}
