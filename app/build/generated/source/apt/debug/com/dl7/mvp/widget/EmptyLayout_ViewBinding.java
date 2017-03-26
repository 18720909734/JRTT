// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.github.ybq.android.spinkit.SpinKitView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class EmptyLayout_ViewBinding<T extends EmptyLayout> implements Unbinder {
  protected T target;

  private View view2131689806;

  public EmptyLayout_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    view = finder.findRequiredView(source, R.id.tv_net_error, "field 'mTvEmptyMessage' and method 'onClick'");
    target.mTvEmptyMessage = finder.castView(view, R.id.tv_net_error, "field 'mTvEmptyMessage'", TextView.class);
    view2131689806 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.mRlEmptyContainer = finder.findRequiredView(source, R.id.rl_empty_container, "field 'mRlEmptyContainer'");
    target.mEmptyLoading = finder.findRequiredViewAsType(source, R.id.empty_loading, "field 'mEmptyLoading'", SpinKitView.class);
    target.mEmptyLayout = finder.findRequiredViewAsType(source, R.id.empty_layout, "field 'mEmptyLayout'", FrameLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTvEmptyMessage = null;
    target.mRlEmptyContainer = null;
    target.mEmptyLoading = null;
    target.mEmptyLayout = null;

    view2131689806.setOnClickListener(null);
    view2131689806 = null;

    this.target = null;
  }
}
