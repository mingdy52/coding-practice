package coding.practice.daily.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split("\\s+");

        int num1 = reversedInt(numbers[0]);
        int num2 = reversedInt(numbers[1]);

        System.out.println(Math.max(num1, num2));
    }

    private static int reversedInt(String number) {
        String string = new StringBuilder(number).reverse().toString();
        return Integer.parseInt(string);
    }

}
