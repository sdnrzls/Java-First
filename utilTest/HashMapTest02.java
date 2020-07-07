package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("java","1111");
		map.put("oracle","1234");
		map.put("jsp","abcd");
		
		System.out.println("아이디를 입력 하세요");
		String inputId = sc.next();
		System.out.println("비밀 번호를 입력 하세요");
		String inputPass = sc.next();
		
		if(map.containsKey(inputId)==false) {
			System.out.println("아이디가 존재 하지 않습니다");
		}else if(map.get(inputId).equals(inputPass)==false) {
			System.out.println("비밀번호가 틀렸습니다");
		}else {
			System.out.println("아이디 비번 일치 환영 합니다");
		}
		
		
		
	}//main
}//class
