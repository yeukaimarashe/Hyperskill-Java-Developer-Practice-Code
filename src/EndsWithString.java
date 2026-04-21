import java.util.Scanner;

class EndsWithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        System.out.println(expression.endsWith("burg"));
        String str = "All robots speak Java";
        System.out.println(str.length());
    }
}