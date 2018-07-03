package lambda_sample;

import java.util.Arrays;

public class LambdaMethodRefSample {
	public static void main(String[] args) {
	    String[] texts = "あいうえお".split("");
	    
        // ローカル変数はアクセスできないが
	    // staticなフィールドにはアクセス可能
	    /* int */ i = 0;
        Arrays.stream(texts).forEach(s -> {
            System.out.println("[static]" + ++i + ":" + s);
        });

        // メソッド参照
        i = 0;
        Arrays.stream(texts).forEach(LambdaMethodRefSample::print);

	}
    private static int i;
    
    // staticなメソッド
    private static void print(String s) {
        System.out.println("[method]" + ++i + ":" + s);
    }
}
