// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.detail;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class NewsDetailActivity_ViewBinding<T extends NewsDetailActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689702;

  public NewsDetailActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTvTitle = finder.findRequiredViewAsType(source, R.id.tv_title, "field 'mTvTitle'", TextView.class);
    view = finder.findRequiredView(source, R.id.fab_coping, "field 'mFabCoping' and method 'onClick'");
    target.mFabCoping = finder.castView(view, R.id.fab_coping, "field 'mFabCoping'", FloatingActionButton.class);
    view2131689702 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.mTvSource = finder.findRequiredViewAsType(source, R.id.tv_source, "field 'mTvSource'", TextView.class);
    target.mTvTime = finder.findRequiredViewAsType(source, R.id.tv_time, "field 'mTvTime'", TextView.class);
    target.mSvContent = finder.findRequiredViewAsType(source, R.id.sv_content, "field 'mSvContent'", NestedScrollView.class);
    target.mTvContent = finder.findRequiredViewAsType(source, R.id.tv_content, "field 'mTvContent'", TextView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolBar = null;
    target.mTvTitle = null;
    target.mFabCoping = null;
    target.mTvSource = null;
    target.mTvTime = null;
    target.mSvContent = null;
    target.mTvContent = null;

    view2131689702.setOnClickListener(null);
    view2131689702 = null;
  }
}
