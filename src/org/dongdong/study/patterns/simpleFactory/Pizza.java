package org.dongdong.study.patterns.simpleFactory;

public abstract class Pizza {

	String name;

	public abstract void prepare();

	public void bake() {
		System.out.println("It is baking...");
	}

	public void cut() {
		System.out.println("It is cuting...");
	}

	public void box() {
		System.out.println("It is boxing...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
