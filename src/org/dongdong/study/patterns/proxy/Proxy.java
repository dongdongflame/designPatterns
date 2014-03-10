package org.dongdong.study.patterns.proxy;

public class Proxy implements People {

	People people;

	Proxy(People people) {
		this.people = people;
	}

	@Override
	public void eat() {
		people.eat();
	}

	@Override
	public void read() {
		people.read();
	}

}
