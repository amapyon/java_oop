package extends_sample;

public class OverrideSample {
	public static void main(String[] args) {
		MailMember mailMember = new MailMember("yamada", "yama001@esm.co.jp");
		mailMember.printDetail();
		mailMember.printDetails();
		Member member = mailMember; // �X�[�p�[�N���X�̌^�̕ϐ��ɑ���\
		member.printDetail();
		// member.printDetails(); // Member�N���X�ɁAprintDetails()�͒�`����Ă��Ȃ�
	}
}

class Member {
	private String name;
	public Member(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void printDetail() {
		System.out.println("Name=" + name);
	}
}

class MailMember extends Member {
	private String email;
	public MailMember(String name, String email) {
		super(name); // �X�[�p�[�N���X�̃R���X�g���N�^�Ăяo��
		this.email = email;
	}	
	// @Override	// ���̍s�������ƃR���p�C���G���[�ɂȂ�
	public void printDetails() { // ���\�b�h�����قȂ�̂ŃI�[�o�[���C�h���Ă��Ȃ�
		System.out.println("Name=" + getName() + ", Email=" + email);
	}
}
