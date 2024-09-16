package sprout;

import java.util.Scanner;

public class Solved2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();

        long result = N - M;
        if(result < 0){ // 절대값을 뽑아내기 위해, 음수로 나오면 -붙여서 양수로 만들기
            result = -result;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
