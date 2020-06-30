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
		if(file.exists()) {//파일이 존재한다면
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr=(ArrayList<Friend>) ois.readObject();
		}else {
			file.createNewFile(); // 파일생성
		}
	}
	private void fileuse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.친구등록 2.친구보기 3.종료(저장)");
			int num = sc.nextInt();
			sc.nextLine();
			if(num==1) {//친구등록
				System.out.println("이름>>");
				String name =sc.nextLine();
				System.out.println("생일>>");
				String birth =sc.nextLine();
				System.out.println("주소>>");
				String addr =sc.nextLine();
				System.out.println("전화>>");
				String tel =sc.nextLine();
				
				Friend f =new Friend();
				f.setName(name);
				f.setAddr(addr);
				f.setBirth(birth);
				f.setTel(tel);
				
				arr.add(f);
			
				
			}else if(num==2) {//친구보기
				for(Friend f : arr) {
					System.out.println("이름 : "+ f.getName());
					System.out.println("생일 : "+ f.getBirth());
					System.out.println("주소 : "+ f.getAddr());
					System.out.println("전화번호 : "+ f.getTel());
				}
			}else if(num==3) {//종료(저장)
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(arr);
				System.out.println("종료");
				System.exit(0);
			}else {//입력오류
				System.out.println("입력오류");
			}
		}
	}

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {//메서드에 호출시 반드시 메인에도 호출
	
		FriendMain fm = new FriendMain();
		fm.fileuse();

	}//main
}//class
