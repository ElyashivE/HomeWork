package HomeWork;

import java.util.Random;
import java.util.Scanner;


public class Function
{
    public static void main(String[] args)
    {
/*
        //test1-1
        System.out.println("hello world");
        Function1.line();
        System.out.println("my name is elyashiv");
        Function1.line();

        //test1-2
        Scanner NAME = new Scanner(System.in);
        System.out.print("enter your first name: ");
        String F_Name = NAME.nextLine();
        System.out.print("enter your last name: ");
        String L_Name = NAME.nextLine();
        String disc = ("  -- compare if the names are equals");
        Function1.compare(F_Name, L_Name, disc);

        //test1-3
        Scanner NAME = new Scanner(System.in);
        System.out.print("enter some string: ");
        String MY_NAME = NAME.nextLine();
        Function1.M_N(MY_NAME);

        //test1-4
        Scanner NUM = new Scanner(System.in);
        System.out.print("enter your 1st num: ");
        int A = NUM.nextInt();
        System.out.print("enter your 2nd num: ");
        int B = NUM.nextInt();
        System.out.print("enter your 3rd num: ");
        int C = NUM.nextInt();
        int BIG = Function1.array(A, B, C);
        Function1.send(BIG);

        //test2-1
        Scanner WORD = new Scanner(System.in);
        System.out.print("enter some string: ");
        String MY_WORD = WORD.nextLine();
        int Word_Return = Function1.WORD1(MY_WORD);
        System.out.println("the sum of words is: " +Word_Return);

        //test2-2
        Scanner WORD = new Scanner(System.in);
        System.out.println("---UPPERCASE STRING TEST---");
        System.out.print("Enter your string: ");
        String NEW_WORD = WORD.nextLine();
        Function1.WORD2(NEW_WORD);
        System.out.println(WORD);

        //test2-3
        System.out.println("---HEAD OR TAIL GAME---");
        Random COIN = new Random();
        int COIN_SIDE = COIN.nextInt(2) + 1;
        Function1.COIN_SIDE_TEST(COIN_SIDE);

        //test2-4
        System.out.println("---RANDOM LETTER GENERATOR---");
        int min = 65;
        int max = 122;
        int LETTER1;
        Random LETTER = new Random();                                                // call Random object
        LETTER1 = LETTER.nextInt(min, max);                                          // enter random value to letter1 between 65 and 122
        Function1.LETTER_TEST(LETTER1);                                              // call function letter_test and send letter1 value to that function

        //test2-5
        System.out.println("<<<<<--->>>>>RANDOM LETTER GENERATOR<<<<<--->>>>");
        int min = 65;
        int max = 122;
        int LETTER1, LET1=0, LET2=0;
        System.out.println("THE RANDOM NUMBERS ARE:");
        Function1.line();
        for(int i=0 ; i < 2 ; i++)
        {
            if(i == 0)
            {
                Random LETTER = new Random();                                         // call Random object
                LETTER1 = LETTER.nextInt(min, max);                                   // enter random value to letter1 between 65 and 122
                LET1 = Function1.LETTER_TEST(LETTER1);                                // call function letter_test and send letter1 value to that function
                System.out.println("YOUR 1st RANDOM LETTER IS: " + (char)LET1);
            }
            if(i ==1)
            {
                Random LETTER = new Random();                                         // call Random object
                LETTER1 = LETTER.nextInt(min, max);                                   // enter random value to letter1 between 65 and 122
                LET2 = Function1.LETTER_TEST(LETTER1);
                System.out.println("YOUR 2nd RANDOM LETTER IS: " + (char)LET2);
            }
        }
        Function1.line();
        System.out.println("THE RESULT IS:");
        Function1.line();
        int CHECK_LET = Function1.LETTER_COMPARE(LET1, LET2);
        if (CHECK_LET == 1)
            System.out.println("LETTERS ARE - SAME");
        if(CHECK_LET == 0)
            System.out.println("LETTERS ARE - NOT THE SAME");
*/
        //test2-6
        System.out.println("<<<<<--->>>>>RANDOM LETTER GENERATOR<<<<<--->>>>");
        int min = 65;                                                            //first value of 'A'
        int max = 122;                                                           //last value of 'z'
        int LETTER1, LET1=0, LET2=0, count=0;
        System.out.print("ENTER THE NUMBER OF ROLLS: ");
        Scanner ROLL = new Scanner(System.in);
        int ROLLS =  ROLL.nextInt();                                             //number of rolls to compare both letters
        for(int j=0 ; j < ROLLS ; j++)                                           //how many rolls
        {
            for (int i = 0; i < 2; i++)                                          //loop of 2 runs to create 2 random latters
            {
                if (i == 0)                                                      //if for first letter
                {
                    Random LETTER = new Random();                                // call Random object
                    LETTER1 = LETTER.nextInt(min, max);                          // enter random value to letter1 between 65 and 122
                    LET1 = Function1.LETTER_TEST(LETTER1);                       // call function letter_test and send letter1 value to that function and return new value to let1
                }
                if (i == 1)                                                      //if for second letter
                {
                    Random LETTER = new Random();                                // call Random object
                    LETTER1 = LETTER.nextInt(min, max);                          // enter random value to letter1 between 65 and 122
                    LET2 = Function1.LETTER_TEST(LETTER1);                       // call function letter_test and send letter1 value to that function and return new value to let2
                }
            }
            int CHECK_LET = Function1.LETTER_COMPARE(LET1, LET2);                //call function letter_compare with 2 values and return new value to check_let
            if (CHECK_LET == 1)                                                  //check if both the same
                count++;
            if (CHECK_LET == 0)                                                  //check if both not the same
                continue;
        }
        Function1.line();                                                        //call function to print line of screen
        System.out.println("THE RESULT IS:");
        if(count == 1)                                                           //check if got match only 1 time for single print (no s)
            System.out.println("ITS NOT RANDOM: " + count + " MATCH FOUND");
        else if(count > 1)                                                       //check if to match more then 1 time add s to print
            System.out.println("ITS NOT RANDOM: " + count + " MATCH'S FOUND");
        else if(count == 0)
            System.out.println("ITS RANDOM");
        Function1.line();                                                        //call function to print line of screen
        System.out.println("-------PROGRAM ENDED--------");
        Function1.line();                                                        //call function to print line of screen

    }

}


