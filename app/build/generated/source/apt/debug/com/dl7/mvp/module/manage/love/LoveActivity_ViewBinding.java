// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.manage.love;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.flyco.tablayout.SlidingTabLayout;
import java.lang.Object;
import java.lang.Override;

public class LoveActivity_ViewBinding<T extends LoveActivity> extends BaseActivity_ViewBinding<T> {
  public LoveActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTabLayout = finder.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", SlidingTabLayout.class);
    target.mViewPager = finder.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolBar = null;
    target.mTabLayout = null;
    target.mViewPager = null;
  }
}
