package HomeWork;

public class Final_JAVA_TEST
{
    public static void main(String[] args)
    {
/*
        //test 1
        for (int i = 1; i <= 200; i++)
        {

            if(i % 7 == 0)
                System.out.print(" BOOM |");
            else if((i>=70 && i<=79) || (i>=170 && i<=179))
                System.out.print(" BOOM |");
            else if(i % 10 == 7)
                System.out.print(" BOOM |");
            else
                System.out.print(i+ " | ");
            if(i % 20 == 0)
                System.out.println();
        }
*/

        //test2
        //Hot TOAST
        System.out.println("\n------WELCOME to HOT TOAST------\n");
        int BASE_TOST =15;
        int AGE = FINAL_JAVA_TEST_FUNC.AGE_CHECK();
        int ADDONS = FINAL_JAVA_TEST_FUNC.ADDONS();
        int DRINK = FINAL_JAVA_TEST_FUNC.DRINKING();
        System.out.println("-----------------------------");
        System.out.println("4) THE BILL:");
        System.out.println("-----------------------------");
        if(AGE >= 15 && AGE <= 18)
        {
            System.out.println("TOAST = "+BASE_TOST);
            System.out.println("ADDONS = "+ADDONS);
            System.out.println("DRINK = "+DRINK);
            System.out.println("DISCOUNT = -5");
            System.out.println("SUM = "+(BASE_TOST+ADDONS+DRINK-5)+" SHEKELS");
            System.out.println("BON A PETIT");
        }
        else
        {
            System.out.println("TOAST = "+BASE_TOST);
            System.out.println("ADDONS = "+ADDONS);
            System.out.println("DRINK = "+DRINK);
            System.out.println("SUM = "+(BASE_TOST+ADDONS+DRINK)+" SHEKELS");
            System.out.println("BON A PETIT");
        }
        System.out.println("\n<------PROGRAM ENDED------>");
    }
}