package coding.practice.leet.arrays101;

import java.io.*;
import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine()
                .trim()
                .replace("[", "")
                .replace("]", "")
                .split(",");

        int[] inputNumbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.println(findMaxConsecutiveOnes(inputNumbers));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int maxConsecutiveCount = 0;
        for (int num : nums) {
            if (num == 1) {
                consecutiveCount++;
            } else {
                maxConsecutiveCount = Math.max(consecutiveCount, maxConsecutiveCount);
                consecutiveCount = 0;

            }
        }

        return Math.max(consecutiveCount, maxConsecutiveCount);
    }

}
