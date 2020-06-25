package com.tarehong.factorymethod;

/**
 * @author billhu
 */
public class ConcreteFactory1 implements IFactory{

    @Override
    public IProduct createProduct() {
        return new ConcreteProduct1();
    }
}
