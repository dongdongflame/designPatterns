package org.dongdong.study.patterns.template;

public class Simulator {

	public static void main(String args[]) {

		CaffeineBeverage tea = new Tea();
		tea.preparedRecipe();

		System.out.println();

		CaffeineBeverage coffee = new Coffee();
		coffee.preparedRecipe();

		System.out.println();

		CaffeineBeverage coffee2 = new Coffee();
		coffee2.setCustomerWantsCondiments(false);
		coffee2.preparedRecipe();

	}

}
