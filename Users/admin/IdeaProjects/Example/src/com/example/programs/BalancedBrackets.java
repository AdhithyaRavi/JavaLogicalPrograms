package com.example.programs;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = scanner.next();

        System.out.print((checkBalanced(str)) ? "BALANCED" : "NOT BALANCED");

    }

    public static boolean checkBalanced(String str) {
        char[] expArr = str.toCharArray();
        Stack<Character> characters = new Stack<>();

        for (char i : expArr) {
            switch (i) {
                case '{':
                    characters.push('}');
                    break;
                case '[':
                    characters.push(']');
                    break;
                case '(':
                    characters.push(')');
                    break;
                default:
                    if (i == '}' || i == ']' || i == ')') {
                        if (characters.isEmpty() || characters.peek() != i) return false;
                        characters.pop();
                    }
            }
        }
        return characters.isEmpty();
    }

}