package com.tarehong.decorator;

/**
 * @author billhu
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        System.out.println("before...");
        super.operation();
        System.out.println("after...");
    }
}
