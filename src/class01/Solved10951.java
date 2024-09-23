package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input;
        // 입력이 null일때까지 반복
        while ((input = br.readLine()) != null){
            st = new StringTokenizer(input); // stringTokenizer는 기본값이 입력된 한 줄을 공백을 기준으로 분리하여 토큰화
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = A + B;
            System.out.println(result);
        }
    }
}
