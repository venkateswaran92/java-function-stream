package com.venkat.Stream;

import com.venkat.collections.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamExample {
	public static void main(String[] args) {
		Person p1 = new Person("venkat", 23);
		Person p2 = new Person("raj", 56);
		Person p3 = new Person("kumar", 46);
		Person p4 = new Person("sundar", 28);
		Person p5 = new Person("kalai", 27);
		Person p6 = new Person("kesava", 18);
		Person p7 = new Person("barath", 15);

		List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

		// create stream object using stream method in list interface
		people.stream().forEach(listStream -> System.out.println(listStream));

		// create stream using builder
		Stream.Builder<Person> builder = Stream.builder();
		builder.add(p1);
		builder.add(p2);
		builder.add(p3);
		builder.add(p4);
		builder.accept(p4);
		builder.build().forEach(data -> System.out.println(data));

		// create Stream using 'OF' method
		Stream<Person> personStream = Stream.of(p1, p2, p3, p4, p5, p6, p7);

		// create Empty stream
		Stream<Person> emptyStream = Stream.empty();

		// create infinite streams
		Stream<String> iteratestream = Stream.iterate("+", i -> i + "+").limit(10);
		iteratestream.forEach(itr -> System.out.println(itr));

		Stream<ArrayList> geerateStream = Stream.generate(() -> new ArrayList()).limit(10);
		geerateStream.forEach(arrayList -> System.out.println(arrayList));

		// create Array stream
		Stream<String> StreamArray = Arrays.stream(args);
	}
}
