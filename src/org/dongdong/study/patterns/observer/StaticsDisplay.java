package org.dongdong.study.patterns.observer;

public class StaticsDisplay implements Observer, DisplayElement {

	float temp;
	float humidity;
	float pressure;

	public StaticsDisplay() {
	}

	public StaticsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("static temperature: " + temp);
		System.out.println("static humidity: " + humidity);
		System.out.println("static pressure: " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
