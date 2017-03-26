// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.photo.beauty;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class BeautyListFragment_ViewBinding<T extends BeautyListFragment> extends BaseFragment_ViewBinding<T> {
  public BeautyListFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mRvPhotoList = finder.findRequiredViewAsType(source, R.id.rv_photo_list, "field 'mRvPhotoList'", RecyclerView.class);
    target.mIvTransitionPhoto = finder.findRequiredViewAsType(source, R.id.iv_transition_photo, "field 'mIvTransitionPhoto'", ImageView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRvPhotoList = null;
    target.mIvTransitionPhoto = null;
  }
}
