package com.geely.design.principle.singleresponsibility;

/**
 * 单一职责原则
 * 规定一个类应该只有一个发生变化的原因
 * 好处：降低类的复杂性，提高可读性、可维护性，最重要是类在变更时程序的风险率降低
 * Created by Administrator on 2018/10/2.
 */
public class Test {
    public static void main(String[] args) {
        /*Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");*/ //不符合单一职责原则，变更时风险大，容易产生bug

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WorkBird workBird = new WorkBird();
        workBird.mainMoveMode("鸵鸟");
    }
}
