package org.dongdong.study.patterns.adapter;

public class Simulator {

	public static void main(String args[]) {

		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();

		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

		duck.display();
		duck.swim();
		duck.fly();
		duck.quack();

		System.out.println();

		turkey.display();
		turkey.swim();
		turkey.fly();
		turkey.gobble();

		System.out.println();

		turkeyAdapter.display();
		turkeyAdapter.swim();
		turkeyAdapter.fly();
		turkeyAdapter.quack();

	}

}
