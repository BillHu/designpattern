package com.tarehong.factorymethod;

/**
 * @author billhu
 */
public class ConcreteFactory2 implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ConcreteProduct2();
    }
}
