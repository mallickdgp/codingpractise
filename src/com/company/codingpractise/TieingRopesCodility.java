package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TieingRopesCodility {

    public static void countRopeTies() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(K, A));
    }

    private static int solution(int K, int[] A){

        int count = 0;
        int length = 0;
        for(int i=0; i<A.length; i++){
            length = length + A[i];
           if(length >= K) {
               count++;
               length = 0;
           }

        }

        return count;
    }
}
