package com.venkat.supiler.factorypartten1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory {
	final static Map<String, Supplier<? extends Shape>> map = new HashMap<>();
	static {
		map.put("c", Circle::new);
		map.put("r", Rectange::new);
	}

	public static void registerFactory(String type, Supplier<? extends Shape> supplier) {
		map.put(type, supplier);
	}

	public static Shape getInstance(String Type) {
		Supplier<? extends Shape> shape = map.get(Type);
		return shape != null ? shape.get() : null;
	}
}