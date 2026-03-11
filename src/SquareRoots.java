import java.util.Scanner;

public class SquareRoots {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt();

        // Compute and print the square of n
        System.out.println(n * n);
        // Compute and print the cube of n
        System.out.println(n * n * n);
        // Compute and print the fourth power of n
        System.out.println(n * n * n * n);

        int a = 5, b = 11;
        System.out.println(b + a); // Prints 16

        System.out.println(b - a); // Prints 6

        System.out.println(b * a); // Prints 55

        System.out.println(b / a); // Print2

        System.out.println(b % a); // Prints 1

        System.out.println((a - b) + a * (b - a) - a % b); // Prints 8
        System.out.println(2 + 4 * 5 - 10 / (2 + 1));
    }
}