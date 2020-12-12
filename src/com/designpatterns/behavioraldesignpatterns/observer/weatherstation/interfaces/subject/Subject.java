package com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.subject;

import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.interfaces.observer.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
