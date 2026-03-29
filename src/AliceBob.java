import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aliceAge = scanner.nextInt();
        int bobAge = scanner.nextInt();

        String comparisonResult;
        if (aliceAge > bobAge) {
            comparisonResult = "older than";
        } else if (aliceAge == bobAge) {
            comparisonResult = "the same age as";
        } else {
            comparisonResult = "younger than";
        }

        System.out.println("Alice is " + comparisonResult + " Bob.");
    }
}