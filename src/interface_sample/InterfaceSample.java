package interface_sample;

public class InterfaceSample {
	public static void main(String[] args) {
		Member yamada = new Member("yamada");
		Member sato = new Member("sato");
		School todai = new School("Hongo"); 
		{
			Member[] members = {yamada, sato};
			for (Member member : members) {
				member.hello();	// Member�N���X�̃��\�b�h�����p�ł���
				member.print();
			}
		}
		{
			// Printable�C���^�t�F�[�X�̔z��
			Printable[] members = {todai, yamada, sato};
			for (Printable member : members){
				member.print();	// Printable�C���^�t�F�[�X�̃��\�b�h�̂ݗ��p��
			}
		}
	}
}

interface Printable {
	void print();
}

class Member implements Printable { // �C���^�t�F�[�X�̎���
	private String name;
	public Member(String name) {
		this.name = name;
	}
	// print���\�b�h���Ȃ��ƃR���p�C���G���[�ɂȂ�
	public void print() {
		System.out.println("I am " + name);
	}
	public void hello() {
		System.out.println("Hello!");
	}
}

class School implements Printable {
	private String address;
	public School(String address) {
		this.address = address;
	}
	// print���\�b�h���Ȃ��ƃR���p�C���G���[�ɂȂ�
	public void print() {
		System.out.println("Location is " + address);
	}
	public void lesson() {
		System.out.println("Let's study!");
	}	
}

