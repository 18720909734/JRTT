// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.base;

import android.support.v7.widget.RecyclerView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import java.lang.Object;
import java.lang.Override;

public class BaseVideoDLFragment_ViewBinding<T extends BaseVideoDLFragment> extends BaseFragment_ViewBinding<T> {
  public BaseVideoDLFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mRvVideoList = finder.findRequiredViewAsType(source, R.id.rv_video_list, "field 'mRvVideoList'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRvVideoList = null;
  }
}
