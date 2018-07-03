package lambda_sample;

import java.util.Arrays;

public class LambdaArraySample {
	public static void main(String[] args) {
	    String text = "あいうえお\nかきくけこ\nさしすせそ";
	    String[] texts = text.split("\n"); // 改行コードで分割
	    
	    // ストリーム化する
	    Arrays.stream(texts).forEach(s -> 
	        System.out.println(s)
	    );

	}

}
