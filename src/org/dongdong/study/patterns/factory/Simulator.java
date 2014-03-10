package org.dongdong.study.patterns.factory;

public class Simulator {

	public static void main(String[] args) {

		PizzaStore chicago = new ChicagoStore();
		String cName = chicago.orderPizza("cheese").getName();
		System.out.println("chicago pizza: " + cName);

		PizzaStore newyork = new NewyorkStore();
		String nName = newyork.orderPizza(" spicy").getName();
		System.out.println("newyord pizza: " + nName);

	}

}
