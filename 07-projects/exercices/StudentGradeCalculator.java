import java.util.Scanner;

public class StudentGradeCalculator {
/*
 * Ask the user for the number of subjects.
 * Read marks for each subject into an array.
 * Calculate the total and average.
 * Use if-else to assign a grade:
 * A for average ≥ 80
 * B for 60–79
 * C for 40–59
 * F for below 40
*/
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args){

    String[] [] questions = {
            {"1. Which type is not a java type ? \n A.float  \n B.bigInt  \n C.char \n D.long  \n", "B"},
            {"2. Which is not a Scanner method ? \n A.next()  \n B.hasNextLine()  \n C.nextByte() \n D.nextString()  \n", "D"},
            {"3. Is java same than javascript ? \n A.yes  \n B.no  \n","B"},
            {"4. What is true about Java JDK ? \n A.it includes the Java compiler, runtime environment (JRE), and development tools.  \n B.it runs Java bytecode.  \n C.Java JDK does not exist \n D.its latest version is '8' \n", "A"},
            {"5. Which object has the method 'println' ? \n A.Scanner  \n B.String  \n C.System \n D.Java  \n", "C"},
            {"6. What is TRUE about the 'float' type ? \n A.64-bit  \n B.f or F is mandatory  \n C.6–7 decimal digits \n D. float is a primitive character type  \n", "B"},
            {"7. Which control-structure use the syntax 'case' ? \n A.for/each  \n B.switch  \n C.for \n D.try/catch  \n","B"},
            {"8. Which control-structure does not exists in java ? \n A.if/else  \n B.while  \n C.for \n D.every  \n", "D"},
            {"9. How to declare a variable in java ? \n A.var myVar  \n B.[type] myVar  \n C.[type] 3-my-var \n D.const myVar  \n","B"},
            {"10. What is an explicit conversion in java ? \n A.int myInt = (int) myDouble;  \n B.Converting from a smaller data type to a larger one  \n C.char c='c' int i = c \n","A"},
    };

    byte goodResponses = 0;
    char grade;
    boolean replay = true;

while(replay) {
    for (String[] question : questions) {
        boolean response = ask(question);
        goodResponses += (byte) (response ? 1 : 0);
    }
    if (goodResponses < 4) {
        grade = 'F';
    } else if (goodResponses < 6) {
        grade = 'C';
    } else if (goodResponses < 8) {
        grade = 'B';

    } else {
        grade = 'A';
    }
    System.out.println(goodResponses + "/10 correct responses. Your grade is " + grade);
    goodResponses = 0;
    scanner.nextLine();
    System.out.print("One player shout again ? y-n ");
    replay = scanner.nextLine().equalsIgnoreCase("y");
}
   scanner.close();
}
private static boolean ask(String[] question){

    System.out.print(question[0]);
    String response = scanner.next();
    return response.equalsIgnoreCase(question[1]);
}
}
