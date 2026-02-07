import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiplicationTableGenerator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        while(replay){
            System.out.print("Type an integer : ");

            try{
                int nb = scanner.nextInt();
                /* Print its multiplication table (1–10) using a for loop. */
                for (int i = 1; i<=10; i++){
                    System.out.printf("%d * %d = %d %n",nb,i, nb*i);
                }
            }
            catch(InputMismatchException e){
                System.out.println("Bad input, please type an integer");
                scanner.next();
            }
            System.out.print("Do you want to play again ? y-n");
            String isReplay = scanner.next();
            replay = isReplay.equalsIgnoreCase("y");
        }
        scanner.close();
    }
}
