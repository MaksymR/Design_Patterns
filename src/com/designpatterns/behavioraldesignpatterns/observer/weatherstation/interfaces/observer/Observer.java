package com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.observer;

public interface Observer {

    public void update(float temp, float humidity, float pressure);

}
