// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.module.video.player;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import com.dl7.mvp.module.base.BaseActivity_ViewBinding;
import com.dl7.player.media.IjkPlayerView;
import com.dl7.tag.TagView;
import com.sackcentury.shinebuttonlib.ShineButton;
import java.lang.Object;
import java.lang.Override;

public class VideoPlayerActivity_ViewBinding<T extends VideoPlayerActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131689715;

  private View view2131689717;

  public VideoPlayerActivity_ViewBinding(final T target, Finder finder, Object source) {
    super(target, finder, source);

    View view;
    target.mToolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mPlayerView = finder.findRequiredViewAsType(source, R.id.video_player, "field 'mPlayerView'", IjkPlayerView.class);
    view = finder.findRequiredView(source, R.id.iv_video_share, "field 'mIvVideoShare' and method 'onClick'");
    target.mIvVideoShare = finder.castView(view, R.id.iv_video_share, "field 'mIvVideoShare'", ImageView.class);
    view2131689715 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mIvVideoCollect = finder.findRequiredViewAsType(source, R.id.iv_video_collect, "field 'mIvVideoCollect'", ShineButton.class);
    view = finder.findRequiredView(source, R.id.iv_video_download, "field 'mIvVideoDownload' and method 'onClick'");
    target.mIvVideoDownload = finder.castView(view, R.id.iv_video_download, "field 'mIvVideoDownload'", ImageView.class);
    view2131689717 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mLlOperate = finder.findRequiredViewAsType(source, R.id.ll_operate, "field 'mLlOperate'", LinearLayout.class);
    target.mEtContent = finder.findRequiredViewAsType(source, R.id.et_content, "field 'mEtContent'", EditText.class);
    target.mLlEditLayout = finder.findRequiredViewAsType(source, R.id.ll_edit_layout, "field 'mLlEditLayout'", LinearLayout.class);
    target.mTagSend = finder.findRequiredViewAsType(source, R.id.tag_send, "field 'mTagSend'", TagView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mToolbar = null;
    target.mPlayerView = null;
    target.mIvVideoShare = null;
    target.mIvVideoCollect = null;
    target.mIvVideoDownload = null;
    target.mLlOperate = null;
    target.mEtContent = null;
    target.mLlEditLayout = null;
    target.mTagSend = null;

    view2131689715.setOnClickListener(null);
    view2131689715 = null;
    view2131689717.setOnClickListener(null);
    view2131689717 = null;
  }
}
