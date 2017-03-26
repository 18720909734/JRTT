// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.base;

import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.widget.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {
  protected T target;

  public BaseActivity_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.mEmptyLayout = finder.findOptionalViewAsType(source, R.id.empty_layout, "field 'mEmptyLayout'", EmptyLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mEmptyLayout = null;

    this.target = null;
  }
}
