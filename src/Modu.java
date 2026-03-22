import java.util.Scanner;

public class Modu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        System.out.println(input % 2);
        // The second operation goes here
        System.out.println((input % 2) * 3);


        int n = scanner.nextInt();


        n++;

        n-=2;

        n*=2;
        // Print the final value of n
        System.out.println(n);
        int a = 4;
        int b = a++;
        int c = --a + b++;
        int result = ++a - (c++ - b) + c;
        System.out.println(result);

        scanner.close();
    }
}