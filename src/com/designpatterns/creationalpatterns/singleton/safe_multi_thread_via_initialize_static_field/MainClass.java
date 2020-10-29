package com.designpatterns.creationalpatterns.singleton.safe_multi_thread_via_initialize_static_field;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("\n\"Static\" Singleton\n");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.getClass().getSimpleName());
        System.out.println(singleton2.getClass().getSimpleName());
        System.out.println("\nGetting the full name of the singleton's instance:\n");
        System.out.println(singleton1);
        System.out.println(singleton2);

    }

}
