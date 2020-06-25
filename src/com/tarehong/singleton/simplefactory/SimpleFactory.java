package com.tarehong.singleton.simplefactory;

/**
 * @author billhu
 */
public class SimpleFactory {

    public static IProduct createProduct(ProductType productType){
        if(productType.equals(ProductType.Type1)){
            return new ConcreteProduct1();
        }else if(productType.equals(ProductType.Type2)){
            return new ConcreteProduct2();
        }else {
            return null;
        }

    }
}
