package sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수 int로 받아오기

        // 나머지 테스트 케이스 String 받아오기
        for(int i = 0; i < T; i++) {
            String testCase = br.readLine();
            System.out.println(testCase.charAt(0) + "" + testCase.charAt(testCase.length()-1));
        }
        br.close();
    }
}
