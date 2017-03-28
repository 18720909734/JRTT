package com.dl7.mvp.injector.components;

import android.app.Activity;

import com.dl7.mvp.injector.PerActivity;
import com.dl7.mvp.injector.modules.ActivityModule;

import dagger.Component;

/**
 * Created by qiushengyuon 2016/8/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();
}
