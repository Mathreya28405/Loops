package com.company;

public class exercises {

    public static void main(String[] args) {
        /* System.out.println(addOdds(1));
        System.out.println(addOdds(7));
        System.out.println(addOdds(12));
        System.out.println(addOdds(23));
        System.out.print(addOdds(0)); */

       /*  System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150)); */

       System.out.println(sumDigits(1234));
    }

    public static int addOdds(int n) {
        int total= 0;
        for (int i=1; i<=n; i+=2) {
            total += i;
        }
        return total;
    }
/*
Results for addOdds tests:
1
16
36
144
0
 */

    public static double howManyYears(double startPop, double endPop) {
        int numYears=0;
        while (startPop < endPop) {
            numYears++;
            startPop*=1.0113;
        }
        return numYears;
    }
/* Results for howManyYears:
7.0
27.0
 */

    public static int sumDigits(int n) {
        int total = 0;
        while (n>0) {
            int x = n%10;
            n-=x;
            total+=x;
        }
        return total;
    }
}