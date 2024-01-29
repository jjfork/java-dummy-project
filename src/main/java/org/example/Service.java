package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        checkAndPrintSign(a, "a");
        checkAndPrintSign(b, "b");
        checkAndPrintSign(c, "c");
    }

    private void checkAndPrintSign(int num, String name) {
        if (num > 0) {
            System.out.println(name + " is positive");
        } else {
            System.out.println(name + " is non-positive");
        }
    }
}