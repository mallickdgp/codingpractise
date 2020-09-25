package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinaryGapCodility {

    public static void binaryGap() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());

        solution(N);
    }

    private static void solution(Integer N){

        String[] binArr = Integer.toBinaryString(N).split("");

       // System.out.println(Arrays.toString(binArr));

        int length = binArr.length;
        int gapLength = 0;
        int localGapLength = 0;
        for(int i=0; i<length; i++){
            int currentNum = Integer.parseInt(binArr[i]);

            if(currentNum == 1){
                if(localGapLength >= gapLength)
                    gapLength = localGapLength;

                localGapLength = 0;
            } else{
                localGapLength++;
            }

        }
        System.out.println(gapLength);

    }
}
