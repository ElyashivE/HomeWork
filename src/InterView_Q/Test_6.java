package InterView_Q;

public class Test_6
{
    public static void main(String[] args)
    {
        String name = "123456 7890";
        System.out.println("reverse name of "+name+" is: ");
        for (int i = name.length()-1; i >= 0; i--)
        {
            char c = name.charAt(i);
            System.out.print(c);
        }
    }
}
