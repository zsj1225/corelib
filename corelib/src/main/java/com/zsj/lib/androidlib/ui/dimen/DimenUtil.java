package com.zsj.lib.androidlib.ui.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.zsj.lib.androidlib.app.app.Latte;


/**
 * Created by 傅令杰 on 2017/4/2
 */

public final class DimenUtil {

    /**
     * 获取屏幕的宽度
     *
     * @return
     */
    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 获取屏幕的高度
     *
     * @return
     */
    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
