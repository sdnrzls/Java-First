package utilTest;

public class StringTest {

	public static void main(String[] args) {
		String str = "안녕";
		String str1 = "안녕";
		String tmp = new String("안녕");
		
		if(str==str1) {
			System.out.println("str==str1 주소같다");
		} else {
		System.out.println("str==str1 주소다르다");
	}

		if(str==tmp) {
			System.out.println("str==tmp 같다");
		} else {
		System.out.println("str==tmp 다르다");
	}
		
		if(str.equals(str1)) {
			System.out.println("str.equals(str1) 내용같다");
		} else {
		System.out.println("str.equals(str1) 내용다르다");
	}
		
		if(str.equals(tmp)) {
			System.out.println("str.equals(tmp) 내용같다");
		} else {
		System.out.println("str.equals(tmp) 내용다르다");
	}
		str=str+str1;
		if(str==str1) {
			System.out.println("주소같다");
		}else {
			System.out.println("주소다르다");
		}
}//main
}//class
