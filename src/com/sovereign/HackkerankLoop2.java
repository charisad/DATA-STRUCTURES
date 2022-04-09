package com.sovereign;

import java.util.Scanner;

public class HackkerankLoop2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=1;

        for(int i=0;i<t;i++){
            int  a = 5;
            int  b = 3;
            int  n = 5;

            for(int j=1;j<=n;j++){
                int k=0;
                int val = a;
                for(int l=0;l<j;l++){
                    val += ((int)Math.pow(2,k)*b);
                    k++;
                }
                System.out.print(val +" ");
            }
            System.out.println();
        }
        in.close();



    }
}