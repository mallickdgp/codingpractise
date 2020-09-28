package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingIntegerCodility {

    public static void findMissingInteger() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] givenArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(givenArr));
    }

    private static int solution(int[] A){
        Arrays.sort(A);
        int loopVar = A.length;
        int missingElement = 1;
        while(loopVar>0){

           int found = Arrays.binarySearch(A, missingElement);

           if(found < 0)
               return missingElement;

           missingElement++;
           loopVar--;
        }

        return missingElement;
    }
}
