import java.util.Scanner;

class SleepingPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if(H < A){
            System.out.println("Deficiency");
        }
        else if( H > B ){
            System.out.println("Excess");
        }
        else if (H >=A && H <=B){
            System.out.println("Normal");
        }
        scanner.close();
    }
}