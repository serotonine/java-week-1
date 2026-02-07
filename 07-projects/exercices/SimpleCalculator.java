import java.util.NoSuchElementException;
import java.util.Scanner;

public class SimpleCalculator {

    public static <e> void main(String[] args){
        /*
        Simple Calculator
        Concepts used: Variables, operators, input/output.

                Ask the user to enter two numbers.
        Ask for an operation (+, -, *, /).
        Use an if-else or switch to perform the correct calculation.
                Print the result.
        */
        Scanner scanner = new Scanner(System.in);
        double result =0.00;
        while(true){
            System.out.print("Enter 2 numbers (E.g 56.00 78.89) OR S if you want to stop: ");
            if(scanner.hasNextLine()){
                String input = scanner.nextLine();
                if(input.equals("S")){
                    System.out.println("GOODBYE");
                    break;
                }
                double x;
                double y;

                String[] numbers = input.trim().split("\\s+");
                if(numbers.length != 2){
                    System.out.println("You must Enter 2 numbers.");
                    continue;
                }
                try{
                    System.out.println(numbers[0]);
                    x = Double.parseDouble(numbers[0]);
                    y = Double.parseDouble(numbers[1]);
                }
                catch(NumberFormatException e){
                    System.out.println("You must Enter 2 numerics.");
                    continue;
                }

                System.out.print("Enter operation + | - | * | /: ");
                if(scanner.hasNextLine()){
                    try{
                        char operator = scanner.nextLine().trim().charAt(0);

                        switch (operator){
                            case '+':
                                System.out.printf("%.2f + %.2f = %.2f %n", x,y, x + y);
                                break;
                            case '-':
                                System.out.printf("%.2f - %.2f = %.2f %n", x,y, x - y);
                                break;
                            case '*':
                                System.out.printf("%.2f * %.2f = %.2f %n", x,y, x * y);
                                break;
                            case '/':
                                System.out.printf("%.2f / %.2f = %.2f %n", x,y, x / y);
                                break;
                            default:
                                throw new NoSuchElementException( operator + "is not a valid arithmetic operator");
                        }
                    }
                    catch(NoSuchElementException e){
                        System.out.println("Error : " + e.getMessage());
                    }

                }
            }
            else{
                System.out.println("You must Enter 2 numbers.");
            }

        }
        scanner.close();
    }
}
