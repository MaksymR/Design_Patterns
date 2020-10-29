package com.designpatterns.creationalpatterns.singleton.safe_multi_thread_via_initialize_static_field;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
