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
    public static double sinus (double opposite, double hypotenuse){
        double sin = opposite / hypotenuse;
        return sin;
    }

    public static double cosine (double adjacent, double hypotenuse){
        double cos = adjacent / hypotenuse;
        return cos;
    }

    public static double tangent (double opposite, double adjacent){
        double tan = opposite / adjacent;
        return tan;
    }

    public static double squareOfCircle (double radius){
        double squareAnsw = PI * radius * radius;
        return squareAnsw;
    }

    public static double lengthOfCircle (double radius){
        double lengthAnsw = PI * radius * 2;
        return lengthAnsw;
    }
}
