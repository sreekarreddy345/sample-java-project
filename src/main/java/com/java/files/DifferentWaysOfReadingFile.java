package com.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class DifferentWaysOfReadingFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\sreek\\Desktop\\sample.txt";

        //using buffered reader
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        while (bufferedReader.readLine() != null) {
            sb.append(bufferedReader.readLine() + "\n");
        }
        System.out.println("data - " + sb);



        // reading file using File Reader
        FileReader fileReader = new FileReader(path);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }


        // reading files using readAllBytes
        File f = new File(path);
        String s = new String(Files.readAllBytes(f.toPath()));
        System.out.println("S - " + s);

    }
}


