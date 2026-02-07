import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        /*
         * Engage le jeu, que je le gagne
         * Bob
         * 02/02/2020
         * Elu par cette crapule
         */

        while(replay){
            System.out.print("Type a word or a sentence : ");
            try{
                String input  = scanner.nextLine();
                String word = input.toLowerCase().trim().replaceAll("[\\/\\s,]" , "");
                StringBuilder stringB = new StringBuilder(word).reverse();
                if(word.contentEquals(stringB)){
                    System.out.printf("PALINDROME ! %s == %s %n", word, stringB);
                }
                else{
                    System.out.printf("NOT A PALINDROME ! %s != %s %n", word, stringB);
                }

                System.out.print("One player shout again ? y-n ");
                replay = scanner.nextLine().equalsIgnoreCase("y");
            }
            catch(InputMismatchException e){
                System.out.println("Bad input, please type a word");
                scanner.next();
            }

        }
        scanner.close();
    }
}
