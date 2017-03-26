// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.manage.love.video;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class LoveVideoFragment_ViewBinding<T extends LoveVideoFragment> extends BaseFragment_ViewBinding<T> {
  public LoveVideoFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mRvVideoList = finder.findRequiredViewAsType(source, R.id.rv_love_list, "field 'mRvVideoList'", RecyclerView.class);
    target.mDefaultBg = finder.findRequiredViewAsType(source, R.id.default_bg, "field 'mDefaultBg'", TextView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRvVideoList = null;
    target.mDefaultBg = null;
  }
}
