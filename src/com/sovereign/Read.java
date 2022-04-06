package com.sovereign;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\Users\\HP\\Downloads\\postilion_generic_63_F01.txt"));
        Vector<String> vector = new Vector<String>();
        while (s.hasNextLine()){
            String out = s.nextLine().replace("+", "|");
            vector.add(out);
        }
        s.close();

        for(int i=0;i<vector.size();i++){
            try(FileWriter fw=new FileWriter("C:\\Users\\HP\\Downloads\\Charis.txt");){

                fw.write(vector.get(i) + String.format("\n"));
                System.out.println(vector.get(i));
            }catch(Exception e){System.out.println(e);}

        }
    }
}
