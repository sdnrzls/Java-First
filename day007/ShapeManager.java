package day07;

public class ShapeManager {
	Shape[] arr = new Shape[50];
	int cnt;

	public void inputData(int num) {
		System.out.println("도형 입력.....");
		System.out.print("x좌표>>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y좌표>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) {
			System.out.print("반지름>>");
			int r = ShapeMain.sc.nextInt();
			arr[cnt++] = new Circle(x,y,r);
					
		}else if(num==2) {
			System.out.print("너비좌표>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("높이좌표>>");
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
		//전체 도형의 합
		System.out.println("전체 넓이 : " + sum);
	}
	
	
}//class
