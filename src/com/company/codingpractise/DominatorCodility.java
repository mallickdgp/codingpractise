package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DominatorCodility {

    public static void findDominator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(A));
    }

    private static int solution(int[] A){
        HashMap<Integer, Integer>  elementCount = new HashMap<Integer, Integer>();
        int dominator = -1;
        for(int i=0; i<A.length; i++){
            if(elementCount.containsKey((Integer) A[i]))
                elementCount.put((Integer) A[i], elementCount.get((Integer) A[i]) + 1);
            else
                elementCount.put(A[i], 1);
        }

        for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()){
           if( entry.getValue() > A.length/2){
               dominator = entry.getKey();
               break;
           }

        }

        return Arrays.binarySearch(A, dominator);
    }
}
