package com.geely.design.pattern.creational.strategy;

import com.geely.design.pattern.creational.strategy.impl.FlyNoWay;

/**
 * Created by Administrator on 2018/10/9.
 */
public class RedHeadDuck extends Duck {
    @Override
    public void queck() {
        super.queck();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("红脑袋");
    }
}
