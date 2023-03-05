package main;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import main.age_numbers;
import main.add_answer_not_correct;
import main.out_range;
import main.drinks;
import main.additions;
public class func_run {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Welcome to the hottest toast ");
        System.out.print("Enter your age: ");
        String age = n.nextLine();

        Pattern pattern = Pattern.compile("[W+ +א-תA-Za-z!-*]"); // or letter or signs //
        Matcher match = pattern.matcher(age);
        boolean matching = match.find();
        int discount = 0;
        // classes of 2 type of writing age //
        age_letters a1 = new age_letters();
        age_numbers a2 = new age_numbers();
        out_range a3 = new out_range();

        if (matching || age.isBlank()) {
///////////////// go to class age of letters ///////////////
            discount = a1.age_letters(age);}
        else{
            int age_as_num = Integer.parseInt(age);
            if (age_as_num > 100 || age_as_num < 5) {
////////////// go to class out range ///////////////////////
                discount = a3.out_range(age_as_num);
            } else {
///////////////// go to class age of numbers ///////////////
                discount = a2.age_numbers(age_as_num);
            }
        }


        int a = 0;
        int d = 0;

/////////////////// additions + drink ////////////////////////
        additions add = new additions();
        System.out.print("Do u want additions ? : (yes/no) ");
        String answer = n.nextLine();
            if(answer.equals("yes")) {
            // if I write answer = "yes" - go to class additions //
                a = add.additions(answer);
                drinks d1 = new drinks();
                // drink price from drink class //
                d =a+ d1.drinks();
            }
            else if(answer.equals("no")){
                // if I write numbers or answer = "no" //
                add_answer_not_correct add_ans = new add_answer_not_correct();
                d = add_ans.add_answer_not_correct(answer);
            }else
            {
                add_answer_not_correct add_ans = new add_answer_not_correct();
                d = add_ans.add_answer_not_correct(answer);
            }


        int sum = (15+d)-discount;
        System.out.println("The toast cost to you - "+sum+" shekels"+"\n"+"Enjoy your meal !");

    }
}





