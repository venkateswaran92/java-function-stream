package com.venkat.consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.print("c1 " + s);
		Consumer<String> c2 = s -> System.out.print("c2 " + s);

		Consumer<String> c3 = c1.AndThen(c2);
		c3.accept(" Hello ");

	}
}
