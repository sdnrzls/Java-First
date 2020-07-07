package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String>hm = new HashMap<String,String>(); //key,value
		hm.put("one","ù��°"); //one = ù��°
		hm.put("two","�ι�°");// two =�ι�°
		hm.put("three","����°");
		hm.put("fout","�׹�°");
		System.out.println(hm);
		System.out.println(hm.size()); // map�� ����
		hm.put("one","ù��°one");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two")); // get �� key�� ���� �Է��ϸ� value �� ���� �˷���
		hm.put("1","���γ���");
		System.out.println(hm);
		//key ���� ���
		for(String s : hm.keySet()) { //keyset �� key���� �˷���
			System.out.println(s);
		}
		//value
		for(String s : hm.keySet()) { 
			System.out.println(hm.get(s)); //get �� value���� �˷���
		}
		System.out.println(hm.containsKey("1"));// key�� ���� ( ) �� ������ true ������ false
		System.out.println(hm.containsValue("�ι�°"));// value�� ���� ( ) �� ������ true ������ false
		
		for(String s : hm.values()) {  //values �� value���� �˷���
			System.out.println(s);
		}
	}//main
}//class
