package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumSliceSumCodility {

    public static void findMaxAumSlice() throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution(A));

    }

    private static int solution(int[] A){
        int maxSum = A[0];
        int sliceSum = 0;
        int localMax = A[0];
        for(int i=1; i<A.length; i++){
          sliceSum = localMax + A[i];
          localMax = Math.max(sliceSum, A[i]);
          maxSum = Math.max(maxSum, localMax);
        }

        return maxSum;
    }
}
