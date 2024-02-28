package org.example.dynamicprogramming;


public class RodCutting {

    public static int cutRod(int[] price, int n) {
        int[] val = new int[n + 1];
        val[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, price[j - 1] + val[i - j]);
            }
            val[i] = maxVal;
        }

        return val[n];
    }
}
