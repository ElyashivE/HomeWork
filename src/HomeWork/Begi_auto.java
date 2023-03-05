package HomeWork;

import java.util.Scanner;

public class Begi_auto {
    public static void main(String[] args) {
/*
        //test1+2
        for(int i=1;i<=10;i++)
        {
            if(i==4)
                continue;
            System.out.print(i+ " ");
        }
        //test2
        System.out.println();
        System.out.println("-----------------");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%7==0)
                System.out.print(i + " ");
        }

//-------------------------------------------------------------------------

        //test3
        System.out.println();
        System.out.println("-----------------");
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            System.out.print("enter num" + i +": ");
            int num = scanner.nextInt();
            sum = sum+num;
        }
        System.out.print("sum of nums is: " + sum);

//-------------------------------------------------------------------------

        //test4
        System.out.println();
        System.out.println("-----------------");
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

//-------------------------------------------------------------------------

        //test5
        Scanner NUM = new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------");
        System.out.println("yeter side calc of triangle:");
        double sideA=1, sideB=1,sideC = 0, Temp;
        while(sideA !=0 && sideB !=0)
        {
            System.out.print("enter side A value: ");
            sideA = NUM.nextInt();
            if(sideA == 0)
                break;
            System.out.print("enter side B value: ");
            sideB = NUM.nextInt();
            if(sideB == 0)
                break;
            sideC = (sideA*sideA)+(sideB*sideB);
            System.out.println("the yeter side value is: "+Math.sqrt(sideC));
        }
        System.out.println("PROGRAM ENDED");

//-------------------------------------------------------------------------

        //test6+7
        for (int i = 0; i <= 10; i++) {
            if (i == 0)
                System.out.print("#  | ");
            if (i >= 1)
                System.out.print(i + "  | ");
        }
        System.out.println();
        System.out.println("_______________________________________________________");
        for (int COLUM = 1; COLUM <= 10; COLUM++) {
            if (COLUM != 10)
                System.out.print(COLUM + "  | ");
            else
                System.out.print(COLUM + " | ");
            for (int ROW = 1; ROW <= 10; ROW++) {
                if (ROW * COLUM < 10)
                    System.out.print("0" + ROW * COLUM + "  |");
                else if (ROW * COLUM < 100)
                    System.out.print(ROW * COLUM + "  |");
                else
                    System.out.print(ROW * COLUM + " |");
            }
            System.out.println();
        }

//-----------------------------------------------------------------------------------

       //test8
        int yourNum = 1;
        int z = (int) (Math.random()*12)+1;
        Scanner x = new Scanner(System.in);
        System.out.println("welcome to guess game");
        for (int i = 1; i <= 3; i++)
        {
                System.out.print("enter your num between 1-12: ");
                yourNum = x.nextInt();
                if (yourNum == z)
                {
                    System.out.println("nice guess");
                    break;
                }
                else if(yourNum>12 || yourNum<1)
                {
                    System.out.println("please enter num in range 1 - 12");
                    i--;
                }
                    else if(yourNum<z)
                    System.out.println("your num is lower - you got "+ (3-i) + " guesses left");
                else if(yourNum>z)
                    System.out.println("your num is higher - you got "+ (3-i) + " guesses left");
        }
        System.out.println("you fail to guess - game over");

        //test kita
        Scanner input_num = new Scanner(System.in);
        System.out.print("enter your 1st num: ");
        int a = input_num.nextInt();
        System.out.print("enter your 2nd num: ");
        int b = input_num.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"/"+b+"="+(a/b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"%"+b+"="+(a%b));
        System.out.println(a+"=="+b+": "+(a==b));
        System.out.println(a+"!="+b+": "+(a!=b));
        System.out.println(a+"<="+b+": "+(a<=b));
        System.out.println(a+">="+b+": "+(a>=b));
        System.out.println(a+"<"+b+": "+(a<b));
        System.out.println(a+">"+b+": "+(a>b));

        Scanner input_num = new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = input_num.nextInt();
        if (age>=20 && age<=50)
        {
            System.out.println("enter your height: ");
            int height = input_num.nextInt();
            if (height>=180)
                System.out.println("your got the job");
            else
                System.out.println("height not in range");
        }
        else
            System.out.println("age not in range");

*/


    }
}