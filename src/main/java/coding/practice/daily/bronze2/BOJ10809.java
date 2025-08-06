package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] alphabetPosition = new int[26];
        Arrays.fill(alphabetPosition, -1);

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            int index = alphabet-'a';
            if(alphabetPosition[index] < 0) alphabetPosition[index] = i;

        }

        for (int i : alphabetPosition) {
            System.out.print(i + " ");
        }

    }

} // O(N)
