package com.geely.design.pattern.creational.builder;

/**
 * Created by Administrator on 2018/10/6.
 */
public class Director {
    public Human createHumanByDirecotr(IBuildHuman bh){
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}

