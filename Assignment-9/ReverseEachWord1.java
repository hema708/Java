package com.java.basics;

public class ReverseEachWord1 {
    public static void main(String[] args) {
        String str = "Java is easy";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }

            System.out.print(" ");
        }
    }
}