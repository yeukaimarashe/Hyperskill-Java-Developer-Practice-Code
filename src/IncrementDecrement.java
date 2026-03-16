import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int inputInteger = inputScanner.nextInt();
        // your code here - increase the integer by 1, then decrease it by 2, and finally increase it by 3
        inputInteger +=1;
        inputInteger -=2;
        inputInteger +=3;
        // print the final computed integer
        System.out.println(inputInteger);

        int n = 10;
        n--;
        System.out.println(n++);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(--a +" "+ --b +" "+ --c +" "+ --d );
    }
}