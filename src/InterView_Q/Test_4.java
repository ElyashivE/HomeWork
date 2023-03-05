package InterView_Q;

import java.util.Random;

public class Test_4
{
    public static void main(String[] args)
    {
//------generate random array + random num inside array------
        int[] A = random();
//---------check if num found in array or not---------------
        solution(A);
//----------------print array A_-----------------------------
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " | ");
        }
//---------------print result--------------------------------
        System.out.println();
    }

    public static int[] random()
    {
        Random random = new Random();
        int array_size = random.nextInt(100) + 1;
        int[] A = new int[array_size];
        for (int i = 0; i < A.length; i++)
        {
            int random_num = random.nextInt(201) - 100;
            A[i] = random_num;
        }
        return A;
    }

    public static void solution(int [] A)
    {
        int highest_num = A[0];
        int found_none_array_num = 0;
        for (int i = 0; i < A.length; i++)
        {
            if (highest_num < A[i])
                highest_num = A[i];
        }
        outerloop:
        for (int j = 1; j < highest_num; j++)
        {
            int count = 0;
            for (int i = 0; i < A.length; i++)
            {
                if (j != A[i])
                    count++;
                if (count == A.length) {
                    found_none_array_num = j;
                    break outerloop;
                }
            }
        }
        System.out.println("the lowest num that not found in array and bigger the 0 is: " + found_none_array_num);
    }
}
