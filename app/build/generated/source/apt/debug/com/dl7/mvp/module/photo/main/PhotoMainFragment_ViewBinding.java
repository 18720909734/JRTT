// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.photo.main;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import com.flyco.tablayout.SlidingTabLayout;
import java.lang.Object;
import java.lang.Override;

public class PhotoMainFragment_ViewBinding<T extends PhotoMainFragment> extends BaseFragment_ViewBinding<T> {
  private View view2131689782;

  public PhotoMainFragment_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTabLayout = finder.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", SlidingTabLayout.class);
    target.mViewPager = finder.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
    target.mIvCount = finder.findRequiredViewAsType(source, R.id.iv_count, "field 'mIvCount'", TextView.class);
    view = finder.findRequiredView(source, R.id.fl_layout, "method 'onClick'");
    view2131689782 = view;
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

    target.mToolBar = null;
    target.mTabLayout = null;
    target.mViewPager = null;
    target.mIvCount = null;

    view2131689782.setOnClickListener(null);
    view2131689782 = null;
  }
}
