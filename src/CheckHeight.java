import java.util.Scanner;

class CheckHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        boolean arrangement = h1 >= h2 && h1 >=h3 || h1 <= h2 && h2 <= h3;
        System.out.println(arrangement);
        scanner.close();
    }
}