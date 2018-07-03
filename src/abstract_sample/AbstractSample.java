package abstract_sample;

public class AbstractSample {
	public static void main(String[] args) {
		Member[] members = {	// ���ۃN���X���X�[�p�[�N���X�Ƃ��Ĉ�����
				new NormalMember("yamada"),
				new SpecialMember("sato")};
		for (Member member : members) {
			member.print();
		}
	}

}

abstract class Member {	// ���ۃN���X
	private String name;
	public Member(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(name + "�́A��������" + getDiscountRate());
	}
	abstract double getDiscountRate();	// ���ۃ��\�b�h
}

//���ۃN���X���p��
class NormalMember extends Member {
	public NormalMember(String name) {
		super(name);
	}

	// ���ۃ��\�b�h�̎���
	@Override
	double getDiscountRate() {
		return 0;
	}
}

class SpecialMember extends Member {
	public SpecialMember(String name) {
		super(name);
	}

	@Override
	double getDiscountRate() {
		return 0.2;
	}
}
