package org.dongdong.study.patterns.observer;

public class Simulator {

	public static void main(String args[]) {

		WeatherData subject = new WeatherData();

		new CurrentConditionsDisplay(subject);
		new StaticsDisplay(subject);

		subject.setMeasurements(100, 200, 500);

	}

}
