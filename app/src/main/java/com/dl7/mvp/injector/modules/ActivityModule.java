package com.dl7.mvp.injector.modules;

import android.app.Activity;

import com.dl7.mvp.injector.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiushengyuon 2016/8/19.
 * Activity Module
 */
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @PerActivity
    @Provides
    Activity getActivity() {
        return mActivity;
    }
}
