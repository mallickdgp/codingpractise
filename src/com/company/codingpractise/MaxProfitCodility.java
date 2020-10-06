package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxProfitCodility {

    public static void findMaxProfit() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(A));

    }

    private static int solution(int[] A){
        int maxProfit = 0;
        int localProfit = 0;
       /// int currentPrice = A[0];
        for(int i=0; i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                localProfit = A[j] - A[i];
                if(localProfit > maxProfit)
                    maxProfit = localProfit;
            }
        }
        return maxProfit;
    }
}
