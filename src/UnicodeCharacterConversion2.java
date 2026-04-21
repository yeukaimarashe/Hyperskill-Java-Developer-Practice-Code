import java.util.Scanner;

public class UnicodeCharacterConversion2{
    public static  void  main (String [] args){
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

         System.out.println( input == 'z' ? 'a' : ++input);


    }
}