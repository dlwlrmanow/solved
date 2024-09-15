package sprout;

import java.util.Scanner;

public class Solved10807 {
    public static void main(String[] args) {
        // v와 같은 수가 몇개인지 담을 count 변수
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        // 첫째줄 읽기
        int N = scanner.nextInt();
        // 둘째줄 배열로 읽기
        int[] numArr = new int[N];
        for(int i = 0; i < N; i++) {
            numArr[i] = scanner.nextInt();
        }
        // 찾을 정수 v 받아오기
        int v = scanner.nextInt();
        scanner.close();

        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == v) count++;
        }

        System.out.println(count);
    }
}
