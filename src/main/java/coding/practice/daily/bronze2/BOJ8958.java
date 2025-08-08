package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeatCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeatCount; i++) {
            String quizResult = br.readLine();
            int score = 0;
            int total = 0;

            for (int j = 0; j < quizResult.length(); j++) {
                char c = quizResult.charAt(j);
                if(c == 'O') {
                    total += ++score;
                    continue;
                }
                score = 0;
            }

            System.out.println(total);

        }

    }
}
