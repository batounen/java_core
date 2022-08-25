import java.util.Scanner;

public class Factorial {

    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a random number to find it's factorial");
        int num = console.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of the number you entered is: " + factorial);
    }
}