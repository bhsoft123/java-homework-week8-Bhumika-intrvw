package programmesweek8;
/*3. Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant
        For capital alphabets 65 – 90
        For small alphabets 97 – 122
        For digits 48 – 57
        For symbols 32 - 47, 91 - 96, 123 - 127 up to 255*/
//65,69,73,79,85
//97,101,105,111,117
import java.util.Scanner;

public class Prog_3_VowelsAndConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a/an alphabet letter:");
        if (sc.hasNextInt()) {
            System.out.println("Invalid Entry");}
        String s = sc.nextLine();
        if (s.length()>1){
            System.out.println("Invalid Entry");}
        else{
        char entry = sc.nextLine().charAt(0);
        checkentry(entry);}
        sc.close();
    }
    public static void checkentry(char entry) {

        if (entry == 65 || entry == 69 || entry == 73 || entry == 79 || entry == 85 || entry == 97 || entry == 101 || entry == 105 || entry == 107 || entry == 117) {
            System.out.println("Letter " + entry + " is a Vowel");
        }
        else {
            System.out.println("Letter " + entry + " is a Consonant");
        }

    }}

