// Generated code from Butter Knife. Do not modify!
package com.dl7.mvp.widget.dialog;

import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.dl7.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ShareBottomDialog_ViewBinding<T extends ShareBottomDialog> implements Unbinder {
  protected T target;

  public ShareBottomDialog_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.mLlWechatFriendCircle = finder.findRequiredViewAsType(source, R.id.ll_wechat_friend_circle, "field 'mLlWechatFriendCircle'", LinearLayout.class);
    target.mLlWechatFriend = finder.findRequiredViewAsType(source, R.id.ll_wechat_friend, "field 'mLlWechatFriend'", LinearLayout.class);
    target.mLlQq = finder.findRequiredViewAsType(source, R.id.ll_qq, "field 'mLlQq'", LinearLayout.class);
    target.mLlSms = finder.findRequiredViewAsType(source, R.id.ll_sms, "field 'mLlSms'", LinearLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mLlWechatFriendCircle = null;
    target.mLlWechatFriend = null;
    target.mLlQq = null;
    target.mLlSms = null;

    this.target = null;
  }
}
