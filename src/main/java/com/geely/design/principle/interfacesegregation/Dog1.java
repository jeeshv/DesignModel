package com.geely.design.principle.interfacesegregation;

/**
 * 细粒度可以组装，粗粒度不可拆分
 * Created by Administrator on 2018/10/2.
 */
public class Dog1 implements IEatAnimalAction,ISwimAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
