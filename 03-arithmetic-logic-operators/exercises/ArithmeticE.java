/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
        byte x= 15;
        byte y = 7;
        double divide = (double) x / y;
        System.out.println("1. Create two int variables x and y, then perform all arithmetic operations.");
        System.out.printf("add = %d %n", x + y);
        System.out.printf("substract = %d %n", x - y);
        System.out.printf("divide = %f %n", divide);
        System.out.printf("multiply = %d %n", x * y);

        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
        System.out.println("2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).");
        System.out.printf("(double) divide = %f %n", divide);

        // 3. Use double variables for division and compare with int division.
        System.out.println("3. Use double variables for division and compare with int division.");
        System.out.printf("(double 3 decimals) divide = %.3f %n", divide);
        System.out.printf("(int) divide = %d %n", x / y);

        // 4. Create three int variables, add them, and print the total.
        System.out.println("4. Create three int variables, add them, and print the total.");
        byte _a=3;
        byte _b=5;
        byte _c=10;
        System.out.printf("%d + %d + %d = %d %n", _a,_b,_c, _a + _b + _c);

        // 5. Calculate the square of a number (e.g., 6 * 6).
        System.out.println("5. Calculate the square of a number (e.g., 6 * 6).");
        int nb = 6;
        System.out.printf("Square of %d = %d %n", nb, nb * nb);

        // 6. Calculate the average of three numbers.
        System.out.println("6. Calculate the average of three numbers.");
        double average = (_a + _b + _c ) / 3;
        System.out.printf("Average of %d, %d, %d = %.2f %n", _a,_b,_c, average);

        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        // Dividing by zero throws an ArithmeticException. //
        System.out.println("7. Try dividing a number by 0 (both int and double) and observe the behavior.");
        System.out.println("Dividing Integer by zero throws an ArithmeticException.");
        System.out.println("Dividing Double by zero return infinity.");
        System.out.printf("Divide  %f by 0 = %.2f %n", (double) _c, (double) _c / 0); // => infinity
        // System.out.printf("Divide  %d by 0 = %.2f %n", _c, _c / 0); // => Raise an arithmetic error.
    }
}
