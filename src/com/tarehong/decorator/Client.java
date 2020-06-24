package com.tarehong.decorator;

/**
 * @author billhu
 */
public class Client {

    public static void main(String[] args) {
        Component originalComponent = new ConcreteComponent();
        Component d1 = new ConcreteDecorator(originalComponent);
        Component d2 = new ConcreteDecorator1(d1);
        d2.operation();
    }
}
