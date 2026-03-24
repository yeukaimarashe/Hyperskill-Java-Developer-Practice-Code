

import java.util.Scanner;

public class DoubleToIntCast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        // TODO: Write your code here to read a double from the console
        double num = scanner.nextDouble();
        // Convert and print the number to an integer.
        int result = (int) num;
        // TODO: Write your code here to convert the double to an integer and print it out to the console
        System.out.println(result);
        scanner.close();
    }
}