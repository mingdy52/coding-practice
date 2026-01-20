package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            String testCase = br.readLine();

            int score = 0;
            int totalScore = 0;

            for (int j = 0; j < testCase.length(); j++) {
                if (testCase.charAt(j) == 'O') {
                    score++;
                    totalScore += score;
                } else {
                    score = 0;
                }
            }

            System.out.println(totalScore);
        }
    }

}
