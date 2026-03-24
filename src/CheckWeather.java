import java.util.Scanner;

public class CheckWeather {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean isSunny = scanner.nextBoolean();
//        boolean isRainy = scanner.nextBoolean();
//        boolean isCold = scanner.nextBoolean();
//
//        // Calculate and print decision
//
//            System.out.println(isSunny && !(isRainy || isCold));

        boolean a = false;
        boolean b = true;
        boolean c = true;
        System.out.println(!a && (a ^ b) && (!b ^ c) && (!a ^ !c));

      //  scanner.close();
    }
}