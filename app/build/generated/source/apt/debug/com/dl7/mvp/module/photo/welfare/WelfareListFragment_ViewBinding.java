// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.photo.welfare;

import android.support.v7.widget.RecyclerView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class WelfareListFragment_ViewBinding<T extends WelfareListFragment> extends BaseFragment_ViewBinding<T> {
  public WelfareListFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mRvPhotoList = finder.findRequiredViewAsType(source, R.id.rv_photo_list, "field 'mRvPhotoList'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRvPhotoList = null;
  }
}
