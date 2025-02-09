package Algorithms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");*/
        System.out.println(fibEffective(6));
    } // O(2^n)
    private static long fibEffective(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }// O(n)
    private static long fibNaive(int n) {
        if (n <= 1){
            return n;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
}
