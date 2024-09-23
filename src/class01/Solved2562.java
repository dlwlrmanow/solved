package class01;

import java.util.Scanner;

public class Solved2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String star = "*";

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N - i; j++) { // 공백을 출력
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){ // 별을 출력
                System.out.print(star);
            }
            System.out.println();
        }
    }


}
