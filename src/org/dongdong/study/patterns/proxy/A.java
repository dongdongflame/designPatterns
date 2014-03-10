package org.dongdong.study.patterns.proxy;

public class A implements People {

	@Override
	public void eat() {
		System.out.println("A eat");
	}

	@Override
	public void read() {
		System.out.println("A read");
	}

}
