package coding.practice.daily.bronze2;

import java.io.*;
import java.util.*;

public class BOJ3052 {
    private static final int INPUT_COUNT = 10;
    private static final int DIVISOR = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputs = new ArrayList<>();

        for (int i = 0; i < INPUT_COUNT; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }

        setEx(inputs);

    }

    public static void mapEx(List<Integer> inputs) throws IOException {
        Map<Integer, Integer> remainders = new HashMap<>();

        for (int number : inputs) {
            int remainder = number % DIVISOR;
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(remainders.size());

    }

    // 이 문제에 더 적당함!
    public static void setEx(List<Integer> inputs) {
        Set<Integer> remainders = new HashSet<>();

        for (int number : inputs) {
            remainders.add(number % DIVISOR);
        }

        System.out.println(remainders.size());

    }

}
