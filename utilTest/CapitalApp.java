package utilTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc = new Scanner(System.in);
	private HashMap<String,String>map = new HashMap<String,String>();
	public CapitalApp() {
		map.put("한국", "서울");
		map.put("일본", "동경");
		map.put("중국", "베이징");
		map.put("미국", "워싱턴");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
	}
	public static void showMenu() {
		System.out.println("********수도 맞추기 게임을 시작합니다.**********");
		System.out.println("입력:1, 퀴즈:2, 종료:3>>");
	}
	
	private void input() {
		System.out.println("현재 " + map.size() + "개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는 x)>>");
			String cont = sc.next();
			if(cont.equals("x")) break;
			//맵에 입력한 나라가 있는지 확인
			if(map.containsKey(cont)){//mpap에 입력한 나라가 있음
				System.out.println("이미 입력한 나라 입니다");
				continue;
			}
			String sudo = sc.next();
			map.put(cont, sudo);
			}
		}
	
	
	//컴퓨터가 랜덤하게 나라를 알려주면 그에 대한
	//수도를 입력하면 정답, 오답 판단해줌
	private void test() {
		Set<String> set = map.keySet();
		//배열로 변환
		Object[] arr = set.toArray(); //set을 배열 형태로 변환 (순서를 알기 위해서)
		while(true) {
			int n = (int)(Math.random()*map.size());
			//나라이름
			String nara = (String)arr[n];
			String  city= map.get(nara);
			
			//문제 출제
			System.out.println(nara + "의 수도는? 종료는 x>>");
			String dap = sc.next();
			if(dap.equals("x")) break;
			if(dap.equals(city)) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
		}
	}
		
	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while(true) {
			CapitalApp.showMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case	1 : ca.input(); break;
			case 2 : ca.test(); break;
			case 3 : System.out.println("종료");
						System.exit(0);
			default : System.out.println("입력오류");
			}
		}
		
		
	}//main
}//class
	


