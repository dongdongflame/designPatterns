package org.dongdong.study.patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	float temp;
	float humidity;
	float pressure;

	public CurrentConditionsDisplay() {
	}

	public CurrentConditionsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current temperature: " + temp);
		System.out.println("current humidity: " + humidity);
		System.out.println("current pressure: " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
