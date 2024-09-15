package sprout;

import java.util.Scanner;

class Solved {
    long a;
    long b;

    void print(long a, long b) {
        long result = (a + b) * (a - b);
        System.out.println(result);
    }
}

public class Solved15964 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        Solved solved = new Solved();
        solved.print(a, b);
    }
}
