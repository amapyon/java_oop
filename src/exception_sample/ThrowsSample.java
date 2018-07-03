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
	
	// ���\�b�h�Ŕ������āA���\�b�h���ŏ����ł��Ȃ���O���L����
	private static void method() throws FileNotFoundException, EOFException {
		if (false) {
			throw new FileNotFoundException();
		}
		if (false) {
			throw new EOFException();
		}
	}
}
