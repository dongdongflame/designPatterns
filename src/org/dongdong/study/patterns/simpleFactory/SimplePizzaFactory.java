package org.dongdong.study.patterns.simpleFactory;

public class SimplePizzaFactory {

	public Pizza makePizza() {
		return new Pizza() {
			@Override
			public void prepare() {
				setName("Chichago pizza");
			}
		};
	}

}
