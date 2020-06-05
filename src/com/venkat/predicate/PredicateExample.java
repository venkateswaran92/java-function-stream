package com.venkat.predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> s1 = s -> s.length() < 20;
		Predicate<String> s2 = s -> s.length() > 5;

		Boolean result = s1.test("hello");
		System.out.println(result);

		// And operation
		Predicate<String> andOperation = s1.and(s2);
		System.out.println(andOperation.test("hello world !!"));

		// OR operation
		Predicate<String> orOperation = s1.or(s2);
		System.out.println(orOperation.test("hello world !!"));

		// Equals
		Predicate<String> s3 = Predicate.isEqualsTo("test");
		System.out.println(s2.test("yest"));
		System.out.println(s2.test("test"));

	}
}
