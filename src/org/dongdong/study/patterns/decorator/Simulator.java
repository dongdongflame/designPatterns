package org.dongdong.study.patterns.decorator;

public class Simulator {

	public static void main(String[] args) {

		Beverate beverate = new Espresso();

		beverate = new Mocha(beverate);
		beverate = new Soy(beverate);
		beverate = new Soy(beverate);
		beverate = new Soy(beverate);
		beverate = new Soy(beverate);
		beverate = new Mocha(beverate);

		System.out.println("description: " + beverate.getDescription() + " | cost: " + beverate.cost());

		beverate = new HouseBlend();
		beverate = new Mocha(beverate);

		System.out.println("description: " + beverate.getDescription() + " | cost: " + beverate.cost());
	}

}
