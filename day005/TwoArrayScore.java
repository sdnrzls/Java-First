package day05;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class TwoArrayScore {
	static Scanner sc =new Scanner(System.in);
	int [][] arr = new int[50][7];
	int row = 0;
	
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.전체보기 / 종료");
		System.out.print("선택 >>");
	}
	public void inputData() { //성적 입력
		System.out.println("성적 입력 시작 >>");
		System.out.print("학번 >>");
		int yearNum = sc.nextInt();
		System.out.print("국어 >>");
		int kor = sc.nextInt();
		System.out.print("영어 >>");
		int eng = sc.nextInt();
		System.out.print("수학 >>");
		int math = sc.nextInt();
		arr[row][0] = yearNum; //학번
		arr[row][1] = kor; // 국어
		arr[row][2] = eng; // 영어
		arr[row][3] = math; // 수학
		arr[row][4] = kor+eng+math; // 총점
		arr[row][5] = arr[row][4]/3; //평균
		arr[row][6] = 1;//석차
		row++;
	}
	private void rankMethod() {
	for(int i= 0; i<row-1; i++) {
		for(int j=i+1; j<row; j++) {
			if(arr[i][4]>arr[j][4]) {
				arr[j][6]++;
			}else {
				arr[i][6]++;
			}
		}//j	
		}//i
	}
	public void viewData() { // 전체보기
		rankMethod();
		System.out.println("----성적보기----");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i = 0; i<arr.length; i++) {// for(int i = 0; i<row; i++)
			if(arr[i][0]==0) break;
			for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+"        \t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		TwoArrayScore manager = new TwoArrayScore();
		while(true) {
			manager.showMenu(); // 메뉴 보여주기
			int num = sc.nextInt();
			switch(num) {
				case 1 : manager.inputData();//성적입력
						break;
				case 2 : manager.viewData();//전체보기
							System.exit(0);
				default : System.out.println("입력오류");
			}
		}
		

	
	
	}//main
}//class
