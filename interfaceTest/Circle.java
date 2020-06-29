package interfaceTest;

import inheritance.Shape;

public class Circle implements Shape {
	private int r;
	public Circle(int r) {
		this.r =r;
	}
	public double area() {
		return r*r*Math.PI;
		
	}
	public double circum() {
		return 2*r*Math.PI;
		
	}
}
