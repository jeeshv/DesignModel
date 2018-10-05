package com.geely.design.pattern.creational.abstractfactory;

/**
 * Created by Administrator on 2018/10/5.
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写JAVA课程手记");
    }
}
