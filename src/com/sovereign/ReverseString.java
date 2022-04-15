package com.sovereign;

public class ReverseString {

    public static void main(String[] args)
    {
        String str= "Madam", nstr="";
        int a = 9;
        System.out.println(((Object)a).getClass().getSimpleName());
//        System.out.println((Object(a)).getClass().getSimpleName());
        char ch;
        String isPal = "";

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        if (str.equalsIgnoreCase(nstr)){
            isPal = "and is a palindrome";
        }
        System.out.println("Reversed word: "+ nstr + " "+isPal);
    }
}