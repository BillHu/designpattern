package com.tarehong.singleton;

/**
 * @author billhu
 */
public class LazySingleton {

    private static volatile LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){

                }
            }
        }
        return instance;
    }
}
