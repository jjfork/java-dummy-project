package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        checkNumber(a);
        checkNumber(b);
        checkNumber(c);
    }

    private void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is non-positive");
        }
    }
}