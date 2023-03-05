package HomeWork;

import java.util.Scanner;

public class if_else_swith_case_try_catch
{
    public static void main(String[] args) {
/*
        //test 1
        Scanner NUM = new Scanner(System.in);
        System.out.println("enter a number between 1-7 to convert to day: ");
        int DAY = NUM.nextInt();
        switch (DAY)
        {
            case 1:
                System.out.println("your day is reshon");
                break;
            case 2:
                System.out.println("your day is sheni");
                break;
            case 3:
                System.out.println("your day is shleshi");
                break;
            case 4:
                System.out.println("your day is reviei");
                break;
            case 5:
                System.out.println("your day is hamishi");
                break;
            case 6:
                System.out.println("your day is shishi");
                break;
            case 7:
                System.out.println("your day is shabat");
                break;
            default:
                System.out.println("number not in range");
                break;
        }

        //test2
        int Month,Year,Days=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a month number");
        Month = sc.nextInt();
        if(Month<=12 && Month>=1)
        {
            System.out.println("enter year");
            Year = sc.nextInt();
            if(Month==1 || Month==3 ||Month==5 ||Month==7||Month==8||Month==10||Month==12)
            {
                Days=31;
            }
            else if(Month==4||Month==6||Month==9||Month==11)
            {
                Days=30;
            }
            else
            {
                if(Month==2)
                {
                    if(Year%400==0 && Year%100==0)
                    {
                        Days=29;
                    }
                    else if(Year%4==0 && Year%100!=0)
                        {
                            Days=29;
                        }
                        else
                            Days=28;
                }

            }
            System.out.println("Number of days in " + Month +"/"+Year+ " is :"+Days);
        }
        else
            System.out.println("entered month number is not there in the calender");

        //test3
        Scanner NUM = new Scanner(System.in);
        System.out.println("enter your GRADES between 0-100: ");
        System.out.print("Grade 1 is: ");
        int GRADE1 = NUM.nextInt();
        if(GRADE1<0 || GRADE1>100)
        {
            System.out.print("Grade not in range reenter - Grade 1 is: ");
            GRADE1 = NUM.nextInt();
        }
        System.out.print("Grade 2 is: ");
        int GRADE2 = NUM.nextInt();
        if(GRADE2<0 || GRADE2>100)
        {
            System.out.print("Grade not in range reenter - Grade 2 is: ");
            GRADE2 = NUM.nextInt();
        }
        System.out.print("Grade 3 is: ");
        int GRADE3 = NUM.nextInt();
        if(GRADE3<0 || GRADE3>100)
        {
            System.out.print("Grade not in range reenter - Grade 3 is: ");
            GRADE3 = NUM.nextInt();
        }
        if((GRADE1+GRADE2+GRADE3)/3>=90 && (GRADE1+GRADE2+GRADE3)/3<=100 )
            System.out.println("your average Grade is: A - "+ (GRADE1+GRADE2+GRADE3)/3);
        else if((GRADE1+GRADE2+GRADE3)/3>=70 && (GRADE1+GRADE2+GRADE3)/3<90 )
            System.out.println("your average Grade is: B - " + (GRADE1+GRADE2+GRADE3)/3);
        else if((GRADE1+GRADE2+GRADE3)/3>=50 && (GRADE1+GRADE2+GRADE3)/3<70 )
            System.out.println("your average Grade is: C - "+ (GRADE1+GRADE2+GRADE3)/3);
        else
            System.out.println("your Grade is: D");

        //test4
        Scanner NUM = new Scanner(System.in);
        System.out.print("enter number of items: ");
        int How_Many_Items = NUM.nextInt();
        int SUM=0;
//        int[] shopping = new int[How_Many_Items];
        System.out.println("enter your items price: ");
        for(int i=1 ; i<=How_Many_Items;i++)
        {
            System.out.print("item " +i+ " price is:");
            int Price = NUM.nextInt();
//            shopping[i-1]=Price;
            SUM= SUM+Price;
        }
        if(SUM<100)
            System.out.println("no discount your price is: "+ SUM);
        else if(SUM<=120)
            System.out.println("your price "+ SUM+ " after discount of 10% is: "+ (SUM-(SUM*0.1)));
        else if (SUM<=200)
            System.out.println("your price "+ SUM+ " after discount of 20% is: "+ (SUM-(SUM*0.2)));
        else
            System.out.println("your price "+ SUM+ " after discount of 25% is: "+ (SUM-(SUM*0.25)));

        //test5
        Scanner Month = new Scanner(System.in);
        System.out.println("enter a number of month: ");
        int MONTH = Month.nextInt();
        try {
            switch (MONTH) {
                case 1:
                    System.out.println("very cold in jan");
                    break;
                case 2:
                    System.out.println("very cold in feb");
                    break;
                case 3:
                    System.out.println("very cold in march");
                    break;
                case 4:
                    System.out.println("very cold in april");
                    break;
                case 5:
                    System.out.println("quite comfie in may");
                    break;
                case 6:
                    System.out.println("quite comfie in jun");
                    break;
                case 7:
                    System.out.println("quite comfie in july");
                    break;
                case 8:
                    System.out.println("very hot in aug");
                    break;
                case 9:
                    System.out.println("very hot in sep");
                    break;
                case 10:
                    System.out.println("very hot in oct");
                    break;
                case 11:
                    System.out.println("very hot in nov");
                    break;
                case 12:
                    System.out.println("very hot in dec");
                    break;
                default:
                    System.out.println("no such month");
            }
        }
        catch (Exception e)
        {
            System.out.println("Warning");
        }

        //test6
        Scanner NUM = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int NUM1 = NUM.nextInt();
        System.out.print("enter 2nd number: ");
        int NUM2 = NUM.nextInt();
        System.out.print("enter 3rd number: ");
        int NUM3 = NUM.nextInt();
        if (NUM1 == NUM2 && NUM1 == NUM3)
            System.out.println("all the numbers are even");
        else if (NUM1 == NUM2 || NUM1 == NUM3 || NUM2 == NUM3)
            System.out.println("some numbers are even");
        else
            System.out.println("none of the numbers are even");
*/
    }
}
