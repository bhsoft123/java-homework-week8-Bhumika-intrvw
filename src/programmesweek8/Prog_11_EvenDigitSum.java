package programmesweek8;
/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
PRIME TESTING
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static*/

import java.util.Scanner;

public class Prog_11_EvenDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number more than 2 digits long:");
        int number = sc.nextInt();
        if(getEvenDigitNumber(number) == -1){
            System.out.println("Invalid entry");}
        else{
        System.out.println("Sum of even digits: " + getEvenDigitNumber(number));}
        sc.close();
    }

    public static int getEvenDigitNumber(int number) {

        // if number is odd then last digit will be odd positioned
        //boolean isEven = (number % 2 == 0) ? true : false;
        int sumeven = 0;
        if (number <0 ){
            return -1;
        }
        else{
        while (number > 0) {
            if (number % 2 ==0) {
                sumeven += number % 10;
                number /= 10;
            }                           // add else in the loop for odd number if required
            number /= 10;
        }
        return sumeven;}
    }
}
