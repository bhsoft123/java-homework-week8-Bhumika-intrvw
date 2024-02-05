package programmesweek8;

import java.util.Scanner;
//try with ternary operator
public class Prog_1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //declaring scanner
        int i =1;
        int number;
        int sum=0;
        while(i <= 10) {            //while loop to count valid input entries
            System.out.println("Enter number " + i);
            if (sc.hasNextInt()) {      //if loop to calculate sum and displaying invalid entry message
                number = sc.nextInt();
                i++;
                sum = sum + number;
            } else {
                System.out.println("Invalid number");}
            }
        sc.close();
        System.out.println(sum);

        }
    }
