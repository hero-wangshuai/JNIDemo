package com.github.king.jnidemo;

/**
 * @author Created by jinxl on 2018/4/13.
 */
public class MyJni {

    /**
     * 编译.h文件
     * 首先点击make project 就是绿色小锤子按钮
     * cd app/src/main/
     * javah -d jni -classpath ../../build/intermediates/classes/debug com.github.king.jnidemo.MyJni
     *
     * 以上命令输完后 会生成jni 文件夹和.h文件
     */
    static {
        System.loadLibrary("serial_port");
    }

    public static native String stringFromJNI();
}
