package com.example.programs;

import java.util.*;

public class OddAndEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num of values: ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values: ");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        Stack<Integer> even = new Stack<>(); // desc
        Queue<Integer> odd = new PriorityQueue<>(); //asc

        for (int i : arr) {
            if (i % 2 == 0) even.add(i);
            else odd.add(i);
        }
        while (!odd.isEmpty() || !even.isEmpty()) {
            if (!odd.isEmpty()) System.out.print(odd.poll());
            if (!even.isEmpty()) System.out.print(even.pop());
        }

    }

}
