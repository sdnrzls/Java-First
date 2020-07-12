package com.oracle.namecard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NamecardUI {
    
    private NamecardDao dao = new NamecardDao();
    
    public NamecardUI() {}

    private String readCommandLine() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        return input;
    }
    
    public void showMenu() {
        String menu = null;
        
        do {
            System.out.println(" *** �޴��� �����ϼ��� *** ");
            System.out.println("1.Namecard ���");
            System.out.println("2.Namecard ����Ʈ ���");
            System.out.println("3.Namecard ����");
            System.out.println("4.Namecard ����");
            System.out.println("5.Namecard �˻�");
            System.out.println("q.����");
            
            try {
                menu = readCommandLine();    
            
                if (menu.equals("1")) {
                    System.out.println("�̸��� �Է��ϼ���>>");
                    String name = readCommandLine();
                    System.out.println("��ȭ��ȣ�� �Է��ϼ���>>");
                    String mobile = readCommandLine();
                    System.out.println("�̸����� �Է��ϼ���>>");
                    String email = readCommandLine();
                    System.out.println("ȸ�縦 �Է��ϼ���>>");
                    String company = readCommandLine();
                    Namecard card = new Namecard(name, mobile, email, company);
                    dao.insert(card);
                } else if (menu.equals("2")) {
                    ArrayList<Namecard> all = dao.selectAll();
                    for(int i = 0; i < all.size(); i++) {
                        System.out.println(all.get(i));
                    }
                } else if (menu.equals("3")) {
                    System.out.println("������ �̸��� �Է��ϼ���>>");
                    String name = readCommandLine();
                    ArrayList<Namecard> matched = dao.selectByKeyword(name);
                    if (matched.size() > 0) {
                        for (int i = 0; i < matched.size(); i++) {
                            System.out.println(matched.get(i));
                        }
                        System.out.println("������ ��ȣ�� �Է��ϼ���>>");
                        int id = Integer.parseInt(readCommandLine());
                        dao.delete(id);
                    }
                } else if (menu.equals("4")) {
                    System.out.println("������ �̸��� �Է��ϼ���>>");
                    String name = readCommandLine();
                    ArrayList<Namecard> matched = dao.selectByKeyword(name);
                    if (matched.size() > 0) {
                        for (int i = 0; i < matched.size(); i++) {
                            System.out.println(matched.get(i));
                        }
                        System.out.println("������ ��ȣ�� �Է��ϼ���>>");
                        int id = Integer.parseInt(readCommandLine());
                        Namecard card = dao.selectOne(id);
                        System.out.println("���̸� �Է�>>");
                        name = readCommandLine();
                        if (!name.equals("")) {
                            card.setName(name);
                        }
                        System.out.println("����ȭ��ȣ�� �Է��ϼ���>>");
                        String mobile = readCommandLine();
                        if (!mobile.equals("")) {
                            card.setMobile(mobile);
                        }    
                        System.out.println("���̸����� �Է��ϼ���>>");
                        String email = readCommandLine();
                        if (!email.equals("")) {
                            card.setEmail(email);
                        }
                        System.out.println("��ȸ�縦 �Է��ϼ���>>");
                        String company = readCommandLine();
                        if (!company.equals("")) {
                            card.setCompany(company);
                        }
                        dao.update(card);
                    }
                } else if (menu.equals("5")) {
                    System.out.println("ã�� �̸��� �Է��ϼ���>>");
                    String name = readCommandLine();
                    ArrayList<Namecard> matched = dao.selectByKeyword(name);
                    for(int i = 0; i < matched.size(); i++) {
                        System.out.println(matched.get(i));
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(!menu.equals("q"));
    }
    
    public static void main(String[] args) {
        new NamecardUI().showMenu();
    }

}