package com.exam02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	private HashMap<String,String>map = new  HashMap<String,String>(); //Hashmap 생성
	File dir,file; //파일 변수 생성
	static Scanner sc = new Scanner(System.in); //스캐너 생성 
	
	public  CapitalTest() {
		dir = new File("src//com//exam02"); //파일위치
		file = new File(dir,"Capital.txt"); // 파일명
		map.clear();
		try {
		if(!file.exists()) {//파일이 존재하지않는다면
			file.createNewFile();
			return;
		}
		
		} catch (IOException e) {
		e.printStackTrace();
			}
		}
	public static void showMenu() {
		System.out.println("********수도 맞추기 게임을 시작합니다.**********");
		System.out.println("입력:1, 퀴즈:2, 종료:3>>");
	}
	
	private void input() {
		System.out.println("현재 "+map.size()+"개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는x) >>");
			String nara =sc.next();
			if(nara.equals("x")) break; //입력한값이 "x"일 경우 종료
			if(map.containsKey(nara)) {
				System.out.println("이미 입력한 나라 입니다");
				continue;
			}
			String city = sc.next();
			map.put(nara, city);
		}
	}
	
	private void quiz(){
		Set<String>set=map.keySet();
		Object[]arr =set.toArray();
		while(true) {
		int n = (int)(Math.random()*map.size());
		String nara;
		try {
			 nara  = (String)arr[n];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("map이 비어 있습니다");
			return;
		}
		String city = map.get(nara);
		System.out.println(nara+"의 수도는? 종료는 x >>");
		String dap = sc.next();
		if(dap.equals("x"))break;
		if(dap.equals(city)) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		}
	}
	
	private void save() {//파일에 저장
		FileWriter fw =null;
		try {
			fw = new FileWriter(file);
			Set<String>set = map.keySet(); //해쉬맵의 키 값만 가져옴
			Iterator<String> it =set.iterator();
			while(it.hasNext()) {
				String Key = it.next();//나라 가져옴
				String value = map.get(Key);//도시 가져옴
				fw.write(Key);
				fw.write(value); 
			}
			fw.close();
			System.out.println("종료");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CapitalTest ct = new CapitalTest();
		while(true) {
			CapitalTest.showMenu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : ct.input(); break;
			case 2 : ct.quiz(); break;
			case 3 : ct.save(); break;
			default : System.out.println("입력오류");
			}
		}
		

	}//main
}//class
