package com.geely.design.pattern.creational.strategy.impl;

import com.geely.design.pattern.creational.strategy.IFlyingStrategy;

/**
 * Created by Administrator on 2018/10/9.
 */
public class FlyNoWay implements IFlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("不会飞");
    }
}
