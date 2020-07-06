package com.exam01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMannger { // 클래스 생성
	static Scanner sc = new Scanner(System.in); //스캐너 생성
	ArrayList<Student>arr = new ArrayList<Student>(); //ArrayList 생성
	File dir,file; // 파일 변수 생성
	
	public StudentMannger() throws FileNotFoundException, IOException, ClassNotFoundException { //throws
		dir= new File("src//com//exam01"); //파일 위치
		file = new File(dir,"Student.txt");// 파일 명
		if(!file.exists()) { //파일이 존재하지않는다면
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
			arr=(ArrayList<Student>)ois.readObject();
		}else {
			file.createNewFile();// 존재할경우 새 파일
		}
	}
	
	public static void showMenu() {
	System.out.println("선택하세요");
	System.out.println("1.데이터 입력");
	System.out.println("2.전체보기");
	System.out.println("3.학생찾기");
	System.out.println("4.저장/종료");
	System.out.println("선택>>");
	}
	
	public void input() {
	while(true) {
		System.out.println("학생정보 입력 : 이름,학과,학번,학점");
		try {
		String text= sc.nextLine(); //text라는 입력한 값을 String 에 넣음
		if(text.equals("x")) { // text가 "x"와 같다면
			System.out.println("입력종료");
			break;
		}
		StringTokenizer st =new StringTokenizer(text,","); //StringTokenizer로 text를 "," 기준으로 나눔
		String name = st.nextToken(); //이름 
		String major = st.nextToken(); //학과
		String hack = st.nextToken(); //학번
		double grade = Double.parseDouble(st.nextToken());//학점
		arr.add(new Student(name,major,hack,grade)); //입력한 값들을 배열에 넣음
		}catch(Exception e){
			System.out.println("잘못 입력 하셨습니다.");
		}
		}	
	}
	
	public void view() {
		System.out.println("학생 전체 리스트....");
		for(Student student : arr) { //배열에있는 값들을 for-each문을 통해 반복하면 전체 표시함
			System.out.println("이름 : " + student.getName());
			System.out.println("학과 : " + student.getMajor());
			System.out.println("학번 : " + student.getHack());
			System.out.println("학점 : " + student.getGrade());
			System.out.println("======================");
		}
	}
	
	public void find() {
		 System.out.println("학생 찾기....");
		 System.out.println("찾을 학생 이름 >>");
		 String searhName = sc.next();
		 Student s = search(searhName);
		 if(s==null) { //입력한 값이 null일 경우
			 System.out.println("찾는 학생 없음");
			 return;
		 }
		 System.out.println("이름:" + s.getName());
		System.out.println("학과:" + s.getMajor());
		System.out.println("학번:" + s.getHack());
		System.out.println("학점평균:" + s.getGrade());
	 }
	
		
		 private Student search(String searhName){
			 for(int i=0;i<arr.size();i++) {
				 if(searhName.equals(arr.get(i).getName())) { //searchName이 arr의 i위치에 이름과 같다면
					 return arr.get(i);
				 }
			 }
			 return null;
		 }
	
	
	public void save() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));// 배열에 저장된 값을 파일에 출력
		oos.writeObject(arr);
		System.out.println("종료");
		System.exit(0);
	}

	public static void main(String[]args) throws FileNotFoundException, ClassNotFoundException, IOException {
		StudentMannger sm = new StudentMannger();
		while(true) {
			StudentMannger.showMenu();
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case	1 : sm.input(); break;
			case 2 : sm.view(); break;
			case 3 : sm.find(); break;
			case 4 : sm.save(); break;
			default : System.out.println("입력오류");
			}
		}
		
	}//main
}//class
