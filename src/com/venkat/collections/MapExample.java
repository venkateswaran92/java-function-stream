package com.venkat.collections;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {

		Person p1 = new Person("venkat", 23);
		Person p2 = new Person("raj", 56);
		Person p3 = new Person("kumar", 46);
		Person p4 = new Person("sundar", 28);
		Person p5 = new Person("kalai", 27);
		Person p6 = new Person("kesava", 18);
		Person p7 = new Person("barath", 15);

		City chennai = new City("chennai");
		City delhi = new City("delhi");
		City mumbai = new City("mumbai");

		Map<City, List<Person>> map = new HashMap<>();

		// check key if present in the list else create list and added to map
		map.putIfAbsent(mumbai, new ArrayList<>());
		map.get(mumbai).add(p1);

		map.computeIfAbsent(delhi, city -> new ArrayList<>()).add(p2);
		map.computeIfAbsent(delhi, city -> new ArrayList<>()).add(p3);

		// get value by key with default value as empty list if key not present in map
		System.out.println("pepole from mumbai :" + map.getOrDefault(mumbai, Collections.EMPTY_LIST));
		System.out.println("pepole from delhi :" + map.getOrDefault(delhi, Collections.EMPTY_LIST));

		// merge
		Map<City, List<Person>> map1 = new HashMap<>();

		map1.computeIfAbsent(delhi, city -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(chennai, city -> new ArrayList<>()).add(p2);
		map1.computeIfAbsent(chennai, city -> new ArrayList<>()).add(p3);

		System.out.println("map1");
		map1.forEach(((city, people) -> System.out.println(city + ": " + people)));

		Map<City, List<Person>> map2 = new HashMap<>();

		map2.computeIfAbsent(chennai, city -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(delhi, city -> new ArrayList<>()).add(p5);
		map2.computeIfAbsent(delhi, city -> new ArrayList<>()).add(p6);

		System.out.println("map2 ");
		map2.forEach(((city, people) -> System.out.println(city + ": " + people)));

		map2.forEach((city, people) -> {
			map1.merge(city, people, (fromMap1, fromMap2) -> {
				fromMap1.addAll(fromMap2);
				return fromMap1;
			});
		});

		System.out.println("Merge Map");
		map1.forEach((city, people) -> System.out.println(city + ": " + people));

	}
}
