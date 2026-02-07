import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame<e> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        int nbLuck = 10;
        while(play) {
            byte hiddenNb = getHiddenNumber();
            while (nbLuck > 0) {
                System.out.println("Guess the number(1 - 100): ");
                try {
                    byte guessNb = scanner.nextByte();
                    if (guessNb == hiddenNb) {
                        System.out.println(guessNb + ": WIN! Do you want to replay? Type 'Y' or 'N'");
                        try{
                            String replay = scanner.next();
                            play = replay.equalsIgnoreCase("y");
                            nbLuck = 10;
                            break;
                            }
                        catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    } else if (guessNb < hiddenNb) {
                        System.out.println(guessNb + ": too small");
                        nbLuck--;
                        System.out.println("You have still " + nbLuck + " lifes");
                    } else {
                        System.out.println(guessNb + ": too large");
                        nbLuck--;
                        System.out.println("You have still " + nbLuck + " lifes");
                    }
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
                if(nbLuck == 0){
                    System.out.println("NO MORE LIFE. The Hidden number was : " + hiddenNb);
                    break;
                }
            }

        }


        scanner.close();
    }

    private static byte getHiddenNumber(){
        return (byte) Math.floor((Math.random() * 100) + 1);
    }
}
