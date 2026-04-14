import java.util.Scanner;

class SwitchExpressionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int monthNum = (switch (month) {
            case 1 -> {
                System.out.println("January");
                yield 1;
            }
            case 2 -> {
                System.out.println("February");
                yield 2;
            }
            case 3 -> {
                System.out.println("March");
                yield 3;
            }
            case 4 -> {
                System.out.println("April");
                yield 4;
            }
            case 5 -> {
                System.out.println("May");
                yield 5;
            }
            case 6 -> {
                System.out.println("June");
                yield 6;
            }

            default -> {
                System.out.println("error!");
                yield 0;
            }

        });

        scanner.close();
    }
}