package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] position = new int[26];
        Arrays.fill(position, -1);

        for (int i = 0; i < input.length(); i++) {
            int location = input.charAt(i) - 'a';

            if (position[location] != -1) {
                continue;
            }

            position[location] = i;

        }

        StringBuilder sb = new StringBuilder();
        for (int pos : position) {
            sb.append(pos).append(" ");
        }

        System.out.println(sb.toString());

    }

}
