package com.venkat.functions;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println(checkNymber.test("7234567890"));

		System.out.println(checkNymber.and(checkNymberCotains).test("7234567899"));

		System.out.println(checkNymber.or(checkNymberCotains).test("7234567899"));
	}

	static Predicate<String> checkNymber = phoneNumber -> phoneNumber.startsWith("7") && phoneNumber.length() == 10;
	static Predicate<String> checkNymberCotains = phoneNumber -> phoneNumber.contains("0");

	static class phoneNumber {
		private String mobileNuber;

		public String getMobileNuber() {
			return mobileNuber;
		}

		public void setMobileNuber(String mobileNuber) {
			this.mobileNuber = mobileNuber;
		}
	}
}
