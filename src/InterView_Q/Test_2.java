package InterView_Q;

import java.util.Random;

public class Test_2
{
    public static void main(String[] args)
    {
        int x =0;
        while (x != 10)
        {
            String LETTER="";
            String S="";
            Random random = new Random();
            int N = random.nextInt(10)+1;
            for (int i = 0; i < N; i++)
            {
                int A_or_B = random.nextInt(2);
                if(A_or_B == 0)
                    LETTER = "a";
                if(A_or_B == 1)
                    LETTER = "b";
                S = S+LETTER;
            }
            char letter;
            char last_letter_checked=' ';
            boolean result = false;
            for (int i = 0; i <S.length(); i++)
            {
                letter = S.charAt(i);
                if(i == 0)
                    last_letter_checked = letter;
                if ((last_letter_checked == 'a' && letter == 'a')||(last_letter_checked == 'a' && letter == 'b')||(last_letter_checked == 'b' && letter == 'b'))
                {
                    last_letter_checked = letter;
                    result = true;
                    continue;
                }
                if(last_letter_checked == 'b' && letter == 'a')
                {
                    result = false;
                    break;
                }
            }
            System.out.println(S + " is " + result);
            x++;
        }

    }





}
