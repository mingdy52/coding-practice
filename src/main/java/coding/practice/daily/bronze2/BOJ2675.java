package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            System.out.println(second(br.readLine()));
        }

    }

    public static String first(String input) {
        StringBuilder result = new StringBuilder();

        String[] testCase = input.split("\\s+");

        int repeatCount = Integer.parseInt(testCase[0]);
        String str = testCase[1];

        for (char c : str.toCharArray()) {
            result.append(String.valueOf(c).repeat(repeatCount));
            // String.valueOf(c) → 매번 새 문자열 생성
            // repeat() → 내부적으로 또 문자열 연산
            // 결국 문자 하나 반복하는데 문자열 객체가 계속 생김
        }

        return result.toString();
    }

    public static String second(String input) {
        StringTokenizer st = new StringTokenizer(input);

        int repeatCount = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            for (int i = 0; i < repeatCount; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }


}
