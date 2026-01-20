package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2577 {
    private static final int REPEAT_COUNT = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int product = 1;
        for (int i = 0; i < REPEAT_COUNT; i++) {
            product *= Integer.parseInt(br.readLine());
        }

        int[] digitCount = new int[10];

        String str = String.valueOf(product);

        for (int i = 0; i < str.length(); i++) {
            ++digitCount[str.charAt(i) - '0'];
        }

        for (int i : digitCount) {
            System.out.println(i);
        }
    }

}
