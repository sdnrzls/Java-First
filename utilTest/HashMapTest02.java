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
		
		System.out.println("���̵� �Է� �ϼ���");
		String inputId = sc.next();
		System.out.println("��� ��ȣ�� �Է� �ϼ���");
		String inputPass = sc.next();
		
		if(map.containsKey(inputId)==false) {
			System.out.println("���̵� ���� ���� �ʽ��ϴ�");
		}else if(map.get(inputId).equals(inputPass)==false) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}else {
			System.out.println("���̵� ��� ��ġ ȯ�� �մϴ�");
		}
		
		
		
	}//main
}//class
