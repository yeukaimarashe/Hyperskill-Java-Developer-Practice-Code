import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String firstName = sc.nextLine();
        String cuisine = sc.nextLine();
        int years = sc.nextInt();

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who cooks " + cuisine + " dishes and has "+ years +" years of experience.");
        sc.close();
    }
}