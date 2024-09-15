package sprout;

import java.util.Scanner;

public class Solved2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        Character[] arr = grade.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        double score = 0;

        if(arr[0].equals('A')){
            score = 4.3;
        } else if(arr[0].equals('B')){
            score = 3.3;
        } else if(arr[0].equals('C')){
            score = 2.3;
        } else if(arr[0].equals('D')){
            score = 1.3;
        } else if(arr[0].equals('F')){
            score = 0.0;
        }
        if(arr.length == 1) {
            System.out.println(score);
            return;
        }

        if(arr[1].equals('+')){
            score = score;
        } else if(arr[1].equals('0')){
            score -= 0.3;
        } else if(arr[1].equals('-')){
            score -= 0.6;
        }
        System.out.printf("%.1f%n", score);
    }
}