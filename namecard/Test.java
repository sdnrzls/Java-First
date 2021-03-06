package com.oracle.namecard;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//DB드라이버 로드됨
        NamecardDao dao = new NamecardDao();
        //Scanner sc = new Scanner(System.in);
         
        /*
        //1.insert(Namecard) test: 입력하기
        Namecard hong = new Namecard("KING","010-5398-1051", "hh@naver.com", "부산IT");
        dao.insert(hong); //실행후 sql developer 확인
        */

        
        
        /*
        //2.selectAll() test: 다 가져와서 리스트에 입력한후 콘솔에 출력
        ArrayList<Namecard> list = dao.selectAll();
        int size = list.size();
        //System.out.println(size);
        for (int i = 0; i < size; i++) {
            Namecard card = list.get(i);
            System.out.println(card);
        }
        */

        /*
        //3.selectByKeyword(String) test: 이름으로 찾기
        System.out.println("찾을 이름을 입력하세요");
        String name = sc.next();
        ArrayList<Namecard> matched = dao.selectByKeyword(name);
        int length = matched.size();
        System.out.println(length + "명 찾음.");
        for (int i = 0; i < length; i++) {
            Namecard namecard = matched.get(i);
            System.out.println(namecard);
        }
		*/

        
        /*
        //4.selectOne(int) test : 번호로 찾기
        Namecard card = dao.selectOne(5);
        System.out.println("5번 찾음");
        System.out.println(card.toString());
        */

        /*
        //5.delete(int) test : 번호로 삭제하기
        dao.delete(5);
        ArrayList<Namecard> all = dao.selectAll();
        int cardNum = all.size();
        for (int i = 0; i < cardNum; i++) {
            Namecard namecard = all.get(i);
            System.out.println(namecard);
        }
        */

        
        //6. update(Namecard) test :  card의 no번호와 같은 NAMECARD 행을  이름, 전화번호, 이메일, 회사 업데이트(수정하기)
        Namecard card = dao.selectOne(7);//DB에서 가져온뒤 카드에 대입
        System.out.println(card);
        
        card.setEmail("lalala@daum.net");
        card.setMobile("999-9999-9999");
        dao.update(card);
        
        System.out.println(card);
         
    }
}
