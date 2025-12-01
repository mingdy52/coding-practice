package coding.practice.leet.arrays101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine()
                .trim()
                .replace("[", "")
                .replace("]", "")
                .split(",");

        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        System.out.println(findNumbers(array));

    }

    public static int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int length = String.valueOf(num).length();
            if(length % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }

} // O(n)
