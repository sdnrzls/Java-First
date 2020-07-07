package utilTest;

public class StringTest02 {

	public static void main(String[] args) {
		String str = "안녕하세요 Hello 지금은 자바 공부중!!!";
		System.out.println("str 길이 : "+ str.length());// 문장의 길이를 찾는 함수
		System.out.println("H위치 : " + str.indexOf('H'));//지정한 문자의 위치찾는함수
		System.out.println("Hello위치 : " + str.indexOf("Hello"));//지정한 문자의 위치찾는함수
		System.out.println("4번째 문자 :  " + str.charAt(4)); //문자의 위치찾는 함수
		String tmp = "열심히 합시다";
		System.out.println("str 과 tmp 연결 : " + str+tmp);
		System.out.println("str 과 tmp 연결 : " + str.concat(tmp)); // 문자더하는 함수
		int value = 7;
		System.out.println("str 과 tmp 연결 : " + (str+value));
	
		String s =String.valueOf(value); // 다른형태를 String으로 변환 (단 static String 으로 클래스이름으로 접근가능)
		System.out.println("str 과 value 연결 : " + str.concat(s));
		System.out.println("tmp 과 value 연결 : "+tmp.concat(String.valueOf(value)));
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toUpperCase().toLowerCase());
		String[] arr = str.split(" ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}//main
}//class
