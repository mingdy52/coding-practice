package coding.practice.daily.bronze2;

import java.io.*;
import java.util.*;

public class BOJ3052 {
    private static final int INPUT_COUNT = 10;
    private static final int DIVISOR = 42;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> inputs = new ArrayList<>();

        for (int i = 0; i < INPUT_COUNT; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(thirdSolve(inputs));

    }

    // O(n) + O(42)
    private static int firstSolve(ArrayList<Integer> inputs) {
        boolean[] remainderExists = new boolean[DIVISOR];

        for (Integer input : inputs) {
            int remainder = input % DIVISOR;
            remainderExists[remainder] = true;
        }

        int uniqueRemainderCount = 0;
        for (boolean remainderExist : remainderExists) {
            if(remainderExist) uniqueRemainderCount++;
        }

        return uniqueRemainderCount;
    }

    // O(n)
    private static int secondSolve(ArrayList<Integer> inputs) {
        Set<Integer> remainder = new HashSet<>();

        for (Integer input : inputs) {
            remainder.add(input % DIVISOR);
        }

        return remainder.size();
    }

    private static int thirdSolve(ArrayList<Integer> inputs) {
        return (int) inputs.stream()
                .map(input -> input % DIVISOR)
                .distinct()
                .count();
    }

}
