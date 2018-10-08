package com.geely.design.pattern.creational.strategy.impl;

import com.geely.design.pattern.creational.strategy.IFlyingStrategy;

/**
 * Created by Administrator on 2018/10/9.
 */
public class FlyWithWin implements IFlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("普通飞翔");
    }
}
