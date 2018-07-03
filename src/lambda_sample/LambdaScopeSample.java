package lambda_sample;

import java.util.Arrays;

public class LambdaScopeSample {
	public static void main(String[] args) {
	    String[] texts = "あいうえお".split("");
	    
        // ローカル変数はアクセスできないが
	    // staticなフィールドにはアクセス可能
	    /* int */ i = 0;
        Arrays.stream(texts).forEach(s -> {
            System.out.println("[static]" + ++i + ":" + s);
        });

        // finalなローカル変数はアクセスできる
        final int j = 0;
        Arrays.stream(texts).forEach(s -> {
            // j++ // finalなので変更はできない
            System.out.println("[final]" + j + ":" + s);
        });

        // 配列の要素はアクセス可能
        int[] k = {0};
        Arrays.stream(texts).forEach(s -> {
            System.out.println("[Array]" + ++k[0] + ":" + s);
        });

        // オブジェクトの要素はアクセス可能
        final Counter l = new Counter();
        Arrays.stream(texts).forEach(s -> {
            System.out.println("[Object]" + ++l.i + ":" + s);
        });

        // ブロック内で宣言した値はローカル変数
        Arrays.stream(texts).forEach(s -> {
            int i = 0;
            System.out.println("[Close]" + ++i + ":" + s);
        });
	}
    private static int i;
}

class Counter {
    public int i = 0;
}
