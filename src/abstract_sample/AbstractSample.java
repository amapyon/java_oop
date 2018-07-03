package abstract_sample;

public class AbstractSample {
	public static void main(String[] args) {
		Member[] members = {	// 抽象クラスをスーパークラスとして扱える
				new NormalMember("yamada"),
				new SpecialMember("sato")};
		for (Member member : members) {
			member.print();
		}
	}

}

abstract class Member {	// 抽象クラス
	private String name;
	public Member(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(name + "の、割引率は" + getDiscountRate());
	}
	abstract double getDiscountRate();	// 抽象メソッド
}

//抽象クラスを継承
class NormalMember extends Member {
	public NormalMember(String name) {
		super(name);
	}

	// 抽象メソッドの実装
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
