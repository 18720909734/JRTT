// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.news.channel;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class ChannelActivity_ViewBinding<T extends ChannelActivity> extends BaseActivity_ViewBinding<T> {
  public ChannelActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mRvCheckedList = finder.findRequiredViewAsType(source, R.id.rv_checked_list, "field 'mRvCheckedList'", RecyclerView.class);
    target.mRvUncheckedList = finder.findRequiredViewAsType(source, R.id.rv_unchecked_list, "field 'mRvUncheckedList'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolbar = null;
    target.mRvCheckedList = null;
    target.mRvUncheckedList = null;
  }
}
