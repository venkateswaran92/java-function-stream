package com.venkat.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {

		// function example
		int increment = incrementByOne.apply(1);
		System.out.println(increment);

		Function<Integer, Integer> incrementByOneAndThen = incrementByOne.andThen(mutipleByOne);
		int andThenResult = incrementByOneAndThen.apply(1);
		System.out.println(andThenResult);

		// bifunction takes two arguents and produce one result
		Integer bifunctionResult = incrementAndMutipleByFunction.apply(4, 100);
		System.out.println(bifunctionResult);
	}

	// declerative style
	static int increment(int number) {
		return number + 1;
	}

	// function interface
	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	static Function<Integer, Integer> mutipleByOne = number -> number * 10;

	// declerative style
	static int incrementAndMutiple(int number, int multiple) {
		return (number + 10) * multiple;
	}

	// BiFunction interface
	static BiFunction<Integer, Integer, Integer> incrementAndMutipleByFunction = (incrementByOne,
			mutiple) -> (incrementByOne + 1) * mutiple;
}
