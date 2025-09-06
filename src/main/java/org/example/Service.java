package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            checkBAndCValues(b, c);
        } else if (a < 0) {
            System.out.println("a is non-positive");
            checkBAndCValues(b, c);
        } else {
            System.out.println("a is non-positive");
            checkBAndCValues(b, c);
        }
    }

    private void checkBAndCValues(int b, int c) {
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
