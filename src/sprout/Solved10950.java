package sprout;

import java.util.Scanner;

public class Solved10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder(); // for문을 돌면서 결과를 담는 역할

        for(int i = 0; i < N; i++) { // i <= N으로 설정하면 총 6번 반복
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            result.append(A + B).append("\n"); // 결과와 함께 개행문자 append
        }
        System.out.println(result.toString()); // 담아준 result 한번에 출력
    }
}

