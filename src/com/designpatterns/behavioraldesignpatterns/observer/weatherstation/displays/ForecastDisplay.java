package com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays;

import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.displayelement.DisplayElement;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.observer.Observer;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92F;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast:");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainny weater");
        }
    }

}
