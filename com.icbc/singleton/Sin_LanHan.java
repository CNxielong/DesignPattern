package com.icbc.singleton;

/**
 * 懒汉式 需要才加载
 *
 * @Auther: XDragon
 * @Date: 2021/1/31/031 01:23
 * @Email:cnxielong@gmail.com
 */
public class Sin_LanHan {
    private static Sin_LanHan sin_lanHan;

    private Sin_LanHan() {
    }

    public static Sin_LanHan getSin_lanHan() {
        if (null == sin_lanHan) {
            sin_lanHan = new Sin_LanHan();
        }
        return sin_lanHan;
    }
}
