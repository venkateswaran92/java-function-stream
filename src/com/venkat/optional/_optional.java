package com.venkat.optional;

import java.util.Optional;

public class _optional {

	public static void main(String[] args) {

		final String hello = Optional.ofNullable("hello").orElseGet(() -> "deafult value");
		System.out.println(hello);

		final String hellov2 = Optional.ofNullable("hello").orElseThrow(() -> new IllegalArgumentException("error"));
		System.out.println(hellov2);

		Optional.ofNullable("hello").ifPresent(email -> {
			System.out.println("hai.." + email);
		});
	}
}
