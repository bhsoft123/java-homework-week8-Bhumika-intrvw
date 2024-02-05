package programmesweek8;
/* Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number*/

import java.util.Scanner;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number*/

public class Prog_9_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to be printed:");
        int n = sc.nextInt();
        int n1 =1 ;
        int n2 = 0;
        int n3;
        for (int i = 1; i <= n; i++) {// for loop for fibonacci
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
