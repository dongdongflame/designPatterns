package org.dongdong.study.patterns.decorator;

public class Espresso extends Beverate {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
