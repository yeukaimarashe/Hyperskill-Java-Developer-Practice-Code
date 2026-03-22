import java.util.Scanner;

class DegreesToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double celcius = scanner.nextDouble();
       double fanhereit = (celcius * 1.8) + 32;
       System.out.println(fanhereit);

        double data = 1.50511e+4;
        int value = (int)data;
        System.out.println(value);
       scanner.close();
    }
}