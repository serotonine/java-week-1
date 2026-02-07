/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable month (1-12).
 *    - Use a switch statement to print the corresponding month name.
 *
 * 2. Create a char variable grade ('A', 'B', 'C', 'D', 'F').
 *    - Use a switch statement to print the description:
 *
 *      default -> "Invalid grade"
 *
 * 3. Create an int variable trafficLight (1, 2, 3).
 *    - Use a switch to print:
 *      1 -> "Red"
 *      2 -> "Yellow"
 *      3 -> "Green"
 *      default -> "Invalid light"
 *
 * 4. Create an int variable menuOption (1-5).
 *    - Use switch to print which action was chosen (e.g., "Option 1 selected").
 *
 * Bonus:
 * 5. Combine multiple cases to handle weekends:
 *    - day = 6 or 7 -> print "Weekend"
 *    - day = 1-5 -> print "Weekday"
 * -------------------------------------------------------------
 */

public class Switch
{
    public static void main(String[] args)
    {


       /*
       int day = 3;
        String dayName;
        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
        */

        // -------------------- Student Exercises --------------------
        // 1. Create int month (1-12) and print month name using switch.

        // 2. Create char grade and print description using switch.
        char[] grades = {'A', 'B', 'C', 'D', 'F', 'W'};
        for(int grade : grades){
            switch(grade){
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Good");
                    break;
                case 'C':
                    System.out.println("Average");
                    break;
                case 'D':
                    System.out.println("Below Average");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Bellow than Zero");
            }
        }

        // 3. Create int trafficLight (1-3) and print light color using switch.
        int[] trafficLights = { 1,2,3,2,1,2,3,2,1,2,3,2,};
        for(int light : trafficLights){
            switch(light){
                case 1:
                    System.out.println("RED");
                    break;
                case 2:
                    System.out.println("YELLOW");
                    break;
                case 3:
                    System.out.println("GREEN");
                    break;
                    default:
                        System.out.println("Invalid light");
            }
        }

        // 4. Create int menuOption (1-5) and print which option is selected.

        // 5. Combine cases for weekends (6 and 7) vs weekdays (1-5).
    }
}
