package exception_sample;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsSample {
	public static void main(String[] args) {
		try {
			System.out.println("try begin");
			method();
			System.out.println("try end");
		} catch (FileNotFoundException e) {
			System.out.println("catch FileNotFoundException");
		} catch (IOException e) {
			System.out.println("catch IOException");
		}
	}
	
	// メソッドで発生して、メソッド内で処理できない例外を列記する
	private static void method() throws FileNotFoundException, EOFException {
		if (true) {
			throw new FileNotFoundException();
		}
		if (true) {
			throw new EOFException();
		}
	}
}
