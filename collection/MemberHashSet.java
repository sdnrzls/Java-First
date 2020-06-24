package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet; //HashSet ����
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //HashSet ����
	}
	
	public void addMember(Member member) { //HashSet�� ȸ�� �߰�
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator(); //Iterator�� Ȱ���� ��ȸ��
		
		while(ir.hasNext()) {
			Member member = ir.next(); //ȸ���� �ϳ��� ������
			int temId = member.getMemberId(); //���̵� ��
			if(temId == memberId) { //���� ���̵��� ���
				hashSet.remove(member); //ȸ�� ����
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() { //��� ȸ�� ���
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	}//class

