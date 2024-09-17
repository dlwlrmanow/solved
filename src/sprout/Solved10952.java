package sprout;

import java.util.Scanner;

public class Solved10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int result = A + B;

            if(result > 0) {
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
