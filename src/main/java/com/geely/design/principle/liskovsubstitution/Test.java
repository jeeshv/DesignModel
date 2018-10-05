package com.geely.design.principle.liskovsubstitution;

/**
 * 里氏替换原则,继承复用的基石，对开闭原则的补充，开闭原则的前提是抽象，父类和子类的继承关系是抽象化的具体实现
 * T:type  O: object
 * 定义：如果对每一个类型为T1的对象o1,都有类型为T2的对象o2,
 *      使得以T1定义的所有程序P在所有的对象o1都替换成o2时，
 *      程序P的行为没有发生编号，那么类型T2是类型T1的子类型。
 * 定义扩展：一个软件实体如果使用一个父类的话，那一定适用于其子类，
 *      所有引用父类的地方必须能透明地使用其子类的对象，
 *      子类对象能够替换父类对象，而程序逻辑不变。
 * 引申意义：子类可以拓展父类的功能，但不能改变父类原有的功能。
 *      含义1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 *      含义2：子类中可以增加自己特有的方法
 * 演示代码参考开闭原则的v2版本。
 * 如果非要重写父类方法，可以在最顶层再写一个基类，去除继承关系，用依赖、聚合、组合替代
 *      含义3：当子类的方法重载父类的方法时，方法的前置条件（即方法的输入参数）要比父类方法的输入参数更宽松。
 *      含义4：当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输出返回值）要比父类更严格或相等。
 *
 *      优点1：约束继承泛滥，开闭原则的一种体现，为实现开闭原则实现步骤规范
 *      优点2：加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性。降低需求变更时引入的风险。
 * Created by Administrator on 2018/10/3.
 */
public class Test {
    public  static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束。width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }
    /*public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);

    }*/
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(10);
        resize(square);

    }
}
