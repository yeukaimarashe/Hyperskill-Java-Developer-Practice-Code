import java.util.Scanner;

public class UnicodeCharacterConversion{
    public static  void  main (String [] args){
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        input += 1;
        System.out.println(input);

    }
}