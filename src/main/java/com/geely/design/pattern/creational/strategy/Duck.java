package com.geely.design.pattern.creational.strategy;

/**
 * Created by Administrator on 2018/10/9.
 */
public abstract class Duck {
    private IFlyingStrategy flyingStrategy;

    public void setFlyingStrategy(IFlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        flyingStrategy.performFly();

    }
    /**
     * 鸭子发出叫声
     */
    public void queck(){
        System.out.println("嘎嘎嘎");
    }

    public abstract void display();
}
