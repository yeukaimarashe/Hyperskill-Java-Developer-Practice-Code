import java.util.Scanner;

class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        int time = scanner.nextInt();
        double averageSpeed = distance/time;
        System.out.println(averageSpeed);
    }
}