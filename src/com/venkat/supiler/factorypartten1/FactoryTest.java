package com.venkat.supiler.factorypartten1;

public class FactoryTest {
	public static void main(String[] args) {
		// Factory.registerFactory("c",circle::new);
		// Factory.registerFactory("r",Rectange::new);
		Shape obj = Factory.getInstance("c");
		obj.draw();
	}
}
