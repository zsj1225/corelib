package com.zsj.lib.androidlib.uitils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * 创建者     朱胜军
 * 创建时间   2017/10/9 22:00
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class UiUtils {


    /**
     * @param context      上下文
     * @param typefacePath 字体路径
     * @param textView
     */
    public static void setTypeface(Context context, String typefacePath, TextView textView) {
        Typeface typeface;
        if (typefacePath == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), "fonts/FONT.TTF");
        } else {
            typeface = Typeface.createFromAsset(context.getAssets(), typefacePath);
        }
        textView.setTypeface(typeface);
    }
}
