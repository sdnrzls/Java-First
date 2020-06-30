package ioTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import utilTest.CapitalApp;

public class CapitalApp2 {
	private HashMap<String,String>map = new HashMap<String,String>();
	File dir,file;
	public CapitalApp2() {
		dir = new File("src\\ioTest");
		file = new File(dir,"myCapital.txt");
		map.clear();
		try {
		if(!file.exists()) {
				file.createNewFile();
				return;
		}
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {
			String country = scanner.next();//나라
			String capital = scanner.next();//도시
			map.put(country, capital);
		}
		scanner.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	private void input() {
		System.out.println("현재 "+map.size()+"개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는 x) >>");
			String cont = CapitalApp.sc.next();
			if(cont.equals("x")) break; 
				if(map.containsKey(cont)) {
					System.out.println("이미 입력한 나라 입니다");
					continue;
				}
				String sudo = CapitalApp.sc.next();
				map.put(cont, sudo);
		}
	}
	private void quiz() {
		Set<String> set =map.keySet();
		Object[]arr = set.toArray();
		while(true) {
			int n = (int)(Math.random()*map.size());
			//if(map.size()==0) return;
			//if(map.isEmpty()) return;
			String nara;
			try {
				 nara  = (String)arr[n];
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("map이 비어 있습니다");
				return;
			}
			String city = map.get(nara);
			
			System.out.println(nara +"의 수도는? 종료는 x>>");
			String dap = CapitalApp.sc.next();
			if(dap.equals("x")) break;
			if(dap.equals(city)) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
		}
		
	}
	//해쉬맵을 파일에 저장하고 종료하는 메소드
	private void save() {
		FileWriter fw =null;
		try {
			fw = new FileWriter(file);
			Set<String>set = map.keySet();//나라만 가져옴
			Iterator<String> it = set.iterator();//나라를 방문하기위해
			while(it.hasNext()) {
				String key = it.next(); //나라가져옴
				String value = map.get(key); // 수도 가져옴
				fw.write(key); // 나라출력
				fw.write(value); // 수도출력
			}
			fw.close();
			System.out.println("종료");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 저장 오류");
		}
}

	public static void main(String[] args) {
		CapitalApp2 ca2 =new CapitalApp2();
		while(true) {
			CapitalApp.showMenu();
			int choice = CapitalApp.sc.nextInt();
			
			switch(choice) {
			case	1 : ca2.input(); break;
			case 2 : ca2.quiz(); break;
			case 3 : ca2.save(); break;
			default : System.out.println("입력오류");
			}
		}
			

	}//main
}//class
