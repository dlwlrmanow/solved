package sprout;

import java.util.Scanner;

public class Solved2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int result = 0;

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            result += nums[i] * nums[i];
        }
        sc.close();
        System.out.println(result % 10);
    }
}
