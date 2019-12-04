package com.company;

public class Factorials {

    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
        System.out.println(calcFactorial(6));
        System.out.println(calcFactorial(10));

        manyFactorials();

    }
    public static long calcFactorial(long n) {
        long total=n;
        for (long i=(n-1); i>0; i--) {
            total*=i;
        }
        return total;
    }
    /*
    Result from calcFactorial:
    120
    720
    3628800
     */

    public static long manyFactorials() {
        for (long k=1; k<=20; k++) {
            long a = calcFactorial(k);
            System.out.println(a);
        }
        return 0;
    }
    /*
    Result for manyFactorials 1-10:
    1
    2
    6
    24
    120
    720
    5040
    40320
    362880
    3628800

    Result for manyFactorials 1-20:
    1
    2
    6
    24
    120
    720
    5040
    40320
    362880
    3628800
    39916800
    479001600
    6227020800
    87178291200
    1307674368000
    20922789888000
    355687428096000
    6402373705728000
    121645100408832000
    2432902008176640000
     */

    public static double calcE() {
        double e=1;
        double olde=0;
        while(e-olde > .001) {
            for
        }
    }

}
