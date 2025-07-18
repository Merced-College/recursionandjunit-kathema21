package com.kath.recursion;

public class Recursive {

    public static int count8(int n) {
        int nthDigit = n % 10;
        int nm1Digit = (n / 10) % 10;

        if (n == 0) {
            return 0;
        }
        else if (nthDigit == 8) {
            if (nm1Digit == 8) {
                return 2 + count8(n / 10);
            }
            else {
                return 1 + count8(n / 10);
            }
        }
        else {
            return count8(n / 10);
        }
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        else {
            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                return 1 + countHi(str.substring(1));
            }
            else {
                return countHi(str.substring(1));
            }
        }
    }

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        else if (str.length() >= 3 && str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
            return countHi2(str.substring(3));
        }
        else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(2));
        }
        else {
            return countHi2(str.substring(1));
        }
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        else {
            if (str.startsWith(sub)) {
                return 1 + strCount(str.substring(sub.length()), sub);
            }
            else {
                return strCount(str.substring(1), sub);
            }
        } 
    }

    public static String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }
        else if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        else {
            return str.substring(0, 1) + stringClean(str.substring(1));
        }
    }
}
