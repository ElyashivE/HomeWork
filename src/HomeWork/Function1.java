package HomeWork;

import java.sql.SQLOutput;
import java.util.Random;

public class Function1
{
    //test1
    static void line()
    {
        for (int i = 0; i < 28; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
//----------------------------------------------------------------------------------------------

    //test2
    static void compare(String F_Name, String L_Name, String disc)
    {
        if (F_Name.equals(L_Name))
            System.out.println("the names are the same" + disc);
        else
            System.out.println("the names are not the same" + disc);
    }
//----------------------------------------------------------------------------------------------
    //test3
    static void M_N(String MY_NAME)
    {
        int count=0;
        System.out.println("the num of string with space:"+MY_NAME.length() );
        for (int i = 0; i < MY_NAME.length() ; i++)
        {
            char x = MY_NAME.charAt(i);
            if(x == ' ')
                count++;
        }
        System.out.println("the num of string with space:"+(MY_NAME.length()-count) );
    }


//----------------------------------------------------------------------------------------------
    //test4
    static int array(int arr1, int arr2, int arr3)
    {
        int arr[] = {arr1,arr2,arr3};
        int big = bigger(arr);
        return big;
    }
//--------------------------------------------------------
    static int bigger(int [] arr)
    {
        int max = -2000000;
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
//-------------------------------------------------------
    static void send(int num)
    {
        print(num);
    }
//--------------------------------------------------------
    static void print( int num)
    {
        System.out.println("your num (big == max) is: "+num);
    }
//------------------------------------------------------------
    //test2-1
    static int WORD1(String MY_WORD)
    {
        int count=0;
        for (int i = 0; i < MY_WORD.length(); i++)
        {
            char x = MY_WORD.charAt(i);
            if (i == 0 && x == ' ')
                continue;
            else if(i == MY_WORD.length()-1  && x == ' ')
                continue;
            else if(x == ' ')
                count++;
        }
        return count+1;
    }
//-------------------------------------------------------------------

//    If the ASCII value lies in the range of [65, 90], then it is an uppercase letter.
//    If the ASCII value lies in the range of [97, 122], then it is a lowercase letter.
//    If the ASCII value lies in the range of [48, 57], then it is a number.
//    If the ASCII value lies in the ranges [32, 47], [58, 64], [91, 96] or [123, 126], then it is a special character

    //test2-2
    static void WORD2(String NEW_WORD)
    {
        int count=0;
        for (int i = 0; i < NEW_WORD.length(); i++)
        {
            char CHECK_LOW_CASE = NEW_WORD.charAt(i);
            if(CHECK_LOW_CASE >= 65 && CHECK_LOW_CASE <= 90)
                System.out.print(CHECK_LOW_CASE);
            else if(CHECK_LOW_CASE >= 97 && CHECK_LOW_CASE <= 122)
            {
                System.out.print(Character.toUpperCase(CHECK_LOW_CASE));
                count++;
            }
            else if(CHECK_LOW_CASE == ' ')
                System.out.print(" ");

        }
        System.out.println("\nhe value of Low CASE Letters is: "+ count);
        if(count==0)
            System.out.print("no LowerCase letters");
    }
//---------------------------------------------------------
    //test2-3
    static void COIN_SIDE_TEST(int COIN_SIDE)
    {
        if(COIN_SIDE == 1)
            System.out.println("<<< It's TAIL >>>");
        if (COIN_SIDE == 2)
                System.out.println("<<< It's HEAD >>>");
    }
//---------------------------------------------------------------

    //test2-4
    static int LETTER_TEST(int LETTER1)
    {
        if(LETTER1>90 && LETTER1<97)
        {
 //           System.out.print("<< info: FORBIDDEN RANGE 91-96: " + (char)LETTER1 + " == " + LETTER1 +" >>\n" );
            LETTER1 = LETTER1 + 7;
        }
        return LETTER1;
    }

    //test2-5
    static int LETTER_COMPARE(int LET1, int LET2)
    {
        if(LET1 == LET2)
            return 1;
        else
            return  0;
    }


}
