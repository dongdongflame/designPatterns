package org.dongdong.study.patterns.factory;

public class NewyorkStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {

		final String t = type;

		return new Pizza() {
			@Override
			public void prepare() {
				name = "newyork " + t + " style pizza";

			}
		};

	}

}
