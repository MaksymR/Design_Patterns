package com.designpatterns.creationalpatterns.singleton.classic;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("\nCLASSIC Singleton\n");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.getClass().getSimpleName());
        System.out.println(singleton2.getClass().getSimpleName());
        System.out.println("\nGetting the full name of the singleton's instance:\n");
        System.out.println(singleton1);
        System.out.println(singleton2);

    }

}
