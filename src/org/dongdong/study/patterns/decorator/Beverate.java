package org.dongdong.study.patterns.decorator;

public abstract class Beverate {

	String description = "Unknown beverate";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
