import java.util.Scanner;

class GroundhogsParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean success;
        if (isWeekend) {
            success = cups >= 15 && cups <= 25;

        } else {
            success = cups >= 10 && cups <= 20;

        }
        System.out.println(success);
        scanner.close();
    }
}