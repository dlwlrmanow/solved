package sprout;

import java.util.Scanner;

public class Solved10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 1; // 곱할거라서 0 이면 안됨
        for(int i = 1; i <= N; i++){
            // 10 * 9 * 8 * 7 * 6 * ...
            result *= i;
        }
        System.out.println(result);
    }
}
