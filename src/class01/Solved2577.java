package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solved2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각각의 수를 받아와서 곱하기
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A * B * C;
        String sumStr = String.valueOf(sum);
        int[] sumArr = new int[sumStr.length()];
        for (int i = 0; i < sumStr.length(); i++) {
            sumArr[i] = Integer.parseInt(sumStr.substring(i, i + 1)); // int배열로 배열안에 집어넣기
        }
//        System.out.println(Arrays.toString(sumArr));

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        // sum을 배열로 받아서 for문 인덱스로 돌리기
        for(int i = 0; i < sumArr.length; i++) {
            // sum[i]에 있는 1 ~ 9까지의 숫자 switch문으로 countN ++
            switch (sumArr[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
            }
        }
        // result
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);
    }
}
