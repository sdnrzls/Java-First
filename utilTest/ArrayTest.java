package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr =new ArrayList();
		arr.add(1);
		arr.add("안녕");
		arr.add(3.2);
		System.out.println("마지막 : "+arr.get(arr.size()-1));  //메소드 접근 get(arr.size=3)-1 =2 그러므로 2번째 배열 3.2 get
		System.out.println(arr.size());  //사이즈3
		arr.add(new Integer(3));
		System.out.println(arr.size());//사이즈4
		System.out.println("마지막 : "+arr.get(arr.size()-1));//get으로 가져온 숫자 3 
		arr.remove(1);
		arr.remove("안녕");
		System.out.println("크기 : "+arr.size());//크기 3 remove한 1번째 배열과 안녕은 같은 배열이므로 
		arr.add(1,"지금자바");
		System.out.println("크기 : "+arr.size());//add로 인한 크기 4
		ArrayList<String>list = new ArrayList<String>();
		list.add("자바");
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
