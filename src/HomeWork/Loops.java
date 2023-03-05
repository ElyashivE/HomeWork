package HomeWork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Loops
{
    public static void main(String[] args)
    {
        // test 1
/*        for (int i = 1; i <=10 ; i++)
        {
            if(i == 4)
                continue;
            System.out.print(i + " ");
        }

        // test 2
        System.out.println("the nums devided by 3 and 7 are: ");
        for (int x = 1; x <= 100 ; x++)
        {
            if (x%3==0 && x%7==0)
            {
                System.out.print(x + " | ");
            }
        }

        //test 3
        int SUM=0;
        for (int z = 1; z <=20 ; z++)
        {
            SUM = SUM + z;
        }
        System.out.println("the sum of the nums from 1-20 is: "+ SUM);

        //test 4
        int SUM=0;
        Scanner NUM = new Scanner(System.in);
        for (int c = 1; c <= 5 ; c++)
        {
            System.out.print("enter " +c+ " number: ");
            int NUM1 = NUM.nextInt();
            SUM = SUM + NUM1;
        }
        System.out.println("the sum of the nums is: "+ SUM);

        //test 5
        double SUM=0;
        int NUM1=1;
        double Count=0;
        double Avrage=0;
        Scanner NUM = new Scanner(System.in);
        while (NUM1!=0 && Count!=10)
        {
            System.out.print("enter a number: ");
            NUM1 = NUM.nextInt();
            SUM = SUM +NUM1;
            if(NUM1!=0)
                Count++;
        }
        Avrage = SUM/Count;
        System.out.println("amount of nums is: " + Count);
        System.out.println("sum of nums is: " + SUM);
        System.out.println("avrage of nums is: " + Avrage);

        //test 6 + 7
        for (int i = 0; i <=10 ; i++)
        {
            if(i==0)
                System.out.print("#  | ");
            if(i>=1)
                System.out.print(i + "  | ");
        }
        System.out.println();
        System.out.println("_______________________________________________________");
        for (int COLUM = 1; COLUM <=10; COLUM++)
        {
            if (COLUM!=10)
                System.out.print(COLUM + "  | ");
            else
                System.out.print(COLUM + " | ");
            for (int ROW = 1; ROW <=10 ; ROW++)
            {
                if(ROW*COLUM<10)
                    System.out.print("0" + ROW*COLUM +"  |");
                else if (ROW*COLUM<100)
                    System.out.print(ROW*COLUM +"  |");
                else
                    System.out.print(ROW*COLUM +" |");
            }
            System.out.println();
        }

        //test 8
        Scanner NUM = new Scanner(System.in);
        int X = (int) (Math.random()*10)+1;        // generate random num between 1-10
        System.out.println("random num is: " + X); // add to see the random num is changing
        for (int i=0; i<5;i++)                     //loop of 5 times test will fail
        {
            System.out.print("enter a number: ");
            int NUM1 = NUM.nextInt();
            if(i==5)
                System.out.println("you LOOSE");
            else if (NUM1 > X)
                System.out.println("your num is bigger");
            else if (NUM1 < X)
                System.out.println("your num is smaller");
            else
            {
                System.out.println("you found the num - YOU WON");
                break;
            }
        }

        //test 9
        int[] numbers ={544 ,547 ,725 ,507 ,980 ,485 ,601 ,319 ,408 ,69 ,360 ,651 ,984 ,402 ,951
                ,942 ,105 ,236 ,592 ,984 ,390 ,219 ,575 ,865 ,617 ,263 ,501 ,141 ,165 ,83 ,615
                ,941 ,345 ,953 ,615 ,328 ,978 ,597 ,566 ,823 ,375 ,236 ,344 ,907 ,418 ,47 ,462 ,386
                ,217 ,687 ,949 ,626 ,950 ,866 ,248 ,826 ,566 ,412 ,237 ,918 ,219 ,758 ,162 ,399
                ,717 ,742 ,445 ,831 ,843 ,379 ,81 ,553 ,767 ,894 ,892 ,24 ,512 ,58 ,104 ,67 ,815
                ,753 ,328 ,721 ,126 ,380 ,440 ,857 ,93 ,685 ,854 ,753 ,688 ,451 ,842 ,609 ,958
                ,470 ,527 ,743};

        System.out.println("the smaller nums are: ");
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<237)
            {
                System.out.print(numbers[i] + " / ");
            }
        }

        //test 10
        Scanner NUM = new Scanner(System.in);
        String x = "YES";
        int zugi = 0;
        int E_zugi = 0;
        int Zero = 0;
        int NUM1;
        do {
            System.out.print("enter a number or 999 to exit: ");
            NUM1 = NUM.nextInt();
            if (NUM1%2==0 && NUM1!=0)
                zugi++;
            else if (NUM1%2!=0)
                E_zugi++;
            else if (NUM1 == 0)
                Zero++;
        } while (NUM1 != 999);
        System.out.println("numbers of zugi nums are: " + zugi);
        System.out.println("numbers of E_zugi nums are: " + (E_zugi-1)); // add -1 to prevent from 999 to add to E_zugi
        System.out.println("numbers of 0 nums are: " + Zero);

        //test 11
        Scanner NUM = new Scanner(System.in);
        int BASE;
        int UPPER;
        int SUM=1;
        System.out.print("enter a number for base: ");
        BASE = NUM.nextInt();
        System.out.print("enter a number for UPPER: ");
        UPPER = NUM.nextInt();
        for(int i=0;i<UPPER;i++)
        {
            SUM = SUM*BASE;
        }
        System.out.println("the sum of base^UPPER is: " + SUM);

        //test 1
        Scanner NUM = new Scanner(System.in);
        int LOW=2000000;
        int HIGH=-2000000;
        int TEMP;
        char EXIT;
        do
        {
            System.out.print("enter a number: ");
            TEMP = NUM.nextInt();
            if(TEMP>HIGH)
                HIGH=TEMP;
            if(TEMP<LOW)
                LOW=TEMP;
            System.out.print("want to continue <Y/N> : ");
            EXIT = NUM.next().charAt(0);
        }while(EXIT=='Y' || EXIT=='y');
        System.out.println("the highest num is: "+HIGH+" the lowest num is: "+LOW);

        //test2
        for (int i=0 ; i<=8; i++)
        {
            for (int j=8-i ; j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //test3
        for (int i=1 ; i<8; i++)
        {
            for (int j=1 ; j<8; j++)
            {
                if(j>i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }



        //test4
        for (int i=0 ; i<7 ; i++)
        {
            for (int j=7 ; j>=0 ; j--)
            {
                if (j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int a=0; a<7 ; a++)
            {
                if(a<i)
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int b=0 ; b<6; b++)
        {
            for (int c=0 ; c<6 ; c++)
            {
                if(c==b)
                    System.out.print("  ");
                else if(c>b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int a=6 ; a>0 ; a--)
            {
                if(a>b)
                    System.out.print("*");
            }
            System.out.println();
        }


        //test5
        int Count=0;
        Scanner NUM = new Scanner(System.in);
        System.out.print("enter a number or 0 to exit program: ");
        int Number = NUM.nextInt();
        if(Number!=0)
        {
            while (Number>0)
            {
                Number = Number / 10;
                Count++;
            }
            if(Count==1)
                System.out.println("your Number contain "+Count+" digit");
            else
                System.out.println("your Number contain "+Count+" digits");
        }
        else
            System.out.println("program ENDED");
*/

        for (int i = 0; i < 5; i++)
        {
            for (int j = 5; j >= 0; j--)
            {
                if (j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
