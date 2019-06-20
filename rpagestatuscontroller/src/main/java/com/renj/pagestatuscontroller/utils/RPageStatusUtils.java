package com.renj.pagestatuscontroller.utils;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-06-20   14:46
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class RPageStatusUtils {
    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNull(Object... objects) {
        if (objects == null) return true;

        for (Object object : objects) {
            if (isNull(object))
                return true;
        }

        return false;
    }
}