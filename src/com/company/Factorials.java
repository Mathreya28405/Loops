package com.company;

public class Factorials {

    public static void main(String[] args) {
        /* System.out.println(calcFactorial(5));
        System.out.println(calcFactorial(6));
        System.out.println(calcFactorial(10));

        manyFactorials();

        System.out.print(calcE());

        System.out.println(calcEX(1));
        System.out.println(calcEX(2));
        System.out.println(calcEX(3));
        System.out.println(calcEX(4));
        System.out.println(calcEX(5)); */

        System.out.printf("e is %2.3f \n", calcEX(1));
        System.out.printf("e is %2.3f \n", calcEX(2));
        System.out.printf("e is %2.3f \n", calcEX(3));
        System.out.printf("e is %2.3f \n", calcEX(4));
        System.out.printf("e is %2.3f \n", calcEX(5));

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
        long n=1;
        double olde=0;
        while(e-olde > .001) {
            olde=e;
            e+= 1.0/(calcFactorial(n));
            n++;

        }
        return e;
    }
    /*
    Result for calcE:
    2.7182539682539684
     */

    public static double calcEX(int g) {
        double e=1;
        long n=1;
        double olde=0;
        while(e-olde > .001) {
            olde=e;
            e+= (1.0*(Math.pow(g, n)))/calcFactorial(n);
            n++;
        }
        return e;
    }
    /*
    Result for calcEX:
    2.7182539682539684
    7.388994708994708
    20.08546859390609
    54.5978829056501
    148.4129510721643

    e is 2.718
    e is 7.389
    e is 20.085
    e is 54.598
    e is 148.413
     */

}
