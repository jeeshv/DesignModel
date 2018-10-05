package com.geely.design.pattern.creational.builder;

/**
 * Created by Administrator on 2018/10/6.
 */
public class NormalManBuilder implements IBuildHuman {
    Human human;

    public NormalManBuilder(){
        human = new Human();
    }
    @Override
    public void buildHead() {
        human.setHead("普通人的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("普通身体");
    }

    @Override
    public void buildHand() {
        human.setHand("普通手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("普通脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
