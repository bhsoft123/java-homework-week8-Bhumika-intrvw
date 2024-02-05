package programmesweek8;
/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

public class Prog_8_RightAngleTriangle {

    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {       // for loop to create pattern
            for (int i = 1; i <= j; i++) {
                System.out.print("@)");
            }
            System.out.println("");
        }
    }}
