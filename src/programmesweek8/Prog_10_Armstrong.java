package programmesweek8;
/*0. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

import java.util.Scanner;

public class Prog_10_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number more than 2 digit");
        int number = sc.nextInt();
        sc.close();
        boolean isArmstrong = isArmstrongNumber(number);
        if (isArmstrong){
            System.out.println(+number +" is an Armstrong Number");}
            else {
            System.out.println(+number + " is not an Armstrong Number");
        }
    }   //method to check if the number is armstrong number
        public static boolean isArmstrongNumber(int number){
            int originalNumber = number;
            int result = 0;
            int n = String.valueOf(number).length();
            while (number > 0) {
                int digit = number % 10;
                result += Math.pow(digit, n); // calculate power to the number
                number /= 10;
            }
            return originalNumber == result;
        }
    }