package com.sovereign;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

public class Reading {
    public static void main(String[] args) throws FileNotFoundException {
        //The code
        Vector<String> vec = new Vector<String>();
        Path path = Paths.get("C:\\Users\\HP\\Downloads\\postilion_generic_63_F01.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String out = line.replace(";", "|");
                vec.add(out);
                System.out.println(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File fout = new File("C:\\Users\\HP\\Downloads\\post.txt");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (String sa:
                 vec) {
                bw.write(sa);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e){
            // File was not found
            e.printStackTrace();
        } catch (IOException e) {
            // Problem when writing to the file
            e.printStackTrace();
        }


   }




    } 
    

