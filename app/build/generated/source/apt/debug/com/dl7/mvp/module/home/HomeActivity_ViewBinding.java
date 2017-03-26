// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.home;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.widget.FrameLayout;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class HomeActivity_ViewBinding<T extends HomeActivity> extends BaseActivity_ViewBinding<T> {
  public HomeActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mFlContainer = finder.findRequiredViewAsType(source, R.id.fl_container, "field 'mFlContainer'", FrameLayout.class);
    target.mNavView = finder.findRequiredViewAsType(source, R.id.nav_view, "field 'mNavView'", NavigationView.class);
    target.mDrawerLayout = finder.findRequiredViewAsType(source, R.id.drawer_layout, "field 'mDrawerLayout'", DrawerLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mFlContainer = null;
    target.mNavView = null;
    target.mDrawerLayout = null;
  }
}
