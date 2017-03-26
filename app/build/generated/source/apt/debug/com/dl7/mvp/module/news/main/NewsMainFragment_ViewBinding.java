// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class NewsMainFragment_ViewBinding<T extends NewsMainFragment> extends BaseFragment_ViewBinding<T> {
  public NewsMainFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTabLayout = finder.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", TabLayout.class);
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
