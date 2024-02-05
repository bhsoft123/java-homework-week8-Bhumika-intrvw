package programmesweek8;

import java.util.Scanner;

public class Prog_2_MinAndMaxInputChallenge {

    public static void main(String[] args)
    {
        int min = Integer.MIN_VALUE; // declaring min value for integer
        int max = Integer.MAX_VALUE; // declaring max value for integer
        boolean firstInt = true;

    Scanner sc= new Scanner(System.in); //scanner declaration
    System.out.println("Enter number:");
    while (true){                       // while loop for taking endless input
         if(sc.hasNextInt()){
              int number = sc.nextInt();
              if(firstInt){
                    min = number;
                    max = number;
                    firstInt = false;  }
              else
              {
                    if (number < min) {
                    min = number;  }
                    if (number > max) {
                        max = number; }
                }
                }
              else {
                    System.out.println("Number is Invalid ");
                    break;
            }  }

    if (firstInt) {
        System.out.println("No valid numbers entered ");
    } else {
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
    }}
