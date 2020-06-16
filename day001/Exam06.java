package day01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 >>");
	Scanner sc =new Scanner(System.in);
	int su = sc.nextInt();
	if(su>=20) {
		System.out.println(su+"세 이십니다 입장 가능 합니다");
	}else if(su>=15){
		System.out.println(su+"세 이십니다 부모님과 동반 입장 가능 합니다");
	}else {
		System.out.println(su+"세 이십니다 입장 불가능 합니다");
	}
	}
	

}
