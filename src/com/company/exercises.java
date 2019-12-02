package com.company;
//Mahathi Athreya 3B
public class exercises {

    public static void main(String[] args) {
        System.out.println(addOdds(1));
        System.out.println(addOdds(7));
        System.out.println(addOdds(12));
        System.out.println(addOdds(23));
        System.out.print(addOdds(0));

        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(15334));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(199817761));

        sillyNumbers();

        sillyNumbers2();

        dollarsAndStars();
    }

    public static int addOdds(int n) {
        int total = 0;
        for (int i = 1; i <= n; i += 2) {
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
        int numYears = 0;
        while (startPop < endPop) {
            numYears++;
            startPop *= 1.0113;
        }
        return numYears;
    }
    /* Results for howManyYears:
    7.0
    27.0
    */

    public static int sumDigits(int n) {
        int total = 0;
        while (n > 0) {
            int x = n % 10;
            n /= 10;
            total += x;
        }
        return total;
    }
    /* Results for sumDigits:
    10
    16
    1
    49
     */

    public static void sillyNumbers() {
        for (int j = 1; j <= 3; j++) {
            for (int i = 0; i <= 9; i++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    /* Result for sillyNumbers:
    000111222333444555666777888999
    000111222333444555666777888999
    000111222333444555666777888999
     */

    public static void sillyNumbers2() {
        for (int k = 1; k <= 4; k++) {
            for (int i = 9; i >= 1; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    /* Result from sillyNumbers2:
    999999999888888887777777666666555554444333221
    999999999888888887777777666666555554444333221
    999999999888888887777777666666555554444333221
    999999999888888887777777666666555554444333221
     */

    public static void dollarsAndStars() {
        for (int i=0; i<=6; i++) {
            for (int j=1; j<=i*2; j++) {
                System.out.print("*");
            }
            for (int k=0; k<=7-i; k++) {
                System.out.print("$");
            }
            for (int l=0; l<=14-(2*i); l++) {
                System.out.print("*");
            }
            for (int k=0; k<=7-i; k++) {
                System.out.print("$");
            }
            for (int j=1; j<=i*2; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
    /*
    Result for dollarsAndStars:
    $$$$$$$$***************$$$$$$$$
    **$$$$$$$*************$$$$$$$**
    ****$$$$$$***********$$$$$$****
    ******$$$$$*********$$$$$******
    ********$$$$*******$$$$********
    **********$$$*****$$$**********
    ************$$***$$************
     */

}
