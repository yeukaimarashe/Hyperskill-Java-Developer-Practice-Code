import java.util.Scanner;

public class SpeedAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the distance traveled in kilometers
        double distance = scanner.nextDouble();

        // Read the time taken in hours
        double time = scanner.nextDouble();


        double averageSpeed = distance / time;

        // Print the average speed rounded to 2 decimal places
        System.out.printf("%.2f", averageSpeed);
    }
}