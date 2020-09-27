package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingArrayCodility {

    public static void countOperations() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt((Integer::parseInt)).toArray();

        System.out.println(Arrays.toString(solution(N, A)));
    }

    private static int[] solution(int N, int[] A){
        int[] counterArr = new int[N];
        int temp = 0;
        int maxCounter = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] >= 1 && A[i]<=N){
                temp = counterArr[A[i]-1];
                temp++;
                counterArr[A[i]-1] = temp;
                if(maxCounter < temp)
                    maxCounter = temp;
            }else if(A[i] >= N+1){
                for(int j=0; j<N; j++)
                    counterArr[j] = maxCounter;

            }
        }

        return counterArr;
    }
}
