

import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int squi = scanner.nextInt();
      int nuts = scanner.nextInt();
      System.out.println(nuts%squi);
      int minutes = scanner.nextInt();
      int hours = minutes / 60;
      int remainingMins = minutes % 60;
      System.out.println(hours + " hours and " + remainingMins + " minutes");
      int num = scanner.nextInt();
      System.out.println(((num + 1) * num + 2) * num + 3);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println((num / 10) % 10 );
        System.out.println(num2 +" "+ num1);

    }
}