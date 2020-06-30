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
			String country = scanner.next();//����
			String capital = scanner.next();//����
			map.put(country, capital);
		}
		scanner.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	private void input() {
		System.out.println("���� "+map.size()+"�� ����� ���� �Է�");
		while(true) {
			System.out.println("����� ���� �Է�(����� x) >>");
			String cont = CapitalApp.sc.next();
			if(cont.equals("x")) break; 
				if(map.containsKey(cont)) {
					System.out.println("�̹� �Է��� ���� �Դϴ�");
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
				System.out.println("map�� ��� �ֽ��ϴ�");
				return;
			}
			String city = map.get(nara);
			
			System.out.println(nara +"�� ������? ����� x>>");
			String dap = CapitalApp.sc.next();
			if(dap.equals("x")) break;
			if(dap.equals(city)) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
		}
		
	}
	//�ؽ����� ���Ͽ� �����ϰ� �����ϴ� �޼ҵ�
	private void save() {
		FileWriter fw =null;
		try {
			fw = new FileWriter(file);
			Set<String>set = map.keySet();//���� ������
			Iterator<String> it = set.iterator();//���� �湮�ϱ�����
			while(it.hasNext()) {
				String key = it.next(); //��������
				String value = map.get(key); // ���� ������
				fw.write(key); // �������
				fw.write(value); // �������
			}
			fw.close();
			System.out.println("����");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
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
			default : System.out.println("�Է¿���");
			}
		}
			

	}//main
}//class
