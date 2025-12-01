package coding.practice.leet.arrays101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine()
                .trim()
                .replace("[", "")
                .replace("]", "")
                .split(",");

        int[] array = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(sortedSquares(array)));
        System.out.println(Arrays.toString(sortedSquaresTwoPointer(array)));

    }

    public static int[] sortedSquares(int[] nums) {
        int[] squares = Arrays.stream(nums)
                .map(num -> num * num)
                .toArray();

        Arrays.sort(squares);

        return squares;
    } // O(n log n)

    public static int[] sortedSquaresTwoPointer(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        // 뒤에서부터 채우기 (큰 값부터)
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    } // O(n)

}
