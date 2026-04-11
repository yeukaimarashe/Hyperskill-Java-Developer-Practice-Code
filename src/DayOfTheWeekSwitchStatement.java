import java.util.Scanner;

public class DayOfTheWeekSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int dayNumber = scanner.nextInt();
        int var1 = 100;
        int var2 = 0;
        // Use a switch statement to determine the day of the week
        switch (dayNumber) {

            // Add cases for each day of the week (1-7)
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

           default:
                System.out.println("Invalid Day of The Week");

        }
        switch (var1) {
            case 100:
                var2 += var1;
                System.out.println(var2);
            case 200:
                var2 += var1 / 4;
                System.out.println(var2);
                break;
            case 300:
                var2 += var1 / 10;
                System.out.println(var2);
                break;
        }
        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;

            case 'b':
                num = 20;


            default:
                num = 30;
        }
        System.out.println(num);

        scanner.close();
    }
}