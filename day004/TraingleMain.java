package day04;

import java.util.Scanner;

public class TraingleMain {

	public static void main(String[] args) {
		
		Traingle tr = new Traingle(10.2,17.3);
		System.out.println("삼각형의 면적 : " +tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(11.2);
		System.out.println("삼각형의 면적 : " +tr.getArea());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변");
		double b = sc.nextDouble();
		System.out.println("삼각형의 높이");
		double d = sc.nextDouble();
		
		Traingle tr1 = new Traingle(b,d);
		System.out.println("입력 삼각형의 면적 : " +tr1.getArea());
	}

}
