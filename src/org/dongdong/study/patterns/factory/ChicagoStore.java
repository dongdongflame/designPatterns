package org.dongdong.study.patterns.factory;

public class ChicagoStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {

		final String t = type;

		return new Pizza() {

			@Override
			public void prepare() {

				name = "chicago " + t + " style pizza";

			}

		};
	}

}
