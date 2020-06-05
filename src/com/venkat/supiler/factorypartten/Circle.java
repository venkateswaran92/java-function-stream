package com.venkat.supiler.factorypartten;

import java.awt.*;

public class Circle {
	private Color color;

	@Override
	public String toString() {
		return "Circle{" + "color=" + color + '}';
	}

	public Circle() {
		this(Color.white);
	}

	public Circle(Color color) {
		this.color = color;
	}
}
