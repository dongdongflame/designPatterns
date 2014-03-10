package org.dongdong.study.patterns.adapter;

public class MallardDuck implements Duck {

	@Override
	public void display() {
		System.out.println("I'm a mallerd duck");
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void quack() {
		System.out.println("quack");
	}

}
