import java.util.Scanner;

class ExponentialExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double x = scanner.nextDouble();
      int pow1 = 3;
      int pow2 = 2;
      double result = Math.pow(x , pow1) + Math.pow(x, pow2) + x + 1;
      System.out.println(result);
      scanner.close();
    }

}