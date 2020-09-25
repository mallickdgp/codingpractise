package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

public class FrogJumpCodility {

    public static void countTheJumps() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X= Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        System.out.println(solution(X, Y, D));
    }

    private static int solution(int X, int Y, int D){
        int jumpCount = (Y-X)/D;
        if((Y-X) % D > 0)
            return jumpCount+1;
        else
        return jumpCount;
    }
}
