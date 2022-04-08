package com.sovereign;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigO {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat nu = NumberFormat.getCurrencyInstance( Locale.US);
            NumberFormat nc = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat ni = NumberFormat.getCurrencyInstance(new Locale("en","IN"));

            System.out.println("US: " + nu.format(payment));
            System.out.println("India: " + ni.format(payment));
            System.out.println("China: " + nc.format(payment));
            System.out.println("France: " + nf.format(payment));
        }
    }