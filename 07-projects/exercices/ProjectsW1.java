import java.util.Scanner;

public class ProjectsW1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter whatever you want - Enter 'EXIT' to stop.");

        while (scanner.hasNext())
        {
            if (scanner.hasNextInt())
                {
                    int input = scanner.nextInt();
                    System.out.println("You entered an integer: " + input);
                }
                else if(scanner.hasNextDouble())
                {
                    double input = scanner.nextDouble();
                    System.out.println("You entered a double: " + input);

                }
                else if(scanner.hasNextBoolean()){
                    boolean input = scanner.nextBoolean();
                    System.out.println("You entered a boolean: " + input);
                }
                else{
                String input = scanner.next();
                System.out.println("You entered a sentence: " + input);
                if (input.equals("EXIT")) {
                    break;
                }
            }
        }
        scanner.close();
    }


}
