package InterView_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your numbers:");
        System.out.print("enter 1st num:");
        int a = scanner.nextInt();
        System.out.print("enter 2nd num:");
        int b = scanner.nextInt();
        System.out.println("the amount of 1's is: "+number_to_binary_convert_return_amount_of_nums_ones(a,b));
    }
public static int number_to_binary_convert_return_amount_of_nums_ones(int a,int b)
{
    int num = a * b;
    int count = 0;
    List<Integer> temp_list = new ArrayList<Integer>();
    int reminder = 0;
    int my_num = num;
    while (my_num != 0)
    {
        reminder = my_num % 2;
        my_num = my_num / 2;
        temp_list.add(reminder);
        if (reminder != 0)
            count++;
    }
    for (int k = 0; k < temp_list.size() - 1; k++)
    {
        temp_list.add(k, temp_list.remove(temp_list.size() - 1));
    }
    System.out.println("list: "+temp_list);
    return count;
}
}
