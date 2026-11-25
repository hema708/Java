package com.java.basics;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String str = "aabbcccdddd";

        int first = 0;
        int second = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > first) {
                second = first;
                first = count;
            } 
            else if (count > second && count < first) {
                second = count;
                ch = str.charAt(i);
            }
        }

        System.out.println(ch + " (frequency: " + second + ")");
    }
}