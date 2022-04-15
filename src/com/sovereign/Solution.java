package com.sovereign;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
       String a = getSmallestAndLargest("welcometojava",3);
        System.out.println(a);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }



        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            int len = s.length();
            String sub = "";
            Set <String>  set = new HashSet<>();
            String [] str = new String [len];
            for(int i =0;i<len;i++){
                for(int j =i+1 ;j<=len;j++){
                    sub = s.substring(i,j);
                    if(sub.length() == k){
                        set.add(sub);
                    }
                }
            }
//            System.out.println(set);
            String [] st = set.toArray(new String[set.size()]);
            List <String> kt = new ArrayList<>(Arrays.asList(st));
            Collections.sort(kt);
            System.out.println(kt);
            smallest=kt.get(0);
            largest = kt.get(kt.size()-1);
            return smallest + "\n" + largest;
        }


    }