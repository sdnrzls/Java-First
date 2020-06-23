package day07;

public abstract class Shape { //추상 클래스는 생성 시킬수 없다
	protected int x; 				
	protected int y;
	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println("좌표(x,y)=("+x+","+y+")");
	}
	
	public abstract double getArea();
		
	
}
