package com.designpatterns.creationalpatterns.abstractfactory;

import com.designpatterns.creationalpatterns.abstractfactory.app.Application;
import com.designpatterns.creationalpatterns.abstractfactory.factories.OsFactory;
import com.designpatterns.creationalpatterns.abstractfactory.factories.impl.AndroidOsFactoryImpl;
import com.designpatterns.creationalpatterns.abstractfactory.factories.impl.IosOsFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws IOException {
        Application app = configureApplication();
        app.show();
        app.makeCall();
        app.typeSms();
    }

    private static Application configureApplication() throws IOException {
        OsFactory osFactory;
        Application application;
        System.out.println("Please, enter your smartphone's OS by pressing \"1\" or \"2\"" +
                " where: 1 - Android or 2 - iOS");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String inputString = bufferedReader.readLine();

                int i = Integer.parseInt(inputString);
                switch (i) {
                    case 1:
                        osFactory = new AndroidOsFactoryImpl();
                        return application = new Application(osFactory);
                    case 2:
                        osFactory = new IosOsFactory();
                        return application = new Application(osFactory);
                    default:
                        System.out.println("Input is not being used." +
                                " Please, enter your smartphone's OS by pressing \"1\" or \"2\" where:" +
                                " 1 - Android or 2 - iO");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number!");
            }
        }
    }

}
