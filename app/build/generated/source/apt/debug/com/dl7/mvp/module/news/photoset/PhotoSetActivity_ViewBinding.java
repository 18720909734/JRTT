// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.photoset;

import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import butterknife.internal.Finder;
import com.dl7.drag.DragSlopLayout;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.mvp.widget.PhotoViewPager;
import java.lang.Object;
import java.lang.Override;

public class PhotoSetActivity_ViewBinding<T extends PhotoSetActivity> extends BaseActivity_ViewBinding<T> {
  public PhotoSetActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mVpPhoto = finder.findRequiredViewAsType(source, R.id.vp_photo, "field 'mVpPhoto'", PhotoViewPager.class);
    target.mTvTitle = finder.findRequiredViewAsType(source, R.id.tv_title, "field 'mTvTitle'", TextView.class);
    target.mTvIndex = finder.findRequiredViewAsType(source, R.id.tv_index, "field 'mTvIndex'", TextView.class);
    target.mTvCount = finder.findRequiredViewAsType(source, R.id.tv_count, "field 'mTvCount'", TextView.class);
    target.mTvContent = finder.findRequiredViewAsType(source, R.id.tv_content, "field 'mTvContent'", TextView.class);
    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDragLayout = finder.findRequiredViewAsType(source, R.id.drag_layout, "field 'mDragLayout'", DragSlopLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mVpPhoto = null;
    target.mTvTitle = null;
    target.mTvIndex = null;
    target.mTvCount = null;
    target.mTvContent = null;
    target.mToolbar = null;
    target.mDragLayout = null;
  }
}
