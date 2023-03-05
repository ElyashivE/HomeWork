package HomeWork;

import java.util.Scanner;

public class ex
{
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your favorite number :");
        int x = scanner.nextInt();

        System.out.println("enter your second favorite number :");
        int y = scanner.nextInt();

        System.out.println(x*y);


        Scanner ARR = new Scanner(System.in);
        int[] ARR1 = new int[10];
        int[] ARR2 = new int[10];
        System.out.println("enter your ARRAY 1 inputs: ");
        for (int i = 0; i < 10; i++)
        {
            int ARRAY1 = ARR.nextInt();
            ARR1[i] = ARRAY1;
        }
        System.out.println("enter your ARRAY 2 inputs: ");
        for (int i = 0; i < 10; i++)
        {
            int ARRAY2 = ARR.nextInt();
            ARR2[i] = ARRAY2;
        }
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(ARR1[j]==ARR2[i])
                    System.out.println("ARR1["+j+"]: "+ARR1[j]+" == ARR2["+i+"]: "+ARR2[i]);
            }
        }

        Scanner NUM = new Scanner(System.in);
        System.out.print("enter your num: ");
        int NUM1 = NUM.nextInt();
        int SUM=0;
        int TEMP = NUM1;
        for (int i = 0; TEMP!=0 ; i++)
        {
            SUM = SUM + TEMP%10;
            TEMP = TEMP/10;
        }
        System.out.print("the sum of your num is: "+SUM);

        for (int a = 1; a <= 5 ; a++)
        {
            System.out.println();
            for (int b = 1; b <= 10; b++)
            {
                System.out.print(b+" ");

            }
            System.out.println();
            for (int c = 10; c >=1 ; c--)
            {
                System.out.print(c+" ");
            }
        }
        System.out.println("\nprogram ended");

        //check is and sids of a number ate equal expmle 5235 is good 5234 not good.
        Scanner NUM = new Scanner(System.in);
        System.out.print("enter your num: ");
        int NUM1 = NUM.nextInt();
        int MIN=0, MAX=0;
        MIN = NUM1 %10;
        int TEMP=NUM1;
        while (TEMP!=0)
        {
            if(TEMP/10!=0)
                MAX = TEMP/10;
            TEMP = TEMP/10;
        }
        if (MAX == MIN)
            System.out.println("your number: "+NUM1+ " max is: "+MAX+" and your min is: "+MIN);
        else
            System.out.println("the nums are not equal");
        System.out.println("PROGRAM ENDED");

        //sums the values of a number: exmple input is 1234 > output is 1+4 and 2+3.
        try {
            Scanner NUM = new Scanner(System.in);
            System.out.println("------------USER INPUT------------");
            System.out.print("enter the size of your number: ");            //mean if input is 12345 then write 5
            int ARR_SIZE = NUM.nextInt();                                   //this will set  how big the array is
            System.out.print("enter your number: ");
            int NUM1 = NUM.nextInt();
            System.out.println("----------------RESULT--------------");
            int[] ARR = new int[ARR_SIZE];                                  // array size
            int NUM1_TEMP = NUM1;
            for (int i = ARR_SIZE; NUM1_TEMP != 0; i--)                     // reverse for to enter the number to the
            {                                                               // array same way the number is
                ARR[i - 1] = NUM1_TEMP % 10;                                // enter the last digit to array last slot
                NUM1_TEMP = NUM1_TEMP / 10;
            }
            for (int i = 0; i < ARR_SIZE / 2; i++)
            {
                int SUM = 0;
                SUM = ARR[i] + ARR[ARR_SIZE - 1 - i];                        //sum the numbers inside the array
                if(i==0)
                    System.out.print("the " + (i + 1) + "st sum is: " + SUM);
                else if(i==1)
                    System.out.print("the " + (i + 1) + "nd sum is: " + SUM);
                else if(i==2)
                    System.out.print("the " + (i + 1) + "rd sum is: " + SUM);
                else
                    System.out.print("the " + (i + 1) + "th sum is: " + SUM);
                switch (SUM)
                {
                    case 1:
                        System.out.print("   ---> day in the week reshon\n");
                        break;
                    case 2:
                        System.out.print("    ---> day in the week sheni\n");
                        break;
                    case 3:
                        System.out.print("    ---> day in the week shlishi\n");
                        break;
                    case 4:
                        System.out.print("    ---> day in the week reviei\n");
                        break;
                    default:
                        System.out.print("    ---> other day\n");
                }
            }
            if (ARR_SIZE % 2 != 0)                                          //check if array is e-zugi for free number
            {
                System.out.println("your free number is: " + ARR[(ARR_SIZE / 2)]); ///
            }
            System.out.println("--------------TEST RUN ENDED OK--------------");
        }
        catch (Exception E)                    // if the input values are to big then int should be
        {
            System.out.println("TEST RUN FAILED - Warning EXCEPTION!!!! your input not in range");
        }

        //print the location of every letter in the string
        String WORD = "JAVA EXERCISES";
        System.out.println();
        for (int i = 0; i < WORD.length(); i++)
        {
            char WORD_LET = WORD.charAt(i);
            System.out.println(" the char at position"+i+" is: "+WORD_LET );
        }

        //check 2 strings who comes first in dictionary
        System.out.println("enter 2 strings to compare:");
        Scanner MYWORD = new Scanner(System.in);
        System.out.print("1st string is: ");
        String str1 = MYWORD.nextLine();
        System.out.print("2nd string is: ");
        String str2 = MYWORD.nextLine();

        // use compareTo to compare 2 strings like > or < when use int.
        //or use equals instead of compareTo to check if the equals like == when use int.
        .
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println(str1 + " is less than "+ str2);
        }
        else if (result == 0)
        {
            System.out.println(str1 +" and " +str2+ " are equals");
        }
        else // if (result > 0)
        {
            System.out.println(str2 + " is less than "+ str1);
        }

        //convert minutes to years and days
        Scanner MINUTES = new Scanner(System.in);
        System.out.print("enter number to convert: ");
        int minutes = MINUTES.nextInt();
        int years = minutes/60/24/365;
        int days = (minutes/60/24)%365;
        System.out.println(minutes + " is approx: " +years+ " years and " +days+" days");

        //the longest constractive nums in the array
        int count = 0, f_count=0;
        int [] arr = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        for (int i = 0; i < arr.length-1; i++)
        {
            int checksum = arr[i];
            if (arr[i+1] == checksum+1 || arr[i+1] == checksum)
                count++;
            else if(arr[i+1] != checksum+1)
            {
                if(f_count<count)
                    f_count = count;
                count = 0;
            }
        }
        System.out.println("the highest amount of constractive nums are: "+(f_count+1));
*/
        int temp,count=0;
        int [] arr = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int [] new_arr = new int[arr.length];
            for (int j = 0; j < arr.length-1; j++)
            {
                if((arr[j]) %2 == 0 )
                    new_arr[j] = arr[j];
                else
                {
                    new_arr[((arr.length-1) / 2 + count)] = arr[j];
                    count++;
                }
                    if(j == 0)
                    continue;
                if(new_arr[j-1] == 0)
                {
                    temp = new_arr[j-1];
                    new_arr[j-1] = arr[j];
                    new_arr[j] = temp;
                }
                System.out.print(new_arr[j] + ", ");
            }
    }
}

