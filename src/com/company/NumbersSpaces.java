package com.company;

public class NumbersSpaces {
    public static void main (String [] args) {
        //numSpace1();
    }
    public static int numSpace1() {
        for (int i=1; i<=5; i++) {
            for (int m=5-i; m>0; m--) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }
/*
    1
   12
  123
 1234
12345
 */



}

