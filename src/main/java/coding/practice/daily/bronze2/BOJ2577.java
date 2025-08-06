package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    private static final int REPEAT_COUNT = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = 1;

        for (int i = 0; i < REPEAT_COUNT; i++) {
            number *= Integer.parseInt(br.readLine().trim());
        }

        int[] digitFrequency  = getDigitFrequency(number);

        for (int freq : digitFrequency ) {
            System.out.println(freq);
        }
    }

    private static int[] getDigitFrequency(int number) {
        int[] digitCount = new int[10];
        String str = String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            ++digitCount[str.charAt(i) - '0'];
        }

        return digitCount;
    }

}
