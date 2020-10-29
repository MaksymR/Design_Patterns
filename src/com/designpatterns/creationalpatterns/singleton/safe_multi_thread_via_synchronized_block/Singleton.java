package com.designpatterns.creationalpatterns.singleton.safe_multi_thread_via_synchronized_block;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
