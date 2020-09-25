package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Monk's best friend Micro, who happen to be an awesome programmer, got him an integer matrix M of size N X N  for his birthday.
Monk is taking coding classes from Micro. They have just completed array inversions and Monk was successful in writing
a program to count the number of inversions in an array. Now, Micro has asked Monk to find out the number of
inversion in the matrix M. Number of inversions, in a matrix is defined as the number of unordered pairs of cells {(i.j), (p,q)} such that M[i][j]>M[p][q] & i<=p and
j<=q.
Monk is facing a little trouble with this task and since you did not got him any birthday gift, you need to help him with this task.

Input:
First line consists of a single integer T denoting the number of test cases.
First line of each test case consists of one integer denoting N. Following N lines consists of N space separated integers denoting the matrix M.

Output:
Print the answer to each test case in a new line.
* */
public class MatrixInversion {

    public static void invertMatrix(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestsCases = Integer.parseInt(br.readLine());
        while (noOfTestsCases > 0) {



            noOfTestsCases--;
        }
    }
}
