package org.dongdong.study.patterns.simpleFactory;

public class PizzaStore {

	SimplePizzaFactory pizzaFactory = null;

	PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.pizzaFactory = simplePizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = pizzaFactory.makePizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
