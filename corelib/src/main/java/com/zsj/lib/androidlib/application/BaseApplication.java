package com.zsj.lib.androidlib.application;

import android.app.Application;

import com.vondear.rxtools.RxTool;

/**
 * 创建者     朱胜军
 * 创建时间   2017/10/11 20:21
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化RxTool
        RxTool.init(this);
    }
}
