package com.exam02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	private HashMap<String,String>map = new  HashMap<String,String>(); //Hashmap ����
	File dir,file; //���� ���� ����
	static Scanner sc = new Scanner(System.in); //��ĳ�� ���� 
	
	public  CapitalTest() {
		dir = new File("src//com//exam02"); //������ġ
		file = new File(dir,"Capital.txt"); // ���ϸ�
		map.clear();
		try {
		if(!file.exists()) {//������ ���������ʴ´ٸ�
			file.createNewFile();
			return;
		}
		
		} catch (IOException e) {
		e.printStackTrace();
			}
		}
	public static void showMenu() {
		System.out.println("********���� ���߱� ������ �����մϴ�.**********");
		System.out.println("�Է�:1, ����:2, ����:3>>");
	}
	
	private void input() {
		System.out.println("���� "+map.size()+"�� ����� ���� �Է�");
		while(true) {
			System.out.println("����� ���� �Է�(�����x) >>");
			String nara =sc.next();
			if(nara.equals("x")) break; //�Է��Ѱ��� "x"�� ��� ����
			if(map.containsKey(nara)) {
				System.out.println("�̹� �Է��� ���� �Դϴ�");
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
			System.out.println("map�� ��� �ֽ��ϴ�");
			return;
		}
		String city = map.get(nara);
		System.out.println(nara+"�� ������? ����� x >>");
		String dap = sc.next();
		if(dap.equals("x"))break;
		if(dap.equals(city)) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		}
	}
	
	private void save() {//���Ͽ� ����
		FileWriter fw =null;
		try {
			fw = new FileWriter(file);
			Set<String>set = map.keySet(); //�ؽ����� Ű ���� ������
			Iterator<String> it =set.iterator();
			while(it.hasNext()) {
				String Key = it.next();//���� ������
				String value = map.get(Key);//���� ������
				fw.write(Key);
				fw.write(value); 
			}
			fw.close();
			System.out.println("����");
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
			default : System.out.println("�Է¿���");
			}
		}
		

	}//main
}//class
