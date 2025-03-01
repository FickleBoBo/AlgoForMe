package day_30.BOJ_S3_2193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] dp = new long[1+N];
        dp[1] = 1;
        for(int i=2  ; i<=N ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[N]);
        sc.close();
    }
}
