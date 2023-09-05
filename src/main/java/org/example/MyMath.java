package org.example;

public class MyMath {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    public static int maxOfNumbers(int num1, int num2) {
        int maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }

    public static double maxOfNumbers(double num1, double num2) {
        double maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }

    public static float maxOfNumbers(float num1, float num2) {
        float maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }

    public static long maxOfNumbers(long num1, long num2) {
        long maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }
}
