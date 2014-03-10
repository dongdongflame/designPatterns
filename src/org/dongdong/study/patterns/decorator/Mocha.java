package org.dongdong.study.patterns.decorator;

public class Mocha extends CondimentDecorator {

	Beverate beverate;

	public Mocha(Beverate beverate) {
		this.beverate = beverate;
	}

	@Override
	public String getDescription() {
		return beverate.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverate.cost() + .20;
	}

}
