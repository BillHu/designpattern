package com.tarehong.factorymethod;

/**
 * @author billhu
 */
public interface IFactory {

    /**
     * 生产product
     * @return
     */
    IProduct createProduct();
}
