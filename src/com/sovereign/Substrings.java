package com.sovereign;

public class Substrings {

    public static void main(String[] args) {
        System.out.println(subOccurence("abcdabceabcfabch","abc"));
        int [] ar = new int[]{17,500,137,8,16,1,2};
        System.out.println(greaterNumber(ar));
        double a = 5.8;
        double b = 5.8;
        boolean verify = a == b;
        System.out.println(verify);

    }

    static int subOccurence(String s,String sub){
        int len = s.length();
        int count =0;
        String subs = "" ;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                subs = s.substring(i,j);
                if(subs.length()==3 && subs.equals(sub)){
                    count++;
                }
            }
        }
        return count;
    }

    static int greaterNumber(int[] arr){
         int max = 0;
        for (int i=arr.length-1;i>=0;i--){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
}
