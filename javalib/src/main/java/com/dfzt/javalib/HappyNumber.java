package com.dfzt.javalib;

public class HappyNumber {

    public static void main(String[] args) {


        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {

        int i = n,  j = n;


       do {
            i = getNum(i);
            j = getNum(getNum(j));

            if (j == 1) {
                return true;
            }
        } while (i != j);


        return j==1;
    }

    private static int getNum(int n) {
        int target = 0;

        while (n > 0) {
            target += (n % 10) *(n % 10);

            n= n/10;

        }
        return target;
    }


}
