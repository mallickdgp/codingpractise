package com.company.codingpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class StringCompareRockstar {

    public static int solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int alecWinCount = 0;
        HashMap<String, Integer> cards = new HashMap<>();

        cards.put("A", 13);
        cards.put("K", 12);
        cards.put("Q", 11);
        cards.put("J", 10);
        cards.put("T", 9);
        cards.put("9", 8);
        cards.put("8", 7);
        cards.put("7", 6);
        cards.put("6", 5);
        cards.put("5", 4);
        cards.put("4", 3);
        cards.put("3", 2);
        cards.put("2", 1);

        for(int i=0; i<A.length();i++){
            if((int) cards.get(A.substring(i,i+1)) > cards.get(B.substring(i,i+1)))
                alecWinCount++;
        }
        return alecWinCount;

    }
}
