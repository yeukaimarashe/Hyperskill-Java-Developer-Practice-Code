import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for(; i <= j; i++){

            if( i % 3 == 0 && i % 5 == 0){

                System.out.println("FizzBuzz");

            } else if (i % 5 == 0){

                System.out.println("Buzz");

            }
            else if(i % 3 == 0){

                System.out.println("Fizz");
            }
            else{
                System.out.println(i);

            }
        }
    }
}