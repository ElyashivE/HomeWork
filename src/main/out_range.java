package main;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class out_range {

    public static int out_range(int num) {
        int discount_from_numbers = 0;
        while (num > 100 || num < 5) {
            Scanner n = new Scanner(System.in);
            System.out.print("Write a valid age between 5-100: ");
            String str_num = n.nextLine();

            Pattern pattern = Pattern.compile("([0-9])");
            Matcher match = pattern.matcher(str_num);
            boolean matching = match.find();

            if (matching) {
            // if is a number //
                num = Integer.parseInt(str_num);
                if(num>=5 && num<=100){
            // num between 5 and 100 //
                age_numbers a1 = new age_numbers();
                discount_from_numbers = a1.age_numbers(num);
                break;}
            }
            else {
            // if is a letters - go to class of letters //
                System.out.println(str_num+" - Not a number !");
                age_letters a1 = new age_letters();
                a1.age_letters(str_num);
            }
        }
        return discount_from_numbers;

    }
}