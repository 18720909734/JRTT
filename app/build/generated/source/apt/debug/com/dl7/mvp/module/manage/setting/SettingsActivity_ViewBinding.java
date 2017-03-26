// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.manage.setting;

import android.support.v7.widget.Toolbar;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class SettingsActivity_ViewBinding<T extends SettingsActivity> extends BaseActivity_ViewBinding<T> {
  public SettingsActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolbar = null;
  }
}
