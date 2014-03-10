package org.dongdong.study.patterns.decorator;

public class HouseBlend extends Beverate {

	public HouseBlend() {
		description = "House Blend coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
