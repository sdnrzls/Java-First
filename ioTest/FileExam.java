package ioTest;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+"= "+f1.getParent()+":"+f1.getName());
		String res= "";
		if(f1.isFile())res = "파일";
		else if(f1.isDirectory())res ="디렉토리";
		System.out.println(f1.getPath()+"은"+res+"입니다");
		
		File f2 = new File("folder");
		if(f2.isFile())res = "파일";
		else if(f2.isDirectory())res ="디렉토리";
		System.out.println(f2.getPath()+"은"+res+"입니다");
		if(!f2.exists()) {
			System.out.println("파일없음");
		}
		
		System.out.println("---서브 리스트---");
		File[] subFiles = f2.listFiles();//파일을 배열형태로 알려주다
		for(int i =0; i<subFiles.length; i++) {
			File f= subFiles[i];
			long t = f.lastModified();//마지막 수정 날짜를 알려주다
			System.out.println(f.getName());//파일이름
			System.out.println("파일 크기 : " + f.length());//파일크기
			System.out.printf("수정한 시간 : %tb %td %ta %tT\n",t,t,t,t); //t월 t일 t:t:t
		}
		
	}//main

}//class
