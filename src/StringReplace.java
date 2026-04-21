import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        System.out.println(expression.replace("a", "b"));
        System.out.println(1 + 1 + "2" + 2);
        System.out.println(2 + 2 + "2");
        System.out.println("2" + 2 + 2);
        System.out.println("2" + 2 + 1 + 1);

    }
}