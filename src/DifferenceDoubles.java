import java.util.Scanner;

class DifferenceDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double result = secondNum - firstNum;
        System.out.println(result);
scanner.close();
    }
}