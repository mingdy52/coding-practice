package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCaseCount; i++) {
            String[] testCase = br.readLine().split("\\s+");

            int repeatCount = Integer.parseInt(testCase[0]);
            String s = testCase[1];

            sb.append(repeatCharacters(repeatCount, s)).append("\n");
        }

        System.out.println(sb);

    }

    public static String repeatCharacters(int repeatCount, String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(String.valueOf(c).repeat(repeatCount));
        }

        return sb.toString();
    }
}
