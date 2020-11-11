package com.java.codingpoblems;

public class RemoveSpacesInString {
    public static void main(String[] args) {
        String str = "Enter input string to be cleaned from white spaces...!";
        System.out.println(str);
        String withoutSpace = str.replaceAll("\\s+", "");
        System.out.println(withoutSpace);

    }
}
