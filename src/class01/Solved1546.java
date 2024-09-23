package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solved1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험 본 과목의 갯수
//        System.out.println(N);

        // 공백 기준으로 잘라서 배열에 집어넣기
        String[] nums = br.readLine().split(" ");
        int[] score = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
//        System.out.println(Arrays.toString(score)); // 배열을 뽑을때는 변수로 뽑으면 참조값만 뽑힌다.

        // 최대값 찾기
        int max = 0;
        for(int i = 0; i < N; i++) {
            if(score[i] > max) {
                max = score[i];
            }
        }
//        System.out.println(max);
        double sum = 0;
        double result = 0;

        // 새로운 평균 구하기
        for(int i = 0; i < nums.length; i++) {
            sum += ((double) score[i] / max) * 100 ; // 형변환에 주의
        }
        br.close();
        result = sum / nums.length;

        System.out.println(result);
    }
}
