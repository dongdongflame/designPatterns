package org.dongdong.study.patterns.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void display() {
		System.out.println("I'm a wild turkey");
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void fly() {
		System.out.println("fly short");
	}

	@Override
	public void gobble() {
		System.out.println("gobble");
	}

}
