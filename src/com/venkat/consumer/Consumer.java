package com.venkat.consumer;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

	void accept(T t);

	default Consumer<T> AndThen(Consumer<T> others) {
		Objects.requireNonNull(others);
		return (T t) -> {
			this.accept(t);
			others.accept(t);
		};
	}
}
