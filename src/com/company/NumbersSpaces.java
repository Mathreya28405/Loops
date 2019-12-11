package com.company;

public class NumbersSpaces {
    public static void main (String [] args) {
        //numSpace1();
        //stars1();
        stars2();
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
    public static void stars1() {
        for (int i = 0; i < 3; i++) {
            for (int k=0; k<(i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=0; m<2; m++) {
            for (int n=(2-m); n>0; n--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    /*
     *
     **
     ***
     **
     *
     */

    public static void stars2() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=5-(2*i); k>0; k--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int q=0; q<7; q++) {
            System.out.print("*");
        }
    }
    /*

     *     *
     **   **
     *** ***
     *******

     */



}

