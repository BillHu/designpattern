package com.tarehong.factorymethod;

/**
 * @author billhu
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory1 = new ConcreteFactory1();
        IFactory factory2 = new ConcreteFactory2();
        IProduct p1 = factory1.createProduct();
        IProduct p2 = factory2.createProduct();
        System.out.println(p1.getClass().getSimpleName());
        System.out.println(p2.getClass().getSimpleName());
    }
}
