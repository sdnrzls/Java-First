package day07;

public class Square extends Shape{
	 private int w,h;
	 public Square(int x, int y,int w ,int h) {
		 super(x,y);
		 this.w = w;
		 this.h = h;
	 }
	 @Override
	public void print() {
		super.print();
		System.out.println("�簢���� �ʺ� : " + w);
		System.out.println("�簢���� ���� : " + h);
	}

	 @Override
public double getArea() {
		return w*h;
		}

}
