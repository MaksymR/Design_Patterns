package com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays;

import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.displayelement.DisplayElement;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.observer.Observer;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + temperature + "F degrees and "
                + humidity + "% humidity");
    }

}
