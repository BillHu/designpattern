package com.tarehong.simplefactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author billhu
 */
public class Client {
    public static void main(String[] args) {
        List<IProduct> plist = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            plist.add(SimpleFactory.getInstance().createProduct(ProductType.Type1));
        }
        for (IProduct p : plist) {
            System.out.println(p);
        }
    }
}
