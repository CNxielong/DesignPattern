package com.icbc.singleton;

/**
 * 单例：饿汉式
 * - 将默认构造函数设为私有， 防止其他对象使用单例类的 `new`运算符。
 * - 新建一个静态构建方法作为构造函数。 该函数会 “偷偷” 调用私有构造函数来创建对象，
 * 并将其保存在一个静态成员变量中。 此后所有对于该函数的调用都将返回这一缓存对象。
 * @Auther: XDragon
 * @Date: 2021/1/31/031 00:51
 * @Description:
 */
public class Sin_eHan {
    private static final Sin_eHan sin_eHan = new Sin_eHan();//private：只有getSin_eHan这一个入口可以引用 static:方便get方法调用 final:不可被修改
    private Sin_eHan() {//1、私有的构造器方法 不会被子类继承
    }

    public static Sin_eHan getSin_eHan() {//提供Public方法提供唯一实例
        return sin_eHan;
    }
    public void print(){
        System.out.println("Sin_eHan");
    }

    public static void main(String[] args) {
        Sin_eHan sin_eHan1 = Sin_eHan.getSin_eHan();
        Sin_eHan sin_eHan2 = Sin_eHan.sin_eHan;
        Sin_eHan sin_eHan3 = Sin_eHan.getSin_eHan();
        System.out.println(sin_eHan1==sin_eHan2);
        System.out.println(sin_eHan2==sin_eHan3);
    }
}
