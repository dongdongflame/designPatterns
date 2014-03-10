package org.dongdong.study.patterns.strategy;


public class Simulator {

	public static void main(String args[]) {

		Duck mallard = new MallardDuck();
		Duck Model = new ModelDuck();

		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		System.out.println();

		Model.display();
		Model.performFly();
		Model.performQuack();

	}

}
