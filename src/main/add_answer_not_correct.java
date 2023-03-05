package main;
import main.additions;
import main.drinks;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class add_answer_not_correct {

    public static int add_answer_not_correct(String answer) {
        int drink_price = 0;
        int d = 0;
        int a = 0;
        Scanner n = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([0-9])");
        Matcher match = pattern.matcher(answer);
        boolean matching = match.find();
        while (answer != "yes") {
            // answer is not "yes" //
            System.out.print("I am ask again" + "\n" + "Do u want additions ? : (yes/no) ");
            answer = n.nextLine();
            if (answer.equals("no")) {
            // go to class - additions , after I ask him twice //
                drinks dr = new drinks();
                drink_price = dr.drinks();
                break;
            } else {
                // answer is "yes" //
                additions add = new additions();
                a = add.additions(answer);
                drinks d1 = new drinks();
                // drink price from drink class //
                d =a+ d1.drinks();
                break;
            }}
            return drink_price+d;

    }
}

