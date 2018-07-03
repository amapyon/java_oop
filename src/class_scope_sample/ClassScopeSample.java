package class_scope_sample;

public class ClassScopeSample {

	public static void main(String[] args) {
		Member yamada = new Member("yamada");
		System.out.println("現在の登録会員数:" + Member.getCount()); // クラス
		Member sato = new Member("sato");
		System.out.println("現在の登録会員数:" + Member.getCount());
		yamada.print(); // インスタンス
		sato.print();
	}

}

class Member {
	private static int count = 0;	// クラススコープのフィールド
	private String name;
	private int id;

	public Member(String name) {
		this.name = name; // thisを付けることで、フィールドと仮引数を区別
		id = ++count;
	}

	public static int getCount() {	// クラススコープのメソッド
		return count;
	}

	public void print() {
		System.out.println("ID:" + id + ", NAME:" + name);
	}
}
