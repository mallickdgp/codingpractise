package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingElementCodility {

    public static void findMissingElement() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] givenArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(givenArray));
    }

    private static int solution(int[] A){
        if(A.length == 0)
            return 1;

        long arrSum = 0;
        int expectedDigitCount = A.length + 1;
        long expectedSum = (expectedDigitCount * (expectedDigitCount+1)) / 2;
        for(int i=0; i<A.length; i++){
            arrSum = arrSum+A[i];
        }

        return (int) (expectedSum - arrSum);
    }
}
