package com.sovereign;

public class StarPattern {
    public static void main(String[] args) {
        staircase(6);
    }
    public static void staircase(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.print(" ");

                }else{
                    System.out.print("#");
                }
            }

            System.out.println();

        }

    }
}
