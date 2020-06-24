package com.tarehong.decorator;

/**
 * @author billhu
 */
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("1 before___");
        super.operation();
        System.out.println("1 after___");
    }
}
