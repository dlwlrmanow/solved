package sprout;

import java.util.Scanner;

public class Solved1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double result = A / B;

        scanner.close();

        System.out.println(result);
    }
}
