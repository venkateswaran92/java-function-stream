package com.venkat.supiler.factorypartten;

import java.awt.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface Factory<T> extends Supplier<T> {

	default T getInstance() {
		return get();
	}

	default List<T> createFive() {
		return IntStream.range(0, 5).mapToObj(index -> getInstance()).collect(Collectors.toList());
	}

	static <T> Factory<T> createFactory(Supplier<T> supplier) {
		T singleton = supplier.get();
		return () -> singleton;
	}

	static <T, P> Factory<T> createFactory(Function<P, T> constructor, P color) {
		return () -> constructor.apply(color);
	}
}
