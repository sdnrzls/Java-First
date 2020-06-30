package review;

import java.util.Scanner;

public class TestArray {
	Scanner sc =new Scanner(System.in);
	int [][] arr = new int [50][7];
	int row = 0;
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.전체보기 / 종료");
		System.out.print("선택 >>");
	}
	
	public void inputData() { //성적 입력
		System.out.println("성적 입력");
		System.out.println("학번 입력 >>");
		int years = sc.nextInt();
		System.out.println("국어 점수 입력 >>");
		int kor = sc.nextInt();
		System.out.print("영어 >>");
		int eng = sc.nextInt();
		System.out.print("수학 >>");
		int math = sc.nextInt();
		arr[row][0] = years;
		arr[row][1] = kor;
		arr[row][2] = eng;
		arr[row][3] = math;
		
	}
	
}//class
