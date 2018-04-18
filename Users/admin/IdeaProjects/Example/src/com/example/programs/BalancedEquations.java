package com.example.programs;

import java.util.Scanner;
import java.util.Stack;

public class BalancedEquations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = scanner.next();

        System.out.print("BALANCED NOT BALANCED");

    }

    public static boolean checkEquationBalance(String equation) {

        char[] chars = equation.toCharArray();
        Stack<Character> characterStack = new Stack<>();

        for (char c : chars) {
            switch (c) {
                case '(':
                    characterStack.push('(');
                    break;
            }
        }


        return true;
    }

}
