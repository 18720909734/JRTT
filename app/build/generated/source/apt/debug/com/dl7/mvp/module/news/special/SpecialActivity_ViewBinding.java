// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.special;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class SpecialActivity_ViewBinding<T extends SpecialActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689702;

  public SpecialActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mRvNewsList = finder.findRequiredViewAsType(source, R.id.rv_news_list, "field 'mRvNewsList'", RecyclerView.class);
    view = finder.findRequiredView(source, R.id.fab_coping, "field 'mFabCoping' and method 'onClick'");
    target.mFabCoping = finder.castView(view, R.id.fab_coping, "field 'mFabCoping'", FloatingActionButton.class);
    view2131689702 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolbar = null;
    target.mRvNewsList = null;
    target.mFabCoping = null;

    view2131689702.setOnClickListener(null);
    view2131689702 = null;
  }
}
