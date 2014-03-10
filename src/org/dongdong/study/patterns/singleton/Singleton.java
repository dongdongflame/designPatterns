package org.dongdong.study.patterns.singleton;

public class Singleton {

	private Singleton() {
	}

	private static Singleton instance = null;

	public static Singleton instance() {
		if (instance != null)
			return instance;
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
