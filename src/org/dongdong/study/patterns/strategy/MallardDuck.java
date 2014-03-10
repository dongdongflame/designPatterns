package org.dongdong.study.patterns.strategy;


public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I'm really mallard duck!");
	}

}
