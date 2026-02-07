/**
 * Exercises:
 * ---------------------------------------------------------------------
 * 1. Create a variable of type 'char' called myLetter and assign it any letter.
 * 2. Create a variable of type 'float' called myFloat and assign it any decimal value.
 * 3. Create a variable of type 'long' called myBigNumber and assign it a large number.
 * 4. Create a variable of type 'byte' called mySmallNumber and assign it a small number.
 * 5. Create a variable of type 'short' called myShortNumber and assign it a number.
 *
 * Bonus:
 * 6. Change the value of an existing variable (for example, myNumber) and print it again.
 * 7. Create two int variables, add them together, and print the result.
 * 8. Create a String variable for your name and print a greeting message using it.
 */

public class VariablesE
{
    public static void main(String[] args)
    {
        // Variable declaration and initialization (already done for you)
        int myNumber = 10;
        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;

        // Print variables to the console
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);

        // -------------------- Student Exercises --------------------
        // 1. Create a char variable called myLetter and assign it any letter
        char myLetter = 'J';
        System.out.println("1. Char: " + myLetter);
        // 2. Create a float variable called myFloat and assign it any decimal
        float myFloat = 56.89f;
        System.out.println("2. Float: " + myFloat);

        // 3. Create a long variable called myBigNumber and assign it a large number
        long myBigNumber = 1000000000;
        System.out.println("3. Long: " + myBigNumber);
        // 4. Create a byte variable called mySmallNumber and assign it a small number
        byte mySmallNumber = 3;
        System.out.println("4. Byte: " + mySmallNumber);
        // 5. Create a short variable called myShortNumber and assign it a number
       short myShortNumber =  32767;
        System.out.println("5. Short: " + myShortNumber);
        // 6. Change the value of myNumber and print the new value
        myNumber = 500;
        System.out.println("6. myNumber: " + myNumber);
        // 7. Create two int variables, add them, and print the result
        int a = 567;
        int b = 10;
        System.out.printf("7. %d + %d = %d: %n", a, b, a + b);

        // 8. Create a String variable for your name and print a greeting message
        String myName = "Julie";
        System.out.println("8. Welcome " +  myName);




    }
}
