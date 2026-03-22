import java.util.Scanner;

class DoubleEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = (c - b) / a;

        System.out.println(x);
    scanner.close();
    }
}