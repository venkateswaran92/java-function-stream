package com.venkat.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		Person p1 = new Person("venkat", 23);
		Person p2 = new Person("raj", 56);
		Person p3 = new Person("kumar", 46);
		Person p4 = new Person("sundar", 28);
		Person p5 = new Person("kalai", 27);
		Person p6 = new Person("kesava", 18);
		Person p7 = new Person("barath", 15);

		List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

		// removeIf
		people.removeIf(person -> person.getAge() < 30);
		// replaceAll
		people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
		// sort
		people.sort(Comparator.comparing(person -> person.getAge()));
		// forEach
		people.forEach(person -> System.out.println(person));
	}
}
