package com.java.codingpoblems;

public class CheckInsertionOrder {

//input string = aabbbccccaaa, maintain the insertion order and output should be a2b3c4a3


    public static void process(String mystring) {
        StringBuilder sb = new StringBuilder();
        char[] mychar = mystring.toCharArray();
        int count = 1;
        for (int i = 0; i < (mychar.length) - 1; i++) {
            if (mychar[i] == mychar[i + 1]) {
                count = count + 1;
                System.out.println("count: " + count);
            } else {
                sb.append(mychar[i]);
                sb.append(count);
                count = 1;
            }
            if (i == (mychar.length) - 2) {
                sb.append(mychar[i + 1]);
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
//        process("aabbbccccaaa");
        getInsertionOrder("aabbbccccaaa");
//        process("ggggyyynnnkkkkkk");
//        process("aabbcccdef");
//        process("abcdefghj");
    }


    static void getInsertionOrder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        int count = 1;
        for (int i = 0; i < (chars.length) - 1; i++) {
            if (chars[i] == chars[i + 1]) {

                count = count + 1;
            } else {
                stringBuilder.append(chars[i]);
                stringBuilder.append(count);
                count = 1;
            }
            if (i == (chars.length) - 2) {
                stringBuilder.append(chars[i + 1]);
                stringBuilder.append(count);

            }
        }
        System.out.println(stringBuilder.toString());
    }

}

