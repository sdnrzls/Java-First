package utilTest;

public class StringTest {

	public static void main(String[] args) {
		String str = "�ȳ�";
		String str1 = "�ȳ�";
		String tmp = new String("�ȳ�");
		
		if(str==str1) {
			System.out.println("str==str1 �ּҰ���");
		} else {
		System.out.println("str==str1 �ּҴٸ���");
	}

		if(str==tmp) {
			System.out.println("str==tmp ����");
		} else {
		System.out.println("str==tmp �ٸ���");
	}
		
		if(str.equals(str1)) {
			System.out.println("str.equals(str1) ���배��");
		} else {
		System.out.println("str.equals(str1) ����ٸ���");
	}
		
		if(str.equals(tmp)) {
			System.out.println("str.equals(tmp) ���배��");
		} else {
		System.out.println("str.equals(tmp) ����ٸ���");
	}
		str=str+str1;
		if(str==str1) {
			System.out.println("�ּҰ���");
		}else {
			System.out.println("�ּҴٸ���");
		}
}//main
}//class
