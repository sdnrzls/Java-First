package utilTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		//1���� 20������ ���� 10���� map�� �����ÿ�
		//�� �ߺ��� ������ ��� ���� �ʴ´�
		
		Map<Integer,Integer>hm = new HashMap<Integer,Integer>();
		for(int i=1; i<11; i++) {
			while(true) {
				int value = (int)(Math.random()*20)+1;
				if(!hm.containsValue(value)) {
					hm.put(i, value);
					break;
			}
			}//while
		}//for
		System.out.println(hm);
		
		for(Integer i : hm.values()) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
	
		List<Integer>list = new ArrayList<Integer>(hm.values());
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		Collections.reverse(list);
		for(int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("�ִ밪 : " +Collections.max(list));
		System.out.println("�ּҰ� : " +Collections.min(list));
		
	}//main
}//class
