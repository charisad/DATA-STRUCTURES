package com.sovereign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOccurencesOfA {

    public static void main(String[] args) {
        String v = "a";
        Long num = 1000000000l;
//        repeatedString(v,num);
        System.out.println(repeatedString(v,num));
    }
//

   public static long repeatedString(String s, long n) {
        long num = n/s.length();
        long rem = n%s.length();
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                ans += num;
                if (i < rem)
                    ans++;
            }
        }
        return ans;
    }

}
