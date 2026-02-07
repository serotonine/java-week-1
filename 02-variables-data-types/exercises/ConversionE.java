/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE {
    public static void main(String[] args)
    {
        String context = "juju";

        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)
        if(context != "juju") {

            System.out.println("=== Implicit (Widening) Conversions ===");
            System.out.println("int (" + intValue + ") → double: " + widenedDouble);
            System.out.println("char ('" + letter + "') → int: " + widenedInt);

            // --- Explicit Conversions (Narrowing) ---
            double doubleValue = 9.78;
            int narrowedInt = (int) doubleValue; // double to int (fraction lost)
            float floatValue = 130.75f;
            byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

            System.out.println("\n=== Explicit (Narrowing) Conversions ===");
            System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
            System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);
        }
        else {

            // -------------------- Student Exercises --------------------
            // 1. Create a short variable with any value and assign it to an int (implicit)
            short myShort = 243;
            int myInt = myShort;
            System.out.println("=== 1. Create a short variable with any value and assign it to an int (implicit) ===");
            System.out.println("Implicit integer " + myInt);

            // 2. Create an int variable with a large value and assign it to a long (implicit)
            int myLongInt = 2147483645;
            long myLong = myLongInt;
            System.out.println("=== 2. Create an int variable with a large value and assign it to a long (implicit) ===");
            System.out.println("Implicit long " + myLong);

            // 3. Create a long variable and assign it to a float (implicit)
            float myFloat = myLong;
            System.out.println("=== 3. Create a long variable and assign it to a float (implicit) ===");
            System.out.println("Implicit float " + myFloat);

            // 4. Create a double variable and cast it to a float (explicit)
            double myDouble = 45.50;
            float castMyDouble = (float) myDouble;
            System.out.println("=== 4. Create a double variable and cast it to a float (explicit) ===");
            System.out.println("Explicit double cast to float " + castMyDouble);

            // 5. Create an int variable and cast it to a short (explicit)
            short castMyInt = (short) myLongInt;
            System.out.println("=== 5. Create an int variable and cast it to a short (explicit) ===");
            System.out.println("Explicit int cast to short " + castMyInt);

            // 6. Create a long variable and cast it to a byte (explicit)
            System.out.println("=== 6. Create a long variable and cast it to a byte (explicit) ===");
            long l = 214748380;
            byte b = (byte) l;
            System.out.println("Explicit long cast to byte " + b);

            // 7. Try converting a large int (e.g., 1000) to a byte and print the result
            System.out.println("=== 7. Try converting a large int (e.g., 1000) to a byte and print the result ===");
            byte b2 = (byte) myLongInt;
            System.out.println("Explicit int cast to byte " + b2);

            // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
            System.out.println("=== 8. Convert a char (e.g., 'Z') into an int and print its ASCII value ===");
            char z = 'Z';
            int castCharToInt = z;
            System.out.println("Implicit char " + z + " cast to int " + castCharToInt);

            // 9. Convert an int into a char and print the resulting character
            System.out.println("=== 9. Convert an int into a char and print the resulting character ===");
            int intToChar = 90;
            char castIntToChar = (char) intToChar;
            System.out.println("Explicit int " + intToChar + " cast to char " + castIntToChar);

            // 10. Create a double with decimals, convert it to int, and print the result
            System.out.println("=== 10. Create a double with decimals, convert it to int, and print the result ===");
            double dd = 15.75;
            int castDoubleToInt = (int) dd;
            System.out.println("Explicit double " + dd + " cast to int " + castDoubleToInt);
        }
    }
}
