import java.util.Scanner;

public class FormattedInputStrings {
    public static void main(String[] args) {
        // Create a Scanner object which will allow us to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner's nextLine method to read a line of input
        String name = scanner.nextLine();

        // Use the Scanner's nextInt method to read the next integer
        int height = scanner.nextInt();

        // TODO: Print the given statement replacing the placeholders with given inputs using formatted string.


        String details = "Hello, my name is %s and I am %d cm tall."
                .formatted(name, height);

        System.out.println(details);

        double num1 = 35;
        double num2 = 23.34;
        System.out.printf("%f %f", num1, num2);
    }
}