package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		// 1.해쉬맵 map 을 생성
		//2. 단어를 입력 받아 단어와 입력 횟수 저장
		//3.대소문자 구문없이 x 치면 종료
		//4.map출력

		HashMap<String,Integer>map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.println("단어를 입력 하세요 // 종료 x>>");
					String word = sc.next();
					if(word.toLowerCase().equals("x")) break;
					if(map.containsKey(word)) {// map에 단어가 있으면 1 더하기
						map.put(word, map.get(word)+1);
					}else { //map 에 단어가 없으면 1추가
						map.put(word, 1);
					}
				}//while
			
				System.out.println(map);
		
			
			
			
		
			
	}//main
	
}//class
