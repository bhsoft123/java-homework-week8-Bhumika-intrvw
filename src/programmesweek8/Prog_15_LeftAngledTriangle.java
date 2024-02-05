package programmesweek8;
/*15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * **/

import java.util.Scanner;

public class Prog_15_LeftAngledTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();
        int i; int j;
        for (i =1; i<=n; i++)           // i for printing lines
        {
            for (j = 1; j <= i; j++)    // j for printing stars
            {
            System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
