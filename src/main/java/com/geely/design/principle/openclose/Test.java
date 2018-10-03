package com.geely.design.principle.openclose;

/**
 * 开闭原则：一个软件实体，如类、模块、函数，应该对[ 扩展 ]开发，对[ 修改 ]关闭
 * 强调：用抽象构建框架，用实现扩展细节
 * 核心思想：面向抽象编程 ，即实现抽象化，变化发生时，创建抽象来隔离有可能发生的同类变化
 * 优点：提高软件系统的可复用性和可维护性
 * 是面向对象设计中最基础的原则，指导我们如何创建稳定灵活的系统
 * Created by Administrator on 2018/9/27.
 */
public class Test {
    public static void main(String[] args) {
        ICourse IoCourse = new JavaDiscountCourse(96,"java",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)IoCourse;
        System.out.println("原价："+javaCourse.getOriginPrice());
        System.out.println("课程ID:"+javaCourse.getId() + "  课程名称：" + javaCourse.getName() + "  课程价格："+javaCourse.getPrice());
    }
}
