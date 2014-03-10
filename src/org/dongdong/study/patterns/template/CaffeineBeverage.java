package org.dongdong.study.patterns.template;

public abstract class CaffeineBeverage {

	final void preparedRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Bolling water");
	}

	void pourInCup() {
		System.out.println("pouring into cup");
	}

	boolean customerWantsCondiments = true;

	public void setCustomerWantsCondiments(boolean customerWantsCondiments) {
		this.customerWantsCondiments = customerWantsCondiments;
	}

}
