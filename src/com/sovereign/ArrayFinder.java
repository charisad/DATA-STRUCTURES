package com.sovereign;

public class ArrayFinder {
    boolean[] solution(int[] a, int l, int r) {
        boolean [] res = new boolean[a.length];
        for(int i =0;i<a.length;i++){
            for(int j=l;j<=r;j++){
                if(((i+1) * j) == a[i]){
                    res[i] = true;
                }else{
                    res[i] = false ;
                }
            }
        }
        return res;
    }

}
