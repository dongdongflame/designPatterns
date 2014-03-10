package org.dongdong.study.patterns.adapter;

public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void display() {
		System.out.println("I'm a trukey duck");
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void fly() {
		System.out.println("fly short");
		System.out.println("fly short");
		System.out.println("fly short");
	}

	@Override
	public void quack() {
		System.out.println("quack");
	}

}
