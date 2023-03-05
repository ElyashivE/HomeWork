package HomeWork;

import java.util.Scanner;

public class Conditions
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter your first number: ");
        int first= sc.nextInt();
        System.out.println("enter your second number: ");
        int second= sc.nextInt();
        int sum = first + second;
        System.out.println("the sum of both inputs is: " + sum);

        System.out.println("enter your first number: ");
        int third= sc.nextInt();
        System.out.println("enter your second number: ");
        int forth= sc.nextInt();
        if(third>forth)
            System.out.println("the first number: " + third + " is bigger");
        else if (forth>third)
            System.out.println("the second number: " + forth + " is bigger");
        else
            System.out.println("both inputs are the same");

        System.out.println("enter your first number: ");
        int fifth= sc.nextInt();
        if(fifth>0)
            System.out.println("your number: " + fifth +" is positive");
        else if (fifth<0)
            System.out.println("your number: " + fifth +" is negative");
        else
            System.out.println("your number: " + fifth +" is zero");

        System.out.println("enter your first number: ");
        int sixth= sc.nextInt();
        System.out.println("enter your second number: ");
        int seventh= sc.nextInt();
        System.out.println("enter your third number: ");
        int eighth= sc.nextInt();
        if (sixth>seventh && sixth>eighth)
            System.out.println("your first number: " + sixth +" is the biggest");
        else if(seventh>sixth && seventh>eighth)
            System.out.println("your second number: " + seventh +" is the biggest");
        else if(eighth>sixth && eighth>seventh)
            System.out.println("your third number: " + eighth +" is the biggest");
        else if (sixth == seventh && sixth == eighth)
            System.out.println("all the numbers are the same");
        else if (sixth == seventh && sixth != eighth)
            System.out.println("your first and second numbers are the same");
        else if (sixth != seventh && sixth == eighth)
            System.out.println("your first and third numbers are the same");
        else
            System.out.println("your second and third are the same");

        System.out.println("enter your number: ");
        int ninth= sc.nextInt();
        if(ninth % 2 == 0)
            System.out.println("your number: " + ninth + " is zugi");
        else
            System.out.println("your number: " + ninth + " is e-zugi");

        System.out.println("enter your number between 1-100: ");
        int tenth= sc.nextInt();
        if(tenth>=1 && tenth<=100)
            System.out.println("the number: " + tenth + " is in range");
        else if(tenth>100)
            System.out.println("the number: " + tenth + " is to HIGH");
        else
            System.out.println("the number: " + tenth + " is to LOW");

        System.out.println("candidate: pls enter your age (need to be between 20-50): ");
        int age= sc.nextInt();
        if (age >= 20 && age <= 50)
        {
            System.out.println("enter your height (need to be above 180cm): ");
            int height = sc.nextInt();
            if (height > 180)
                System.out.println("age and height are  OK - candidate PASS");
            else
                System.out.println("age OK but you to short - candidate FAIL");
        }
        else if (age < 20)
            System.out.println("age not in range you to YOUNG- candidate FAIL");
        else
            System.out.println("age NOT in range you to OLD - candidate FAIL");
    }
}
