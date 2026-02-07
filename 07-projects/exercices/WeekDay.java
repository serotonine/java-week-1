import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int weekDay = getWeekDay();
       while(true){
           System.out.print("What current Day Week ? ");
           try{
               int response = scanner.nextInt();
               String message = response == weekDay ? response + " WIN": response + " LOOSE ! the current week day is " + weekDay;
               System.out.println(message);
               break;
           }
           catch(InputMismatchException e ){
               System.out.println("Invalid input. Please choose a number in between 1 and 7");
              scanner.next();
           }
       }
       scanner.close();

    }
    private static int getWeekDay(){
        return LocalDate.now().getDayOfWeek().getValue();
    }
}
