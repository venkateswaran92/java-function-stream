package com.venkat.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {

		greet(new Customer("venkat", "12334"));
		customerConsumer.accept((new Customer("venkat", "12334")));
		customerConsumerv2.accept((new Customer("venkat", "12334")), false);
	}

	static void greet(Customer customer) {
		System.out.println(customer.name + "and" + customer.phoneNumber);
	}

	// consumer interface
	static Consumer<Customer> customerConsumer = customer -> System.out
			.println(customer.name + "and" + customer.phoneNumber);

	// bi-consumer interface
	static BiConsumer<Customer, Boolean> customerConsumerv2 = (customer, showPhoneNuber) -> System.out
			.println(customer.name + " and password " + (showPhoneNuber ? customer.phoneNumber : "*******"));

	static class Customer {
		private String name;
		private String phoneNumber;

		public Customer(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
	}
}
