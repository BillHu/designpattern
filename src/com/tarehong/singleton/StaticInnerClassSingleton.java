package com.tarehong.singleton;

/**
 * @author billhu
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
