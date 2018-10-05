package com.geely.design.pattern.creational.builder;

/**
 * Created by Administrator on 2018/10/6.
 */
public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();
}

