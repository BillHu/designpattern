package com.tarehong.simplefactory;

/**
 * @author billhu
 */
public class SimpleFactory {

    private static final SimpleFactory instance = new SimpleFactory();

    private SimpleFactory() {
    }

    public static SimpleFactory getInstance() {
        return instance;
    }

    public IProduct createProduct(ProductType productType) {
        if (productType.equals(ProductType.Type1)) {
            return new ConcreteProduct1();
        } else if (productType.equals(ProductType.Type2)) {
            return new ConcreteProduct2();
        } else {
            return null;
        }

    }
}
