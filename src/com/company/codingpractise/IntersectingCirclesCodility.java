package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntersectingCirclesCodility {

    public static void findIntersections() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] circles = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(circles));

    }

    private static int solution(int[] A){
        int intersectCount = 0;

        for(int i=0; i<A.length-1; i++) {
            if (intersectCount == 10000000)
                return -1;
            int JleftBound = i - A[i];
            int JrightBound = i + A[i];
            for (int K = i + 1; K < A.length; K++) {
                int KleftBound = K - A[K];
                int KrightBound = K + A[K];
                /*for(int J=i-A[i]; J<=i+A[i]; J++){*/
                if (JrightBound >= KleftBound) {
                    intersectCount++;
                    //break;
                }
            }
        }


        return intersectCount;
    }
}
