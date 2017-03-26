// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.base;

import android.support.v4.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.widget.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BaseFragment_ViewBinding<T extends BaseFragment> implements Unbinder {
  protected T target;

  public BaseFragment_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.mEmptyLayout = finder.findOptionalViewAsType(source, R.id.empty_layout, "field 'mEmptyLayout'", EmptyLayout.class);
    target.mSwipeRefresh = finder.findOptionalViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefresh'", SwipeRefreshLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mEmptyLayout = null;
    target.mSwipeRefresh = null;

    this.target = null;
  }
}
