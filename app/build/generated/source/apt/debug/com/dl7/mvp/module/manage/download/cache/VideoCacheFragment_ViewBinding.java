// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.manage.download.cache;

import android.widget.TextView;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseVideoDLFragment_ViewBinding;
import java.lang.Object;
import java.lang.Override;

public class VideoCacheFragment_ViewBinding<T extends VideoCacheFragment> extends BaseVideoDLFragment_ViewBinding<T> {
  public VideoCacheFragment_ViewBinding(T target, Finder finder, Object source) {
    super(target, finder, source);

    target.mDefaultBg = finder.findRequiredViewAsType(source, R.id.default_bg, "field 'mDefaultBg'", TextView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mDefaultBg = null;
  }
}
