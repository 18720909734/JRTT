// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.manage.download;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.mvp.widget.FlexibleViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import java.lang.Object;
import java.lang.Override;

public class DownloadActivity_ViewBinding<T extends DownloadActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689690;

  private View view2131689691;

  private View view2131689686;

  public DownloadActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mToolBar = finder.findRequiredViewAsType(source, R.id.tool_bar, "field 'mToolBar'", Toolbar.class);
    target.mTabLayout = finder.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", SlidingTabLayout.class);
    target.mViewPager = finder.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", FlexibleViewPager.class);
    view = finder.findRequiredView(source, R.id.btn_select_all, "field 'mBtnSelectAll' and method 'onClick'");
    target.mBtnSelectAll = finder.castView(view, R.id.btn_select_all, "field 'mBtnSelectAll'", TextView.class);
    view2131689690 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.btn_select_del, "field 'mBtnSelectDel' and method 'onClick'");
    target.mBtnSelectDel = finder.castView(view, R.id.btn_select_del, "field 'mBtnSelectDel'", TextView.class);
    view2131689691 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mFlDelLayout = finder.findRequiredViewAsType(source, R.id.fl_del_layout, "field 'mFlDelLayout'", FrameLayout.class);
    view = finder.findRequiredView(source, R.id.tv_close_edit, "field 'mTvCloseEdit' and method 'onClick'");
    target.mTvCloseEdit = finder.castView(view, R.id.tv_close_edit, "field 'mTvCloseEdit'", TextView.class);
    view2131689686 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
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
    target.mBtnSelectAll = null;
    target.mBtnSelectDel = null;
    target.mFlDelLayout = null;
    target.mTvCloseEdit = null;

    view2131689690.setOnClickListener(null);
    view2131689690 = null;
    view2131689691.setOnClickListener(null);
    view2131689691 = null;
    view2131689686.setOnClickListener(null);
    view2131689686 = null;
  }
}
