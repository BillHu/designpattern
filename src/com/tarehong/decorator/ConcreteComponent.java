package com.tarehong.decorator;

/**
 * @author billhu
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("some operation");
    }
}
