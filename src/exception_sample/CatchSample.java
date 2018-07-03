package exception_sample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchSample {
	public static void main(String[] args) {
		try {
			System.out.println("try begin");
			if (false) {
				throw new FileNotFoundException();
			}
			if (false) {
				throw new IOException();
			}
			if (false) {
				return;
			}
			System.out.println("try end");
		} catch (FileNotFoundException e) {
			System.out.println("catch FileNotFoundException");
		} catch (IOException e) {
			System.out.println("catch IOException");
		} finally {
			System.out.println("finaly");
		}
	}

}
