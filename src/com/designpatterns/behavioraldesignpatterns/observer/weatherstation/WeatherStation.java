package com.designpatterns.behavioraldesignpatterns.observer.weatherstation;

import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays.CurrentConditionsDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays.ForecastDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays.HeatIndexDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.displays.StatisticsDisplay;
import com.designpatterns.behavioraldesignpatterns.observer.weatherstation.subjectobject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        System.out.println();

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }

}
