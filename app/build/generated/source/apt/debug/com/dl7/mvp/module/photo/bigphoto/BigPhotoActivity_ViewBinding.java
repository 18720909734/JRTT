// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.photo.bigphoto;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.drag.DragSlopLayout;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.mvp.widget.PhotoViewPager;
import java.lang.Object;
import java.lang.Override;

public class BigPhotoActivity_ViewBinding<T extends BigPhotoActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689679;

  private View view2131689681;

  private View view2131689682;

  public BigPhotoActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mVpPhoto = finder.findRequiredViewAsType(source, R.id.vp_photo, "field 'mVpPhoto'", PhotoViewPager.class);
    view = finder.findRequiredView(source, R.id.iv_favorite, "field 'mIvFavorite' and method 'onClick'");
    target.mIvFavorite = finder.castView(view, R.id.iv_favorite, "field 'mIvFavorite'", ImageView.class);
    view2131689679 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mIvDownload = finder.findRequiredViewAsType(source, R.id.iv_download, "field 'mIvDownload'", ImageView.class);
    view = finder.findRequiredView(source, R.id.iv_praise, "field 'mIvPraise' and method 'onClick'");
    target.mIvPraise = finder.castView(view, R.id.iv_praise, "field 'mIvPraise'", ImageView.class);
    view2131689681 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, R.id.iv_share, "field 'mIvShare' and method 'onClick'");
    target.mIvShare = finder.castView(view, R.id.iv_share, "field 'mIvShare'", ImageView.class);
    view2131689682 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDragLayout = finder.findRequiredViewAsType(source, R.id.drag_layout, "field 'mDragLayout'", DragSlopLayout.class);
    target.mLlLayout = finder.findRequiredViewAsType(source, R.id.ll_layout, "field 'mLlLayout'", LinearLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mVpPhoto = null;
    target.mIvFavorite = null;
    target.mIvDownload = null;
    target.mIvPraise = null;
    target.mIvShare = null;
    target.mToolbar = null;
    target.mDragLayout = null;
    target.mLlLayout = null;

    view2131689679.setOnClickListener(null);
    view2131689679 = null;
    view2131689681.setOnClickListener(null);
    view2131689681 = null;
    view2131689682.setOnClickListener(null);
    view2131689682 = null;
  }
}
