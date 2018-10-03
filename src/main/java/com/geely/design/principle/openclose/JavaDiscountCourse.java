package com.geely.design.principle.openclose;

/**
 * Created by Administrator on 2018/9/27.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
