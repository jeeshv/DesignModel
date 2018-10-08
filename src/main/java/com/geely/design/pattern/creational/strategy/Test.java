package com.geely.design.pattern.creational.strategy;

/**
 * Created by Administrator on 2018/10/9.
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.queck();
        duck.fly();
        Duck duck1 = new RedHeadDuck();
        duck1.display();
        duck1.queck();
        duck1.fly();
    }
}
