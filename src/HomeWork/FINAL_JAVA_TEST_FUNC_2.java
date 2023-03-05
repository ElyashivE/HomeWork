package HomeWork;

import java.util.Scanner;
public class FINAL_JAVA_TEST_FUNC_2
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String PURPLE_UNDERLINED = "\033[4;35m";
    public static final String PURPLE_BOLD = "\033[1;35m";

        static double AGE_CHECK()
        {
            double age = 0;
            Scanner INPUT = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println(PURPLE_BOLD+PURPLE_UNDERLINED+"1) AGE DECLARATION AND BENEFITS:"+ANSI_RESET);
            System.out.println();
            do {
                try {
                    System.out.print("ENTER YOUR AGE: ");
                    age = INPUT.nextDouble();
                    if (age >= 15 && age <= 18)                                                                         //check if the age in range to give discount
                    {
                        System.out.println(ANSI_GREEN+"YOU HAVE BEEN GRANTED DISCOUNT of 5 NIS "+ANSI_RESET);
                        break;                                                                                          //age ok go out from while loop
                    }
                    else if ((age >= 5 && age < 15) || (age > 18 && age <= 100))                                        //check if the age in range that ok but don't give discount
                        break;                                                                                          //age ok go out from while loop
                    else //if (age < 5 || age > 100)                                                                    //check if age not in range
                        System.out.println(ANSI_YELLOW+"ERROR!!! AGE NOT IN RANGE 5 - 100"+ANSI_RESET);
                }
                catch (Exception e)                                                                                     //if enter in age not numbers prevent from program to crash
                {
                System.out.println(ANSI_RED+"ERROR!!! INVALID INPUT PLEASE ENTER NUMBERS"+ANSI_RESET);
                INPUT.next();                                                                                           // Clear scanner buffer of wrong input
                }
            }
            while (age != 5901531);                                                                                     //always loop until this value will enter to age or enter proper value to age then break will make us go out from loop
            return age;                                                                                                 //return value of age to main program
        }


        static int ADDONS()
        {
            int SUM=0;
            int COUNT = 0;
            int ADDON_SUM = 0;
            String FULL_USER_ADDON;
            String [] SFUA;
            String[] ARR = {"OLIVE","CORN","MUSHROOM","ONION","TOMATO","CHEESE","NONE"};                                // create addons array ARR
            Scanner INPUT = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println(PURPLE_BOLD+PURPLE_UNDERLINED+"2) ADDONS SELECT:"+ANSI_RESET);
            System.out.println();

            OUTER_LOOP:                                                                                                 // label to exit double do while loops
            do
            {
                System.out.print("YOU WANT ADDONS to YOUR TOAST? Press YES or NO: ");
                String ANSWER = INPUT.nextLine();
                if (ANSWER.equalsIgnoreCase("NO"))                                                           // compare if user input is no
                {
                    do
                    {
                        System.out.print("MAY YOU RECONSIDER? Press YES or NO: ");
                        ANSWER = INPUT.nextLine();
                        if (ANSWER.equalsIgnoreCase("NO"))                                                   // compare if user input is no
                        {
                            SUM = 0;
                            break OUTER_LOOP;                                                                           // break from both do while loops use label
                        }
                        else if (ANSWER.equalsIgnoreCase("YES"))                                             // compare if user input is yes
                        {
                            System.out.println(ANSI_GREEN + "NICE!!! GOOD CHOICE" + ANSI_RESET);
                            break;
                        }
                        else
                            System.out.println(ANSI_RED + "ERROR!!! INVALID INPUT" + ANSI_RESET);                       // if user input is not yes or no
                    }
                    while(SUM!=5901531);
                }
                if(ANSWER.equalsIgnoreCase("YES"))                                                           // compare if user input is yes
                {
                    System.out.println("\n");
                    System.out.print("ADDONS LIST: ");
                    for(int i = 0; i < ARR.length; i++)                                                                 // loop to print the addons AAR array
                        if (i<6)
                            System.out.print(ANSI_GREEN+ARR[i]+" | "+ANSI_RESET);                                       // condition to add |
                        else
                            System.out.print(ANSI_GREEN+ARR[i]+ANSI_RESET+"\n");                                        // condition for last word the array NONE
                    System.out.println(ANSI_RED+"(!!! NOTE: SYNTAX OF THE ADDONS SHOULD BE > OLIVE,CORN and Etc'!!!)"+ANSI_RESET);
                    System.out.print("SELECT ADDONS or NONE: ");
                    do
                    {
                        FULL_USER_ADDON = INPUT.nextLine();                                                             // copy the user input to that string
                        SFUA = FULL_USER_ADDON.split(",");                                                        // split the string and create mini strings
                        for (int i = 0; i < SFUA.length; i++)                                                           // loop for user input split strings
                        {
                            for (int j = 0; j < ARR.length; j++)                                                        // loop to ARR array to compare between the previous loop
                            {
                                if((SFUA[i].trim().equalsIgnoreCase(ARR[j])) && j < 3)                                  //use trim to clear spaces in the SFUA user input and compare it to the addons in the ARR[0-2]
                                {
                                    ADDON_SUM = ADDON_SUM + 3;
                                    COUNT++;
                                    break;
                                }
                                else if((SFUA[i].trim().equalsIgnoreCase(ARR[j])) && j >= 3 && j < 6)                   //use trim to clear spaces in the SFUA user input and compare it to the addons in the ARR[3-5]
                                {
                                    ADDON_SUM = ADDON_SUM + 4;
                                    COUNT++;
                                    break;
                                }
                                else if(SFUA[i].trim().equalsIgnoreCase(ARR[6]))                                        //use trim to clear spaces in the SFUA user input and compare it to NONE
                                {
                                    ADDON_SUM = 0;
                                    COUNT++;
                                    break;
                                }
                            }
                            //if the user input not equals to none of the ARR values, trim() use to clear the spaces if entered by user
                            if(!SFUA[i].trim().equalsIgnoreCase(ARR[0]) && !SFUA[i].trim().equalsIgnoreCase(ARR[1]) && !SFUA[i].trim().equalsIgnoreCase(ARR[2]) && !SFUA[i].trim().equalsIgnoreCase(ARR[3]) && !SFUA[i].trim().equalsIgnoreCase(ARR[4]) && !SFUA[i].trim().equalsIgnoreCase(ARR[5]) && !SFUA[i].trim().equalsIgnoreCase(ARR[6]) /* || (SFUA[i].equalsIgnoreCase("")  &&  SFUA[i].equalsIgnoreCase(" "))*/)
                                System.out.print(ANSI_YELLOW+"ERROR!!! PLEASE SELECT ADDONS or NONE: "+ANSI_RESET);
                        }
                    }
                    while (SFUA.length != COUNT);
                    return ADDON_SUM;
                }
                else
                    System.out.println(ANSI_YELLOW+"ERROR!!! PLEASE ENTER YES or NO"+ANSI_RESET);
            }
            while(SUM!=5901531);
            return SUM;
        }




        static int DRINKING()
        {
            int DRINK = 8;                                                                                              // price for drink cola or orange
            Scanner INPUT = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println(PURPLE_BOLD+PURPLE_UNDERLINED+"3) DRINK SELECTION:"+ANSI_RESET);
            System.out.println();
            do
            {
                System.out.print("DRINKS LIST: ");
                System.out.println(ANSI_RED+"COLA "+ANSI_RESET+"| "+ANSI_YELLOW+"ORANGE "+ANSI_RESET+"| NONE"+ANSI_RESET);
                System.out.print("SELECT YOUR DRINK or NONE: ");
                String ANSWER = INPUT.nextLine();
                if (ANSWER.trim().equalsIgnoreCase("COLA"))                                                  // compare user input to cola and trim use to ignore spaces
                {
                    System.out.println(ANSI_GREEN+"IT COST 8 NIS"+ANSI_RESET);
                    break;                                                                                              // sent 8 NIS to main
                }
                else if (ANSWER.trim().equalsIgnoreCase("ORANGE"))                                           // compare user input to orange and trim use to ignore spaces
                {
                    System.out.println(ANSI_GREEN+"IT COST 8 NIS"+ANSI_RESET);
                    break;                                                                                              // sent 8 NIS to main
                }
                else if (ANSWER.trim().equalsIgnoreCase("NONE"))                                             // compare user input to none and trim use to ignore spaces
                {
                    DRINK = 0;                                                                                          // if none selected send 0 NIS to main
                    System.out.println(ANSI_GREEN+"OK !!! NO DRINKS"+ANSI_RESET);
                    break;
                }
                else
                    System.out.println(ANSI_YELLOW+"SORRY WE DON'T HAVE - PLEASE SELECT COLA | ORANGE or NONE"+ANSI_RESET);
            }
            while (DRINK!=5901531);
            return DRINK;                                                                                               // back to main 8 or 0
        }
}




