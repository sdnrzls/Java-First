package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String>hm = new HashMap<String,String>(); //key,value
		hm.put("one","첫번째"); //one = 첫번째
		hm.put("two","두번째");// two =두번째
		hm.put("three","세번째");
		hm.put("fout","네번째");
		System.out.println(hm);
		System.out.println(hm.size()); // map의 갯수
		hm.put("one","첫번째one");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two")); // get 은 key의 값을 입력하면 value 의 값을 알려줌
		hm.put("1","새로넣음");
		System.out.println(hm);
		//key 값을 출력
		for(String s : hm.keySet()) { //keyset 은 key값을 알려줌
			System.out.println(s);
		}
		//value
		for(String s : hm.keySet()) { 
			System.out.println(hm.get(s)); //get 은 value값을 알려줌
		}
		System.out.println(hm.containsKey("1"));// key의 값에 ( ) 이 있으면 true 없으면 false
		System.out.println(hm.containsValue("두번째"));// value의 값에 ( ) 이 있으면 true 없으면 false
		
		for(String s : hm.values()) {  //values 은 value값을 알려줌
			System.out.println(s);
		}
	}//main
}//class
