package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOneOutCodility {

    public static void getTheOddOne() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] givenArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int oddOne = solution(givenArr);

        System.out.println(oddOne);
    }

    private static int solution(int[] A){
        Map<Integer, Integer> elements = new HashMap<Integer, Integer>();
        if(A.length == 0)
            return 0;

        for(int i = 0; i<A.length ; i++){
            if(elements.containsKey((Integer) A[i]))
                elements.put((Integer) A[i], (Integer) elements.get((Integer) A[i])+1);
            else{
                elements.put((Integer) A[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if(entry.getValue() % 2 != 0){
                return (Integer) entry.getKey();
            }

        }

        return 0;
    }
}
