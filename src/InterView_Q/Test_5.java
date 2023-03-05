package InterView_Q;

public class Test_5
{
    public static void main(String[] args)
    {
        boolean result = compare_arr();
        System.out.println("the arrays are: "+result);
    }
    public static boolean compare_arr()
    {
        String [] arr1 = {"1","2","3","4","5"};
        String [] arr2 = {"1","2","3","4","5"};
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    arr1[i] = arr1[i]+"checked";
                    arr2[j] = arr2[j]+"checked";
                    count++;
                }
            }
        }
        return count == arr1.length;
    }
}
