package com.sovereign;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5},4));
    }
    public static int binarySearch (int[] arr,int value) {
        int lower = 0;
        int upper = arr.length-1;
        while(lower <= upper){
        int middle = lower + (upper - lower)/2;
            if(value == arr[middle]){
                return middle;
            }else if(  arr[middle] < value ){
                lower = middle + 1;
            }else{
                upper = middle-1 ;
            }
        }
        return -1; //+"not found";
    }
}
