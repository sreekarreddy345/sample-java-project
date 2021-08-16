package com.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class DifferentWaysOfReadingFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\sreek\\Desktop\\sample.txt";
        readFileUsingStream(path);

        // using buffered reader
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

        // reading files using Files.readAllBytes
        File f = new File(path);
        String s = new String(Files.readAllBytes(f.toPath()));
        System.out.println("S - " + s);

        // to read first line
        String firstLine = com.google.common.io.Files.asCharSource(file, UTF_8).readFirstLine();
        System.out.println("firstLine - " + firstLine);

        String firstLineMessage = "";
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(f));
        firstLineMessage = bufferedReader1.readLine();// to read first line
        System.out.println("firstLineMessage - " + firstLineMessage);
    }

    public static String readFileUsingStream(String path1) throws IOException {
        Path path = Paths.get(path1);
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
        System.out.println(streamWithCharset);
        return null;
    }
}


