package com.sovereign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class UsingIntSummaryStatistics {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(addElements(num));
        miniMaxSum(num);
    }
    public static int addElements(List<Integer> numbers){

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        return (int) stats.getSum();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        IntSummaryStatistics stats = arr.stream().mapToInt((x) -> x).summaryStatistics();
        Long min = stats.getSum()-stats.getMax();
        Long max = stats.getSum()-stats.getMin();
        System.out.println(min +" "+max);
    }
}
