/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */
import java.util.Scanner;

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
        for( byte i=10; i>0; i--) {
            System.out.println("for loop " + i);
        }

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
        byte nb = 7;
        for( byte i=1; i<=10; i++) {
            System.out.printf("%d * %d = %d %n", nb, i, nb*i);
        }

        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        byte n = 0;
        short out = 0;
        while( n <=100 ){
            n++;
            out +=n;
        }
        System.out.printf("sum of 0 to 100 = %d %n",  out );

        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        byte n2 = 1;
        while( n2 <=20){
            if(n2 % 2 != 0){
                System.out.printf("odd = %d %n",  n2 );
            }
            n2++;
        }

        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        do{
            System.out.print("Enter an integer: ");
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                System.out.println(input);
                scanner.nextLine();
            }
            else{
                System.out.println("Invalid input. Please enter a valid integer.");
                // Reset print into cache memory.
                scanner.next();
            }

        }
        while(input >= 0);
        // Don't forget to close the scanner.
        scanner.close();

        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
        String[] colors =  {"Red", "Green", "Blue", "Yellow"};
        for(String color : colors){
            System.out.printf("%s %n", color.toUpperCase());
        }

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
        byte[] numbers =  {2, 4, 6, 8, 10};
        int result = 0;
        for(int number : numbers){
            result += number;
        }
        System.out.printf("Result = %d %n", result);

        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        for(byte i=1; i<=3; i++){
            for(byte j=i; j<=3; j++){
                System.out.printf(" %d * %d = %d  %n",i,j,i*j);
            }
        }

        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
        char asterix = '*';
        String output = "";
        for(byte i=1; i<=1; i++){
            output = "" + asterix;
            for(byte j=1; j<=4; j++){
                System.out.println( output.repeat(j));
            }
        }


        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.
        for(byte i=1; i<=20; i++){
            if(i % 3 == 0){
                continue;
            }
            else if(i > 15){
                break;
            }
            else {
                System.out.println(i);
            }
        }

        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        byte increment = 1;
        while( increment <=10 ){
            if(increment % 7 == 0){
                break;
            }
            System.out.println("increment = " + increment);
            increment++;

        }
    }
}
