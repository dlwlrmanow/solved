package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 입력 = 배열의 크기로 읽기
        int N = Integer.parseInt(br.readLine());
        // N개의 원소를 가진 배열 생성
        int[] arr = new int[N];
        // 소수(1과 자기자신만을 약수로 가짐)인 경우 담을 변수
        int count = 0;

        // 두번째 입력 N개의 Int 배열로 받아오기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 차례로 배열에 담고,
            if(isPrime(arr[i])){ // 자기자신으로 나눠서 나머지 == 0 -> 소수 -> count++
                count ++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n) {
        if(n < 2){
            return false; // 0,1 은 소수가 아님ㅁ
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
