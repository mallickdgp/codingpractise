package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BugFixRockstar {
    public static void fixBug() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] givenArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());

        System.out.println(solution(M, givenArray));
    }
    static int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M+1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 1;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp >= maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
                index = i;
            }
        }
        return A[index];
    }
}
