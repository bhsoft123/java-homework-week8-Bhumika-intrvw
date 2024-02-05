package programmesweek8;
/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/

import java.util.Scanner;

public class Prog_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        sc.close();
        int m = n / 2;
        if (n == 1 || n == 0) {
            System.out.println("The number is not a prime number ");
        } else {
            for (int i = 2; i <= m; i++) {   // finding mode by deviding number by other numbers
                if (n % i == 0) {
                    System.out.println("The number is not a prime number");
                    break;
                } else {
                    System.out.println("The number is a prime number");
                    break;
                }
            }
        }
    }}

