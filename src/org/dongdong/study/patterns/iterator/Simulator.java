package org.dongdong.study.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

	public static void main(String args[]) {

		String[] peoples = { "boy", "girl", "male", "female", "old" };

		List<String> animals = new ArrayList<>();
		animals.add("pig");
		animals.add("dog");
		animals.add("butteyfly");

		Iterator p = new Simulator.PeopleIterator(peoples);
		Iterator a = new AnimalIterator(animals);

		while (p.hasnext()) {
			System.out.println(p.next());
		}

		while (a.hasnext()) {
			System.out.println(a.next());
		}

	}

	interface Iterator {

		boolean hasnext();

		Object next();

	}

	static class PeopleIterator implements Iterator {

		int position = 0;
		String[] peoples;

		public PeopleIterator(String[] peoples) {
			this.peoples = peoples;
		}

		@Override
		public boolean hasnext() {
			if (position >= peoples.length || peoples[position] == null)
				return false;
			else
				return true;
		}

		@Override
		public Object next() {
			String people = peoples[position];
			position++;
			return people;
		}
	}

	static class AnimalIterator implements Iterator {

		int position = 0;
		List<String> animals;

		public AnimalIterator(List<String> animals) {
			this.animals = animals;
		}

		@Override
		public boolean hasnext() {
			if (position >= animals.size() || animals.get(position) == null)
				return false;
			else
				return true;
		}

		@Override
		public Object next() {
			String people = animals.get(position);
			position++;
			return people;
		}

	}

}
