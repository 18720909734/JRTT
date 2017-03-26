// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.video.main;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import com.flyco.tablayout.SlidingTabLayout;
import java.lang.Object;
import java.lang.Override;

public class VideoMainFragment_ViewBinding<T extends VideoMainFragment> extends BaseFragment_ViewBinding<T> {
  private View view2131689784;

  private View view2131689786;

  public VideoMainFragment_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mIvLoveCount = finder.findRequiredViewAsType(source, R.id.iv_love_count, "field 'mIvLoveCount'", TextView.class);
    view = finder.findRequiredView(source, R.id.fl_love_layout, "field 'mFlLoveLayout' and method 'onClick'");
    target.mFlLoveLayout = finder.castView(view, R.id.fl_love_layout, "field 'mFlLoveLayout'", FrameLayout.class);
    view2131689784 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mTvDownloadCount = finder.findRequiredViewAsType(source, R.id.tv_download_count, "field 'mTvDownloadCount'", TextView.class);
    view = finder.findRequiredView(source, R.id.fl_download_layout, "field 'mFlDownloadLayout' and method 'onClick'");
    target.mFlDownloadLayout = finder.castView(view, R.id.fl_download_layout, "field 'mFlDownloadLayout'", FrameLayout.class);
    view2131689786 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTabLayout = finder.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", SlidingTabLayout.class);
    target.mViewPager = finder.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mIvLoveCount = null;
    target.mFlLoveLayout = null;
    target.mTvDownloadCount = null;
    target.mFlDownloadLayout = null;
    target.mToolBar = null;
    target.mTabLayout = null;
    target.mViewPager = null;

    view2131689784.setOnClickListener(null);
    view2131689784 = null;
    view2131689786.setOnClickListener(null);
    view2131689786 = null;
  }
}
