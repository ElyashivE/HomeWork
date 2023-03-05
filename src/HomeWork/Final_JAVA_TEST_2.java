package HomeWork;

public class Final_JAVA_TEST_2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String PURPLE_UNDERLINED = "\033[4;35m";
    public static final String PURPLE_BOLD = "\033[1;35m";

    public static void main(String[] args)
    {
        //Hot TOAST 2
        System.out.println(ANSI_YELLOW+"\n------"+ANSI_GREEN+"WELCOME "+ANSI_GREEN+"to "+ANSI_RED+"HOT "+ANSI_GREEN+"TOAST"+ANSI_YELLOW+"------\n"+ANSI_RESET);
        int BASE_TOAST =15;                                                                                              //set toast price to 15 nis
        double AGE = FINAL_JAVA_TEST_FUNC_2.AGE_CHECK();                                                                   //call for age.check function and return value to age
        int ADDONS = FINAL_JAVA_TEST_FUNC_2.ADDONS();                                                                   //call for addons function and return value to addons
        int DRINK = FINAL_JAVA_TEST_FUNC_2.DRINKING();                                                                  //call for drinking function and return value to drink
        System.out.println("-----------------------------");
        System.out.println(PURPLE_BOLD+PURPLE_UNDERLINED+"4) THE BILL:"+ANSI_RESET);
        System.out.println();
        if(AGE >= 15 && AGE <= 18)                                                                                      //bill with discount if age in range
        {
            System.out.println("TOAST = "+BASE_TOAST+" NIS");
            System.out.println("ADDONS = "+ADDONS+" NIS");
            System.out.println("DRINK = "+DRINK+" NIS");
            System.out.println("DISCOUNT = -5 NIS");
            System.out.println("SUM = "+(BASE_TOAST+ADDONS+DRINK-5)+" NIS");
            System.out.println(ANSI_YELLOW+"BON A PETIT"+ANSI_RESET);
        }
        else                                                                                                            //normal bill w/o discount
        {
            System.out.println("TOAST = "+BASE_TOAST);
            System.out.println("ADDONS = "+ADDONS);
            System.out.println("DRINK = "+DRINK);
            System.out.println("SUM = "+(BASE_TOAST+ADDONS+DRINK)+" NIS");
            System.out.println(ANSI_YELLOW+"BON A PETIT"+ANSI_RESET);
        }
        System.out.println(ANSI_GREEN+"\n<------PROGRAM ENDED------>"+ANSI_RESET);
    }
}