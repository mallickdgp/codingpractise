package com.company.codingpractise;

import java.util.HashMap;

public class LongestDistinctPath {

    public class Tree{
        public int x;
        public Tree l;
        public Tree r;
    }

 public static int solution(Tree T){
        if(T == null)
            return 0;

     HashMap<Integer, Integer> holder = new HashMap<Integer, Integer>();

     return largestUniquePath(T, holder);
 }

    public static int largestUniquePath(Tree T, HashMap<Integer, Integer> holder){
        if(T == null)
            return holder.size();

        if(holder.containsKey(T.x)){
            holder.put(T.x, holder.get(T.x)+1);
        }
        else
            holder.put(T.x, 1);

        int largestPath = Math.max(largestUniquePath(T.l, holder), largestUniquePath(T.r, holder));

        if(holder.containsKey(T.x)){
            holder.put(T.x, holder.get(T.x) - 1);
        }

        if(holder.get(T.x) == 0)
            holder.remove(T.x);

        return largestPath;
    }
}
