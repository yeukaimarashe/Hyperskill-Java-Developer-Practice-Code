import java.util.Scanner;

class AverageRangeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElem = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numElem; i++) {

            int sequence = scanner.nextInt();
            if (sequence % 6 == 0) {
                sum += sequence;
            }
        }
        System.out.print(sum);
    }
}