package com.geely.design.principle.dependenceinversion;

/**
 * 依赖倒置原则：定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象
 * 抽象不应该依赖细节，细节应该依赖抽象
 * 针对接口编程，不应该针对实现编程，使各个类彼此独立，互不影响，实现模块间的松耦合，降低模块间的耦合性
 * 注意：每个类尽量继承接口或抽象类，避免从具体的类派生，尽量避免覆盖其基类方法
 * Created by Administrator on 2018/9/29.
 */
public class Test {
    //v2
    /*public static void main(String[] args) {
        Geely geely = new Geely();
        geely.stydyImmocCourse(new JavaCourse());
        geely.stydyImmocCourse(new FECourse());
    }*/
    //v3
   /* public static void main(String[] args) {
        Geely geely = new Geely(new JavaCourse());
        geely.stydyImmocCourse();
    }*/

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.stydyImmocCourse();
    }
}
