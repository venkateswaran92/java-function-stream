package com.venkat.function;

@FunctionalInterface
public interface Function<T, R> {
	R accept(T t);

}
