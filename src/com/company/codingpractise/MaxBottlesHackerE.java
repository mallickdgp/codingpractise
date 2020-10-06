package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxBottlesHackerE {

    public static void findMaxBottles() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine());
        while (tests > 0) {
            int[] sizes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int noOfBottles = sizes[0];
            int capacity = sizes[1];

            int[] bottleCapacities = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(bottleCapacities);

            int count = 0;
            int leftinTank = capacity;

            for (int i = 0; i < noOfBottles; i++) {
                if (bottleCapacities[i] < capacity) {
                    count++;
                    capacity = capacity - bottleCapacities[i];
                }
            }

            System.out.println(count);

            tests--;
        }

    }
}
