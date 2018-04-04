import java.util.Scanner;

public class RollDriver
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int userCommand = 0, exitNum = 1, userSides = 0, dieCount = 0, userResponse = 0;
        Dice[] dieSet = new Dice[7];
        String dieName = null;
        boolean isEmpty = true;

        while (userCommand == 0 && exitNum == 1)
        {
            System.out.println("Hello, welcome to Dice Roller v0.1. What would you like to do?");
            System.out.println("1: Create a new die");
            System.out.println("2: Roll an existing dice");
            System.out.println("3: Author Info");
            System.out.println("4: Exit");
            System.out.println("5: Debug");
            System.out.print("Command: ");
            userCommand = kb.nextInt();
        }

        while (userCommand == 1)
        {
            if (dieCount < 7)
            {
                System.out.print("How many sides do you want your die to be?: ");
                userSides = kb.nextInt();
                dieSet[dieCount] = new Dice(userSides);
                dieCount++;
                isEmpty = false;

                System.out.println("Want to make another die?");
                System.out.println("1: Yes");
                System.out.println("Literally anything else: No");
                System.out.print("Enter command: ");
                userResponse = kb.nextInt();

                if (userResponse != 1)
                {
                    userCommand = 0;
                }

            } else
            {
                System.out.println("Hey, looks like you've hit the die cap. I'm real sorry, but I haven't implemented");
                System.out.println("the ability to have multiple sets or change sets. Look for that in future versions.");
                userCommand = 0;
            }
        }
        while (userCommand == 2)
        {
            if (isEmpty == true)
            {
                System.out.println("Hey there, looks like you don't have any dice. Wanna make one?");
                System.out.println("1: Yes");
                System.out.println("Literally any other number: No");
                System.out.print("Enter command: ");
                userResponse = kb.nextInt();

            }
            if (userResponse != 1)
            {
                userCommand = 0;
            }

            else
            {
                userCommand = 1;
            }



        }
    }
}