package lambda_sample;

import java.util.Arrays;

public class LambdaReduceSample {
    public static void main(String[] args) {
        String[] texts = "あいうえお".split("");

        // 引数が1つのreduce()
        String string = Arrays.stream(texts)
                .reduce((result, s) -> {
                    return result + '-' + s;
                }).orElse("");
        System.out.println(string);

        // 引数が2つのreduce()
        // 第1引数に初期値を与える
        string = Arrays.stream(texts).reduce(
            "[", // 初期値は要素の型の値
            (result, s) -> {
                return result + '-' + s;
            }) + "]";
        System.out.println(string);
        
        // 引数が3つのreduce()
        // 要素の型以外の戻り値を返せる
        int result = Arrays.stream(texts).reduce(
            10, // 初期値で戻り値の型が決まる
            (counter, s) -> {
                System.out.println("[reduce]" + ++counter + ":" + s);
                return counter;
            },
            (i1, i2) -> 0 // 並列処理の場合に用いられる
        );
        System.out.println(result);
    }
}
