package day07;

public class ShapeManager {
	Shape[] arr = new Shape[50];
	int cnt;

	public void inputData(int num) {
		System.out.println("���� �Է�.....");
		System.out.print("x��ǥ>>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y��ǥ>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) {
			System.out.print("������>>");
			int r = ShapeMain.sc.nextInt();
			arr[cnt++] = new Circle(x,y,r);
					
		}else if(num==2) {
			System.out.print("�ʺ���ǥ>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("������ǥ>>");
			int h = ShapeMain.sc.nextInt();
			arr[cnt++] = new Square(x,y,w,h);
		}
	}
	
	public void viewData() {
		double sum = 0;
		for(Shape  s : arr) {
			if(s==null) break;
			sum +=s.getArea();
			s.print();
		}
		//��ü ������ ��
		System.out.println("��ü ���� : " + sum);
	}
	
	
}//class
