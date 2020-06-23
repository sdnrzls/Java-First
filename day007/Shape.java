package day07;

public abstract class Shape { //�߻� Ŭ������ ���� ��ų�� ����
	protected int x; 				
	protected int y;
	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println("��ǥ(x,y)=("+x+","+y+")");
	}
	
	public abstract double getArea();
		
	
}
