package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		// 1.�ؽ��� map �� ����
		//2. �ܾ �Է� �޾� �ܾ�� �Է� Ƚ�� ����
		//3.��ҹ��� �������� x ġ�� ����
		//4.map���

		HashMap<String,Integer>map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.println("�ܾ �Է� �ϼ��� // ���� x>>");
					String word = sc.next();
					if(word.toLowerCase().equals("x")) break;
					if(map.containsKey(word)) {// map�� �ܾ ������ 1 ���ϱ�
						map.put(word, map.get(word)+1);
					}else { //map �� �ܾ ������ 1�߰�
						map.put(word, 1);
					}
				}//while
			
				System.out.println(map);
		
			
			
			
		
			
	}//main
	
}//class
