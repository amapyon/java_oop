package class_scope_sample;

public class ClassScopeSample {

	public static void main(String[] args) {
		Member yamada = new Member("yamada");
		System.out.println("���݂̓o�^�����:" + Member.getCount()); // �N���X
		Member sato = new Member("sato");
		System.out.println("���݂̓o�^�����:" + Member.getCount());
		yamada.print(); // �C���X�^���X
		sato.print();
	}

}

class Member {
	private static int count = 0;	// �N���X�X�R�[�v�̃t�B�[���h
	private String name;
	private int id;

	public Member(String name) {
		this.name = name; // this��t���邱�ƂŁA�t�B�[���h�Ɖ����������
		id = ++count;
	}

	public static int getCount() {	// �N���X�X�R�[�v�̃��\�b�h
		return count;
	}

	public void print() {
		System.out.println("ID:" + id + ", NAME:" + name);
	}
}
