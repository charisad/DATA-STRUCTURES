package com.sovereign;

import java.util.Scanner;

public class HackkerankLoop2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int  a = in.nextInt();
            int  b = in.nextInt();
            int  n = in.nextInt();

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