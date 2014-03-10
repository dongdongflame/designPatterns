package org.dongdong.study.patterns.decorator;

public class Soy extends CondimentDecorator {

	Beverate beverate;

	public Soy(Beverate beverate) {
		this.beverate = beverate;
	}

	@Override
	public String getDescription() {
		return this.beverate.getDescription() + ", soy";
	}

	@Override
	public double cost() {
		return beverate.cost() + .12;
	}

}
