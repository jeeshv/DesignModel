package com.geely.design.pattern.creational.builder;

/**
 * Created by Administrator on 2018/10/6.
 */
public class BuilderTest {
    public static void main(String[] args){
        Director director = new Director();
        Human human = director.createHumanByDirecotr(new SmartManBuilder());
        System.out.println(human);
        Human normalHuman = director.createHumanByDirecotr(new NormalManBuilder());
        System.out.println(normalHuman);

    }

}

