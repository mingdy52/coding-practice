package coding.practice.daily.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine().trim();
//        printWordCountSimple(line);

        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());

    }

    private static void printWordCount(String line) {
        if(line.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = line.split("\\s+");
        System.out.println(words.length);
    }

    private static void printWordCountSimple(String line) {
        int wordCount = line.isEmpty() ? 0 : line.split("\\s+").length;
        System.out.println(wordCount);
    }

}
