package programmesweek8;

import java.util.Scanner;

/*
5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
 */
public class Prog_5_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }

    public static boolean isPalindrome(int number){
        int x  = number;
        int lastdigit;
        int reverse = 0;

        while (number>0) {      //  to reverse number
            lastdigit = number % 10;//1221-122-12
            number = number / 10;
            System.out.println(reverse);
            reverse = reverse * 10 + lastdigit;
            System.out.println(reverse);
        }
        return reverse == x;   // simplified if statement
        }

}




