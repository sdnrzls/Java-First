package day07;

import java.util.Scanner;

public class ShapeMain {
	static Scanner sc =new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("선택하세요");
		System.out.println("1.원 2.사각형 3.보기 4.종료");
		System.out.println("선택 : ");
	}
	public static void main(String[] args) {
	ShapeManager sm = new ShapeManager();
			
			while(true) {
			showMenu();
			int num = sc.nextInt();
			switch(num){
				case 1 :sm.inputData(num);
				break;
				case 2 : sm.inputData(num);
				break;
				case 3 : sm.viewData();
				break;
				case 4 : System.out.println("종료");
						System.exit(0);
				default : System.out.println("입력오류");
				}
		}
	
	
	}//main
}//class
