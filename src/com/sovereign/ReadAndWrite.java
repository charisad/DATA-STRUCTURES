package com.sovereign;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {

    public static void main(String[] args) throws IOException {

        String path = "//postilion_warehouse_20211001.txt";
        reader(path);
    }

//    void readerEfficient(String theFile){
//        LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
//        try {
//            while (it.hasNext()) {
//                String line = it.nextLine();
//                // do something with line
//            }
//        } finally {
//            LineIterator.closeQuietly(it);
//        }
//    }

    static void reader(String path) throws IOException {
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                 System.out.println(line);
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }

    }

}
