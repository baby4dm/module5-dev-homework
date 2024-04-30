package org.example;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<Integer, Integer> cash = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(iterateFibonacci(6));
        System.out.println(recursiveFibonacci(6));
        System.out.println(dynamicFibonacci(6));
    }



    /**
     * Time complexity -> O(n)
     * Space complexity -> O(1)
     */
    public static int iterateFibonacci(int n){
        if (n <= 1) return n;
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    /**
     * Time complexity -> O(2^n)
     * Space complexity -> O(n)
     */

    public static int recursiveFibonacci(int n){//
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    /**
     * Time complexity -> O(n)
     * Space complexity -> O(n)
     */
    public static int dynamicFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (cash.containsKey(n)) {
            return cash.get(n);
        }
        int num = dynamicFibonacci(n - 1) + dynamicFibonacci(n - 2);
        cash.put(n, num);
        return num;
    }
}