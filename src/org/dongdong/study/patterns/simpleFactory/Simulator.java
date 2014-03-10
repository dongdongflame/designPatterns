package org.dongdong.study.patterns.simpleFactory;

public class Simulator {

	public static void main(String[] args) {

		PizzaStore store = new PizzaStore(new SimplePizzaFactory());

		Pizza pizza = store.orderPizza("chichago");

		System.out.println(pizza.name);

	}

}
