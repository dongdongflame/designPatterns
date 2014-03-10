package org.dongdong.study.patterns.factory;

public abstract class Pizza {

	String name;

	public abstract void prepare();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
