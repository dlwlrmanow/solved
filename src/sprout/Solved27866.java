package sprout;

import java.util.Scanner;

public class Solved27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int i = scanner.nextInt();

        Character[] arr = S.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        System.out.println(arr[i - 1]);

        scanner.close();
    }
}
