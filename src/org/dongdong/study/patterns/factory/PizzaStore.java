package org.dongdong.study.patterns.factory;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {

		Pizza pizza = createPizza(type);

		pizza.prepare();
		bake(pizza);
		cut(pizza);
		box(pizza);

		return pizza;

	}

	public void bake(Pizza pizza) {
		System.out.println(pizza.getName() + " is baking...");
	}

	public void cut(Pizza pizza) {
		System.out.println(pizza.getName() + " is cuting...");
	}

	public void box(Pizza pizza) {
		System.out.println(pizza.getName() + " is boxing...");
	}

}
