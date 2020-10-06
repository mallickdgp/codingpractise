package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MaxOverLappingSegmentsCodility {

    public static void findMaxSegments() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(A, B));
    }

    private static int solution(int[] A, int[] B){
        if(A.length < 1)
            return 1;
     //   int maxOverLappingSegments = 0;
        int length = A.length;
        int currentLength = 1;
        int currentEndPoint = B[0];
        for(int i=0; i<length-1;i++){
          // currentLength = 1;

            /*for(int j=i+1; j<length; j++){

                if(A[j] > currentEndPoint) {
                   currentLength++;
                    currentEndPoint = B[j];
                    break;
                }
            }*/
            if(currentEndPoint < A[i+1]){
                currentLength++;
                currentEndPoint = B[i+1];
            }
            /*if(maxOverLappingSegments < currentLength)
                maxOverLappingSegments = currentLength;*/
        }

        return currentLength;
    }
}
