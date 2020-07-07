package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {
	//사용자로부터 영어 단어를 입력받고 한글단어 검색
	//exit 입력 받으면 종료
	public static void main(String[] args) {
	
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby", "아기"); //"baby" 는 key, "아기는 valye"
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("영어 단어를 입력하세요>>");
			String eng = sc.next();
			if(eng.toLowerCase().equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			String kor =dic.get(eng);
			if(kor==null) {
				System.out.println(eng + "는 없는 단어");
			}else {
				System.out.println(kor);
			}
		}
		
		
	}//main
}//class
