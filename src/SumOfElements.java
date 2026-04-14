import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            num = sc.nextInt();
            sum +=num;
            System.out.println(sum);
        } while (num != 0);

    }
}