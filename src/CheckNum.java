import java.util.Scanner;

class CheckNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean result = a < 10;
        System.out.println(result);
        scanner.close();

    }
}