package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendMain {
	ArrayList <Friend>arr = new ArrayList<Friend>();
	File dir,file;
	public FriendMain() throws IOException, ClassNotFoundException {
		dir =new File("src\\ioTest");
		file = new File(dir,"myFriend.txt");
		if(file.exists()) {//������ �����Ѵٸ�
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr=(ArrayList<Friend>) ois.readObject();
		}else {
			file.createNewFile(); // ���ϻ���
		}
	}
	private void fileuse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.ģ����� 2.ģ������ 3.����(����)");
			int num = sc.nextInt();
			sc.nextLine();
			if(num==1) {//ģ�����
				System.out.println("�̸�>>");
				String name =sc.nextLine();
				System.out.println("����>>");
				String birth =sc.nextLine();
				System.out.println("�ּ�>>");
				String addr =sc.nextLine();
				System.out.println("��ȭ>>");
				String tel =sc.nextLine();
				
				Friend f =new Friend();
				f.setName(name);
				f.setAddr(addr);
				f.setBirth(birth);
				f.setTel(tel);
				
				arr.add(f);
			
				
			}else if(num==2) {//ģ������
				for(Friend f : arr) {
					System.out.println("�̸� : "+ f.getName());
					System.out.println("���� : "+ f.getBirth());
					System.out.println("�ּ� : "+ f.getAddr());
					System.out.println("��ȭ��ȣ : "+ f.getTel());
				}
			}else if(num==3) {//����(����)
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(arr);
				System.out.println("����");
				System.exit(0);
			}else {//�Է¿���
				System.out.println("�Է¿���");
			}
		}
	}

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {//�޼��忡 ȣ��� �ݵ�� ���ο��� ȣ��
	
		FriendMain fm = new FriendMain();
		fm.fileuse();

	}//main
}//class
