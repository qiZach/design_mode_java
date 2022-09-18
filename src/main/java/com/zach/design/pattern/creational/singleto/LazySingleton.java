package com.zach.design.pattern.creational.singleto;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    // synchronized 修饰 类中static方法锁的是class
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
