package day05;

public class CircleBean {
	int r;//¹İÁö¸§
	final double PI = 3.14;
	public CircleBean(int r) {
		this.r=r;
	}
	public double getArea() {
		return r*r*PI;
	}
}
