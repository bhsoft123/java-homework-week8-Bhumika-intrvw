package programmesweek8;
/* 6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910*/

import java.util.Scanner;

public class Prog_6_TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows to be printed for a triangle pattern:");
        int rows = sc.nextInt();
        for (int j = 1; j <= rows; j++) {       // for loop to create pattern
            for (int i = 1; i <=j; i++ ) {
                System.out.print(i);
            }
            System.out.println("");
            sc.close();
        }
    }}