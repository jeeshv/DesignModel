package com.geely.design.principle.openclose;

/**
 * Created by Administrator on 2018/9/27.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //v1 违反里氏替换原则，子类重写了父类的方法
   /* public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }*/
    //v2
   public Double getDisountPrice(){
       return super.getPrice()*0.8;
   }
}
