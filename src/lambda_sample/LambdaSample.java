package lambda_sample;

import java.util.ArrayList;

public class LambdaSample {
	public static void main(String[] args) {
		ArrayList<Member> members
			 = new ArrayList<Member>();
		members.add(new Member("yamada"));
		members.add(new Member("sato"));
		members.add(new Member("sasaki"));
		
		// ラムダを使わない書き方
		for (Member member : members) {
			member.print();
		}
		
		// コレクションのforEach()メソッドと
		// ラムダを使用する
		members.forEach(m -> m.print());
		
		// ラムダで省略しない書き方
		// ブロック内には複数行記述できる
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