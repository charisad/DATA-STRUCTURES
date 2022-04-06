package com.sovereign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AddListElement {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(addElements(num));
    }
    public static int addElements(List<Integer> numbers){

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        return (int) stats.getSum();
    }
}
