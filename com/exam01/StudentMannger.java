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

public class StudentMannger { // Ŭ���� ����
	static Scanner sc = new Scanner(System.in); //��ĳ�� ����
	ArrayList<Student>arr = new ArrayList<Student>(); //ArrayList ����
	File dir,file; // ���� ���� ����
	
	public StudentMannger() throws FileNotFoundException, IOException, ClassNotFoundException { //throws
		dir= new File("src//com//exam01"); //���� ��ġ
		file = new File(dir,"Student.txt");// ���� ��
		if(!file.exists()) { //������ ���������ʴ´ٸ�
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
			arr=(ArrayList<Student>)ois.readObject();
		}else {
			file.createNewFile();// �����Ұ�� �� ����
		}
	}
	
	public static void showMenu() {
	System.out.println("�����ϼ���");
	System.out.println("1.������ �Է�");
	System.out.println("2.��ü����");
	System.out.println("3.�л�ã��");
	System.out.println("4.����/����");
	System.out.println("����>>");
	}
	
	public void input() {
	while(true) {
		System.out.println("�л����� �Է� : �̸�,�а�,�й�,����");
		try {
		String text= sc.nextLine(); //text��� �Է��� ���� String �� ����
		if(text.equals("x")) { // text�� "x"�� ���ٸ�
			System.out.println("�Է�����");
			break;
		}
		StringTokenizer st =new StringTokenizer(text,","); //StringTokenizer�� text�� "," �������� ����
		String name = st.nextToken(); //�̸� 
		String major = st.nextToken(); //�а�
		String hack = st.nextToken(); //�й�
		double grade = Double.parseDouble(st.nextToken());//����
		arr.add(new Student(name,major,hack,grade)); //�Է��� ������ �迭�� ����
		}catch(Exception e){
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		}	
	}
	
	public void view() {
		System.out.println("�л� ��ü ����Ʈ....");
		for(Student student : arr) { //�迭���ִ� ������ for-each���� ���� �ݺ��ϸ� ��ü ǥ����
			System.out.println("�̸� : " + student.getName());
			System.out.println("�а� : " + student.getMajor());
			System.out.println("�й� : " + student.getHack());
			System.out.println("���� : " + student.getGrade());
			System.out.println("======================");
		}
	}
	
	public void find() {
		 System.out.println("�л� ã��....");
		 System.out.println("ã�� �л� �̸� >>");
		 String searhName = sc.next();
		 Student s = search(searhName);
		 if(s==null) { //�Է��� ���� null�� ���
			 System.out.println("ã�� �л� ����");
			 return;
		 }
		 System.out.println("�̸�:" + s.getName());
		System.out.println("�а�:" + s.getMajor());
		System.out.println("�й�:" + s.getHack());
		System.out.println("�������:" + s.getGrade());
	 }
	
		
		 private Student search(String searhName){
			 for(int i=0;i<arr.size();i++) {
				 if(searhName.equals(arr.get(i).getName())) { //searchName�� arr�� i��ġ�� �̸��� ���ٸ�
					 return arr.get(i);
				 }
			 }
			 return null;
		 }
	
	
	public void save() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));// �迭�� ����� ���� ���Ͽ� ���
		oos.writeObject(arr);
		System.out.println("����");
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
			default : System.out.println("�Է¿���");
			}
		}
		
	}//main
}//class
