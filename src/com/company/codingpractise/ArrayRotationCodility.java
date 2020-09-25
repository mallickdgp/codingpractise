package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayRotationCodility {

    public static void rotateArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] givenArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int K = Integer.parseInt(br.readLine());

        givenArray = solution(givenArray, K);

        System.out.println(Arrays.toString(givenArray));
    }

    private static int[] solution(int[] A, int K){
        int loopTimes = A.length-1;
        while(K>0 && A.length>0){
            int temp = A[A.length-1];
            for(int i=loopTimes; i>=1; i--) {
                A[i] = A[i-1];
                System.out.println(Arrays.toString(A));
            }
            A[0] = temp;
            K--;
        }
       return A;
    }
}
