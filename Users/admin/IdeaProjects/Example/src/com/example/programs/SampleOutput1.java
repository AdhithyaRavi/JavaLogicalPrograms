package com.example.programs;

import java.util.Scanner;

/**
 * input: A10B5
 * output: AAAAAAAAAABBBBB
 * input: A5B10
 * output: AAAAABBBBBBBBBBB
 */
public class SampleOutput1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = scanner.next();

        if (str.length() == 2) {
            char c = str.charAt(0);
            char d = str.charAt(1);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if (d >= '1' && d <= '9') {
                    int num = Character.getNumericValue(d);
                    while (num > 0) {
                        System.out.print(c);
                        num--;
                    }
                }
            }
        } else if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                char c = str.charAt(i);
                char d = str.charAt(i + 1);
                char e = str.charAt(i + 2);

                if (d >= '1' && d <= '9' && e >= '0' && e <= '9') {
                    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                        int num = Integer.parseInt(String.valueOf(d) + String.valueOf(e));
                        while (num > 0) {
                            System.out.print(c);
                            num--;
                        }
                    }
                } else if (e >= '0' && e <= '9') {
                    if (d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z') {
                        int num = Character.getNumericValue(e);
                        while (num > 0) {
                            System.out.print(d);
                            num--;
                        }
                    }
                } else if (d >= '0' && d <= '9') {
                    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                        int num = Character.getNumericValue(d);
                        while (num > 0) {
                            System.out.print(c);
                            num--;
                        }
                    }
                }
            }
        }
    }

}
