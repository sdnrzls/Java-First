package day07;

public class Circle extends Shape {
	private int r;
	public Circle(int x,int y, int r) {
		super(x,y);
		this.r = r;	
	}
	@Override
	public void print() {
		super.print();
		System.out.println("¹İÁö¸§ :" +r);
	}
	@Override
	public double getArea() {
		return r*r*3.14;
	}
	
}
