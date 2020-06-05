package com.venkat.function;

public class FunctionExample {
	public static void main(String[] args) {

		metro metro1 = new metro(20);

		Function<metro, Integer> readCelsius = metro -> metro.getTeperature();
		Function<Integer, Double> readFaherheit = t -> t * 9d / 5 + 32;

	}
}
