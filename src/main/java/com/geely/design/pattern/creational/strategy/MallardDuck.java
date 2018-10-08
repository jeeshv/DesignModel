package com.geely.design.pattern.creational.strategy;

import com.geely.design.pattern.creational.strategy.impl.FlyWithWin;

/**
 * Created by Administrator on 2018/10/9.
 */
public class MallardDuck extends Duck {
    @Override
    public void queck() {
        super.queck();
        super.setFlyingStrategy(new FlyWithWin());
    }
    @Override
    public void display() {
        System.out.println("绿脖子");
    }
}
