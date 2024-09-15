package sprout;

import java.util.Scanner;

public class Solved10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 첫째줄 읽기
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        // 둘째줄 배열로 읽기
        int[] numArr = new int[N];
        for(int i = 0; i < N; i++) {
            numArr[i] = scanner.nextInt();
            if(numArr[i] < X) System.out.print(numArr[i] + " ");
        }

        scanner.close();
    }
}
