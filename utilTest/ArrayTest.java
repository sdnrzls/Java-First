package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr =new ArrayList();
		arr.add(1);
		arr.add("�ȳ�");
		arr.add(3.2);
		System.out.println("������ : "+arr.get(arr.size()-1));  //�޼ҵ� ���� get(arr.size=3)-1 =2 �׷��Ƿ� 2��° �迭 3.2 get
		System.out.println(arr.size());  //������3
		arr.add(new Integer(3));
		System.out.println(arr.size());//������4
		System.out.println("������ : "+arr.get(arr.size()-1));//get���� ������ ���� 3 
		arr.remove(1);
		arr.remove("�ȳ�");
		System.out.println("ũ�� : "+arr.size());//ũ�� 3 remove�� 1��° �迭�� �ȳ��� ���� �迭�̹Ƿ� 
		arr.add(1,"�����ڹ�");
		System.out.println("ũ�� : "+arr.size());//add�� ���� ũ�� 4
		ArrayList<String>list = new ArrayList<String>();
		list.add("�ڹ�");
		list.add("Java");
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		for(int i = 0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		for(String s: list) {
			System.out.print(s + "\t");
		}
	}

}
