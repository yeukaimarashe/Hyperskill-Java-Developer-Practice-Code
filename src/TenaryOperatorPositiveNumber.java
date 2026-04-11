import java.util.Scanner;

public class TenaryOperatorPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int num = scanner.nextInt();

        String s = num < 0 ? "Negative" : num > 0 ? "Positive" : "Zero";
         System.out.println(s);

         scanner.close();

    }
}