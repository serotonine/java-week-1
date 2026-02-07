/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age
        int age = 59;
        // 2. Create a double variable called temperature and assign it any decimal
        double temperature = 24.50;
        // 3. Create a char variable called gradeLetter and assign it a letter
        char gradeLetter = 'A';
        // 4. Create a boolean variable called isJavaFun and assign true or false
        boolean isJavaFun = true;
        // 5. Create a String variable called favoriteColor and assign it a color
        String favoriteColor = "Turquoise";

        // 6. Create an int array called numbers with at least 5 values, then print them
        int[] numbers = {4,89,78,24,30};

        // 7. Change one value inside numbers and print the updated array

        // 8. Create a String array with 3 favorite foods and print them in a loop
        String[] favoriteFood = {"Egplant","Chocolate", "Mango"};

        // 9. Create two double variables, add them together, and print the result
        double a = 50.50;
        double b = 61.50;

        // 10. Use String concatenation to print: "My name is ___ and I am ___ years old."
        System.out.println("\n=== Primitive Data Types Exercices ===");
        System.out.println("Integer: " + age);
        System.out.println("Double: " + temperature);
        System.out.println("Character: " + gradeLetter);
        System.out.println("Boolean: " + isJavaFun);

        System.out.println("\n=== Non-Primitive Data Types Exercices ===");
        System.out.println("String: " + favoriteColor);
        System.out.print("Array of numbers: ");
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.print("\nArray of updated numbers: ");
        numbers[1] = 100;
        numbers[2] = 200;

        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.print("\nArray of my Favourites food: ");
        for (String food : favoriteFood)
        {
            System.out.print(food + " ");
        }
        System.out.printf("%nDouble's addition: %.2f + %.2f = %.2f %n", a,b, a+b);

    }
}
