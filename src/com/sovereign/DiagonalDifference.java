package com.sovereign;

import java.util.List;

public class DiagonalDifference {


    public static void main(String[] args) {

    }
    public static int diagonalDifference(List<List<Integer>> arr) {

        int size = arr.size();
        int add1=0;
        int add2=0;
        for(int i=0 ; i < size ; i++){
            add1 = add1+  arr.get(i).get(i);
            add2 = add2+ arr.get(i).get(size -i-1);

        }

        int absoluteValue =Math.abs( add1 - add2);

        return absoluteValue;

    }
}
