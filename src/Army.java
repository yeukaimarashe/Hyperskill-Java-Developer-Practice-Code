import java.util.Scanner;

class Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = scanner.nextInt();
        if(num < 1){
            System.out.println("no army");
        }
        else if(num <= 19){
            System.out.println("pack");
        }
        else if(num <= 249){
            System.out.println("throng");
        }
        else if(num <= 999){
            System.out.println("zounds");
        }
        else{
            System.out.println("legion");
            }

        if (a <= 0) {

            if(a == 0) {
                System.out.print("1 ");
            }
            else {
                System.out.print("2 ");
            }
        }
        System.out.print("3 ");
        scanner.close();
        }
}
