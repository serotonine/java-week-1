/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE
{
    public static void main(String[] args)
    {
        /*int number = 10;

        if (number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
*/
        /* 4. Create a double variable temperature.
            *    - If temperature > 30, print "Hot".
            *    - Else if temperature >= 20, print "Warm".
            *     - Else if temperature >= 10, print "Belgium".
            *     - Else, print "Cold".
            *
            * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
            */
        int[] numbers = {-5, 4, -55, 24, 36, 14, 11, 0};

        System.out.println("4. Create a double variable temperature.");
        for(int temp:numbers){
            if(temp > 30){
                System.out.println(temp + "°"+ " Hot Summertime");
            }
            else if(temp >= 20){
                System.out.println(temp + "°"+ " Warm Spring");
            }
            else if(temp >= 10){
                System.out.println(temp + "°"+ " Welcome to Belgium!");
            }
            else if(temp > 0){
                System.out.println(temp + "°"+ " Wintertime");
            }
            else{
                System.out.println(temp + "°"+ " Cold Brrrrr !!!");
            }
        }
        System.out.println("5. Check if n is positive AND even using logical operators.");
        for(int nb:numbers){
            boolean evenIsPositive = (nb >= 0) && (nb % 2 == 0) ;
            System.out.println(nb + " is positive and even "+ evenIsPositive);

        }


    }
}
