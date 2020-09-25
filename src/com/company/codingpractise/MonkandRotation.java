package com.company.codingpractise;

/*
Monk and Rotation
        Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School, he assigned a task to his new student Mishki.
        Mishki will be provided with an integer array A of size N and an integer K , where she needs to rotate the array in the right direction by K steps
        and then print the resultant array. As she is new to the school, please help her to complete the task.

        Input:
        The first line will consists of one integer T denoting the number of test cases.
        For each test case:
        1) The first line consists of two integers N and K, N being the number of elements in the array and K denotes the number of steps of rotation.
        2) The next line consists of N space separated integers , denoting the elements of the array A.
        Output:
        Print the required array.

        1
        5 2
        1 2 3 4 5
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkandRotation {

    public static void arrayRotation(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestsCases = Integer.parseInt(br.readLine());
        while (noOfTestsCases > 0) {
           // int[] arrVars = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] arrVars = br.readLine().split(" ");
            int sizeOfArray = Integer.parseInt(arrVars[0]);
            int noOfRotations = Integer.parseInt(arrVars[1]);
           // int[] givenArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] givenArray = br.readLine().split(" ");

            while (noOfRotations > 0) {
                int i;
                int temp = Integer.parseInt(givenArray[sizeOfArray - 1]);
                for (i = sizeOfArray - 1; i > 0;  i--) {
                    givenArray[i] = givenArray[i-1];
                }
                    givenArray[0] = temp+"";

                noOfRotations--;
            }
            System.out.println(" ");
            for (int p = 0; p < sizeOfArray; p++) {
                System.out.print(givenArray[p] + " ");
            }
            noOfTestsCases--;
        }
    }
}
