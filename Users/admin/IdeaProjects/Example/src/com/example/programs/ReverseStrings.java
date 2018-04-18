package com.example.programs;

import java.util.*;

/**
 * input: I love India
 * output: India love I
 */
public class ReverseStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");

        String[] inputArr = scanner.nextLine().split("\\s+");

        Collections.reverse(Arrays.asList(inputArr));

        for (String output : inputArr)
            System.out.print(output + " ");

    }
}
