// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.home;

import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.tag.TagView;
import java.lang.Object;
import java.lang.Override;

public class SplashActivity_ViewBinding<T extends SplashActivity> extends BaseActivity_ViewBinding<T> {
  public SplashActivity_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mTagSkip = finder.findRequiredViewAsType(source, R.id.tag_skip, "field 'mTagSkip'", TagView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mTagSkip = null;
  }
}
