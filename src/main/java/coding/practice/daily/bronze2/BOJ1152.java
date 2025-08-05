package coding.practice.daily.bronze2;

import java.io.*;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

/*
        입력: " "
        출력: 1

        빈 문자열 배열이 아니라 [""]로 들어감
*/

        if(line.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = line.split("\\s+");
        System.out.println(words.length);
    }

}
