package com.venkat.functions;

import java.util.function.Supplier;

public class _suppiler {

	public static void main(String[] args) {
		System.out.println(getConnection.get());
	}

	static Supplier<String> getConnection = () -> "jdbc://localhost:8080";
}
