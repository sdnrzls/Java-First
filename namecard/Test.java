package com.oracle.namecard;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//DB����̹� �ε��
        NamecardDao dao = new NamecardDao();
        //Scanner sc = new Scanner(System.in);
         
        /*
        //1.insert(Namecard) test: �Է��ϱ�
        Namecard hong = new Namecard("KING","010-5398-1051", "hh@naver.com", "�λ�IT");
        dao.insert(hong); //������ sql developer Ȯ��
        */

        
        
        /*
        //2.selectAll() test: �� �����ͼ� ����Ʈ�� �Է����� �ֿܼ� ���
        ArrayList<Namecard> list = dao.selectAll();
        int size = list.size();
        //System.out.println(size);
        for (int i = 0; i < size; i++) {
            Namecard card = list.get(i);
            System.out.println(card);
        }
        */

        /*
        //3.selectByKeyword(String) test: �̸����� ã��
        System.out.println("ã�� �̸��� �Է��ϼ���");
        String name = sc.next();
        ArrayList<Namecard> matched = dao.selectByKeyword(name);
        int length = matched.size();
        System.out.println(length + "�� ã��.");
        for (int i = 0; i < length; i++) {
            Namecard namecard = matched.get(i);
            System.out.println(namecard);
        }
		*/

        
        /*
        //4.selectOne(int) test : ��ȣ�� ã��
        Namecard card = dao.selectOne(5);
        System.out.println("5�� ã��");
        System.out.println(card.toString());
        */

        /*
        //5.delete(int) test : ��ȣ�� �����ϱ�
        dao.delete(5);
        ArrayList<Namecard> all = dao.selectAll();
        int cardNum = all.size();
        for (int i = 0; i < cardNum; i++) {
            Namecard namecard = all.get(i);
            System.out.println(namecard);
        }
        */

        
        //6. update(Namecard) test :  card�� no��ȣ�� ���� NAMECARD ����  �̸�, ��ȭ��ȣ, �̸���, ȸ�� ������Ʈ(�����ϱ�)
        Namecard card = dao.selectOne(7);//DB���� �����µ� ī�忡 ����
        System.out.println(card);
        
        card.setEmail("lalala@daum.net");
        card.setMobile("999-9999-9999");
        dao.update(card);
        
        System.out.println(card);
         
    }
}
