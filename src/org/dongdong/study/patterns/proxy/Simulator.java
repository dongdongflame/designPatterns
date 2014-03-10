package org.dongdong.study.patterns.proxy;

public class Simulator {

	public static void main(String[] args) {

		People a = new A();

		People p = new Proxy(a);

		a.eat();
		a.read();
		p.eat();
		p.read();
		
		
	}

}
