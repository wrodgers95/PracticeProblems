package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {

    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDouble(int a, int b) {

        int sum = a + b;

        if (a == b) {
            sum = (a + b) * 2;
            return sum;
        } else {
            return sum;
        }
    }

    public static int diff21(int n) {
        if (n > 21){
            return ((n - 21) * 2);
        } else {
            return (21 - n);
        }
    }

    public static boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));

    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10 || (Math.abs(100 + n) <= 10 )));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static boolean startHi(String str) {
        return (str.substring(0,2).equalsIgnoreCase("hi"));
    }

    public static boolean icyHot (int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) ;
    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

}
