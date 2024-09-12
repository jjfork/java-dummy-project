package org.example;

public class Service {
    /**
     * Checks if the input number is even.
     *
     * @param input the number to check
     * @return true if the number is even, false otherwise
     */
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    /**
     * A method with high complexity based on input values a, b, and c.
     *
     * @param a the first input value
     * @param b the second input value
     * @param c the third input value
     */
    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
        } else if (a < 0) {
            System.out.println("a is non-positive");
        } else {
            System.out.println("a is non-positive");
        }

        if (b > 0) {
            System.out.println("b is positive");
        } else {
            System.out.println("b is non-positive");
        }

        if (c > 0) {
            System.out.println("c is positive");
        } else {
            System.out.println("c is non-positive");
        }
    }
}
