package lambda_sample;

import java.util.ArrayList;

public class LambdaSample {
	public static void main(String[] args) {
		ArrayList<Member> members
			 = new ArrayList<Member>();
		members.add(new Member("yamada"));
		members.add(new Member("sato"));
		members.add(new Member("sasaki"));
		
		// �����_���g��Ȃ�������
		for (Member member : members) {
			member.print();
		}
		
		// �R���N�V������forEach()���\�b�h��
		// �����_���g�p����
		members.forEach(m -> m.print());
		
		// �����_�ŏȗ����Ȃ�������
		// �u���b�N���ɂ͕����s�L�q�ł���
		members.forEach((Member m) -> {
			m.print();
		});
	}
}

class Member {
	private String name;
	public Member(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("My name is " + name);
	}
}