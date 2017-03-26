// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.widget.dialog;

import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.tag.TagLayout;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DownloadDialog_ViewBinding<T extends DownloadDialog> implements Unbinder {
  protected T target;

  public DownloadDialog_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.mTvDownload = finder.findRequiredViewAsType(source, R.id.tv_download, "field 'mTvDownload'", TextView.class);
    target.mTagLayout = finder.findRequiredViewAsType(source, R.id.tag_layout, "field 'mTagLayout'", TagLayout.class);
    target.mTvSpace = finder.findRequiredViewAsType(source, R.id.tv_space, "field 'mTvSpace'", TextView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTvDownload = null;
    target.mTagLayout = null;
    target.mTvSpace = null;

    this.target = null;
  }
}
