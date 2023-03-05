package HomeWork;

import java.util.Scanner;
public class FINAL_JAVA_TEST_FUNC
{
    static int AGE_CHECK()
    {
        int age = 0;
        char space = ' ';
        Scanner INPUT = new Scanner(System.in);
        System.out.println("1) AGE DECLARATION AND BENEFITS:");
        do {
            try
            {
                System.out.print("1.1) Enter your age: ");
                age = INPUT.nextInt();

                if (age >= 15 && age <= 18)
                {
                    System.out.println("     YOU HAVE BEEN GRANTED DISCOUNT of 5 SHEKELS");
                    break;
                }
                else if ((age >= 5 && age < 15) || (age > 18 && age <= 100))
                    break;
                else if (age < 5 || age > 100)
                    System.out.println("     ERROR!!! invalid age please enter age between 5 - 100");
            }
            catch (Exception e)
            {
//                System.out.println("     ERROR!!! invalid input please enter numbers");
                INPUT.next();                                                                                           // Clear scanner buffer of wrong input if not stuck in constant loop
            }
        }
        while (age != 5901531);
        return age;
    }


    static int ADDONS()
    {
        int SUM = 0;
        Scanner INPUT = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("2) ADDONS SELECTION:");
        System.out.println("-----------------------------");
        do
        {
            try
            {
                System.out.print("2.1) Would you want ADDONS to the TOAST? Press YES or NO: ");
                String ANSWER = INPUT.nextLine();
                if (ANSWER.equalsIgnoreCase("NO"))
                {
                    try {
                        System.out.print("2.1.1) may you reconsider your selection? Press YES or NO: ");
                        ANSWER = INPUT.nextLine();
                        if (ANSWER.equalsIgnoreCase("NO")) {
                            SUM = 0;
                            break;
                        } else if (ANSWER.equalsIgnoreCase("YES"))
                            System.out.println("       NICE!!! GOOD CHOICE");
                    } catch (Exception e) {
                        System.out.println("      ERROR!!! invalid input");
                        INPUT.next();
                    }
                }
                if(ANSWER.equalsIgnoreCase("YES"))
                {
                    do
                    {
                        try
                        {
                            System.out.print("2.2) How many Addons do you want? (3 SHEKELS per ADDON up to 6 ADDONS) ");
                            SUM = INPUT.nextInt();
                            if(SUM>=0 && SUM<=6)
                                return SUM*3;
                        }
                        catch (Exception e)
                        {
                            System.out.println("    ERROR!!! invalid input");
                            INPUT.next();
                        }
                    }
                    while (SUM!=5901531);
                }
            }
            catch (Exception e) {
                System.out.println("    ERROR!!! invalid input");
                INPUT.next();
            }
        }
        while(SUM!=5901531);
        return SUM;
    }




        static int DRINKING()
        {
            int DRINK = 0;                                                                                             // just for first use
            Scanner INPUT = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println("3) DRINK SELECTION:");
            System.out.println("-----------------------------");
            do
            {
                try
                {
                    System.out.print("3.1) Please select your drink - COLA or ORANGE: ");
                    String ANSWER = INPUT.nextLine();
                    if (ANSWER.equalsIgnoreCase("COLA"))
                    {
                        DRINK = 8;
                        break;
                    }
                    else if (ANSWER.equalsIgnoreCase("ORANGE"))
                    {
                        DRINK = 8;
                        break;
                    }
                    else
                       System.out.println("    Sorry we don't have Please - select COLA or ORANGE");
                }
                catch (Exception e)
                {
                    System.out.println("    ERROR!!! invalid input please Select COLA or ORANGE");
                    INPUT.next();                                                                                           // Clear scanner buffer of wrong input
                }
           }
            while (DRINK!=5901531);
            return DRINK;
     }
}



