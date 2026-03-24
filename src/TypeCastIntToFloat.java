

import java.util.Scanner;

public class TypeCastIntToFloat {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read float value from user and assign it to floatVariable
        float floatVariable = scanner.nextFloat();

System.out.println((int)floatVariable/2);
        // Close the Scanner
        scanner.close();
    }
}