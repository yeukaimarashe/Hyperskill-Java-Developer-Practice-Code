import java.util.Scanner;
//class Util {
//    public static int[] swapInts(int[] ints) {
//        return new int[]{ints[1], ints[0]};
//    }
//}
public class ErrorCheck {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number+=1);
        System.out.printf("My age is %d", number);
//        String a = scanner.next();
//        String b = scanner.next();
//        String c = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a * 2;
        b = b ^ a;
        int result = a + b;
      // int result = a+ b + c;

      System.out.println(result);
//
//
//                int[] ints = new int[2];
//                ints[0] = Integer.parseInt(scanner.nextLine());
//                ints[1] = Integer.parseInt(scanner.nextLine());
//
//                Util.swapInts(ints);
//
//                System.out.println(ints[1]);
//                System.out.println(ints[0]);
            }
        }
