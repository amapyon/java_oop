package exception_sample;

public class OriginalExceptionSample {

	public static void main(String[] args) {
		Member yamada = new Member();
		try {
			yamada.setAge(-9);
		} catch (OutOfAge e) {
			e.printStackTrace();
		}
	}
}

class Member {
	private int age;
	public void setAge(int newAge) throws OutOfAge {
		if (newAge < 0) {
			throw new OutOfAge("年齢がマイナス");
		}
		age = newAge;
	}
}

// Exceptionを継承して独自の例外クラスを作成
class OutOfAge extends Exception {
	OutOfAge(String message) {
		super(message);
	}
}