package com.venkat.predicate;

@FunctionalInterface
public interface Predicate<T> {

	public boolean test(T t);

	default public Predicate<T> and(Predicate<T> other) {
		return t -> this.test(t) && other.test(t);
	}

	default public Predicate<T> or(Predicate<T> other) {
		return t -> this.test(t) || other.test(t);
	}

	static public <U> Predicate<U> isEqualsTo(U u) {
		return s -> s.equals(u);
	}
}
