package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {
	//����ڷκ��� ���� �ܾ �Է¹ް� �ѱ۴ܾ� �˻�
	//exit �Է� ������ ����
	public static void main(String[] args) {
	
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby", "�Ʊ�"); //"baby" �� key, "�Ʊ�� valye"
		dic.put("love", "���");
		dic.put("apple", "���");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �ܾ �Է��ϼ���>>");
			String eng = sc.next();
			if(eng.toLowerCase().equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			String kor =dic.get(eng);
			if(kor==null) {
				System.out.println(eng + "�� ���� �ܾ�");
			}else {
				System.out.println(kor);
			}
		}
		
		
	}//main
}//class
