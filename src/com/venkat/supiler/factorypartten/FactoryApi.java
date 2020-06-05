package com.venkat.supiler.factorypartten;

import java.awt.*;
import java.util.List;

public class FactoryApi {
	public static void main(String[] args) {

		Factory<Circle> factory1 = Factory.createFactory(Circle::new, Color.red);
		Factory<Circle> factory2 = Factory.createFactory(Circle::new);

		Circle circle = factory1.getInstance();
		System.out.println("Circle: " + circle);

		List<Circle> list = factory2.createFive();
		System.out.println("Circle List: " + list);

	}
}
