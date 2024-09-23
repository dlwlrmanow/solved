package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); // 한줄 읽어오기
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 수로 생각해서 계산하기
        int resultInt = A + B - C;
        System.out.println(resultInt);

        // 문자열로 생각해서 계산하기
        // 문자열 뺄셈은 할 수 없음 -> 문자열 덧셈 진행 후 int로 변환해서 - int C
        String resultStringAB = String.valueOf(A) + String.valueOf(B);
        int resultIntAB = Integer.parseInt(resultStringAB);
        String resultABC = String.valueOf(resultIntAB - C);
        System.out.println(resultABC);

    }
}
