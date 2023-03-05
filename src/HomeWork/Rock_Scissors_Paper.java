package HomeWork;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rock_Scissors_Paper
{
    public static void main(String[] args)
    {
        int x = 1;
        int User_Win_Count = 0, Random_Win_Count = 0, Draw_Count = 0;
        System.out.println(" ---- WELCOM to ROCK, SCISSORS or PAPER GAME ----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please select one of the inputs: ROCK, SCISSORS or PAPER:");
        while (x != 11)
        {
            System.out.println("Game "+x+":");
            System.out.println("----------");
            System.out.print("User pick: ");
            String USER_INPUT = scanner.nextLine();
            String RANDOM = Random_pick();
            System.out.println("PC pick: "+RANDOM);
            if((RANDOM.equalsIgnoreCase("Rock") && USER_INPUT.equalsIgnoreCase("Rock")) || (RANDOM.equalsIgnoreCase("Paper") && USER_INPUT.equalsIgnoreCase("Paper")) || (RANDOM.equalsIgnoreCase("Scissors") && USER_INPUT.equalsIgnoreCase("Scissors")))
            {
                x++;
                Draw_Count++;
                System.out.println("DRAW");
            }
            else if(RANDOM.equalsIgnoreCase("Scissors") && USER_INPUT.equalsIgnoreCase("Rock"))
            {
                x++;
                User_Win_Count++;
                System.out.println("YOU WON");
            }
            else if(RANDOM.equalsIgnoreCase("Paper") && USER_INPUT.equalsIgnoreCase("Scissors"))
            {
                x++;
                User_Win_Count++;
                System.out.println("YOU WON");
            }
            else if(RANDOM.equalsIgnoreCase("Rock") && USER_INPUT.equalsIgnoreCase("Paper"))
            {
                x++;
                User_Win_Count++;
                System.out.println("YOU WON");
            }
            else if ((!USER_INPUT.equalsIgnoreCase("Paper")) && (!USER_INPUT.equalsIgnoreCase("Rock")) && (!USER_INPUT.equalsIgnoreCase("Scissors")))
                System.out.println("Wrong input entered!!!");
            else
            {
                x++;
                Random_Win_Count++;
                System.out.println("YOU lose");
            }
            System.out.println();
        }
        System.out.println("Summary:");
        System.out.println("User Wins: "+User_Win_Count);
        System.out.println("User losses: "+Random_Win_Count);
        System.out.println("User draw: "+Draw_Count);
    }


    public static String Random_pick()
    {
        Random rand = new Random();
        String RANDOM = "";
        int pick = rand.nextInt(3)+1;
        if(pick == 1)
            RANDOM = "Rock";
        else if(pick == 2)
            RANDOM = "Scissors";
        else // (pick == 3)
            RANDOM = "Paper";
        return RANDOM;
    }
}

