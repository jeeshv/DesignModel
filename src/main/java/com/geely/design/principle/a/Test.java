package com.geely.design.principle.a;

/**
 * 迪米特原则（最少知道原则），思想：解耦
 * 优点：降低类与类之间的耦合，
 * 缺点：过分使用迪米特原则，会产生大量中介类，使系统变复杂
 * 强调：只和朋友交流，不和陌生人说话
 * 朋友：出现在成员变量、方法输入、输出参数中的类成为成员朋友类，
 *      而出现在方法体内部的类不属于朋友类。
 * Created by Administrator on 2018/10/3.
 */
public class Test {
    public static void main(String[] args) {

    }
}
