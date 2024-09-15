import java.util.Scanner;

public class Solved2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chArr = line.toCharArray();
        char[] result = new char[chArr.length];

        for(int i = 0; i < chArr.length; i++) {
            if (Character.isUpperCase(chArr[i])) {
                result[i] = Character.toLowerCase(line.charAt(i));
            } else if (Character.isLowerCase(chArr[i])) {
                result[i] = Character.toUpperCase(line.charAt(i));
            }
        }
        scanner.close();

//        String resultString = result.toString(); // 문자배열의 참조값을 출력
//        System.out.println(resultString);

        String resultString = new String(result); // 문자배열의 참조값을 출력
        System.out.println(resultString);
    }
}
