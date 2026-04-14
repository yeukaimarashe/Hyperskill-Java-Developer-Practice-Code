import java.util.Scanner;

class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(scanner.hasNext()){
            if(scanner.nextInt() != 0){
                count ++;
            } else{
                System.out.println(count);
            }
        }



    }
}