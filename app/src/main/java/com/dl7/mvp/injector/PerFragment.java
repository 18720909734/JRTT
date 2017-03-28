package com.dl7.mvp.injector;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by qiushengyuon 2016/8/23.
 * 单例标识
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}
