package com.designpatterns.behavioraldesignpatterns.observer.weatherobservable;

import com.designpatterns.behavioraldesignpatterns.observer.weatherobservable.dislays.CurrentConditionsDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherobservable.dislays.ForecastDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherobservable.dislays.HeatIndexDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherobservable.dislays.StatisticsDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherobservable.subjectobject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        System.out.println();

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }

}
