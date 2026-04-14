import java.util.Scanner;

class HighestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int num;
        do {
            num = scanner.nextInt();
            if (num > max) {
                max =num;
            }

        } while (num != 0);
        System.out.println(max);
    }
}



