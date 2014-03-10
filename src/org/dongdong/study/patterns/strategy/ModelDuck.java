package org.dongdong.study.patterns.strategy;


public class ModelDuck extends Duck {

	public ModelDuck() {
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
