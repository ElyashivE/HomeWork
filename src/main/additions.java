package main;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import main.age_numbers;
import main.drinks;
import java.util.List;
public class additions {
    public static int additions(String addition) {
        Scanner n = new Scanner(System.in);
        int amount = 0;
        while (addition.equals("yes")) {
            System.out.print("which additions do you want ?\n(If you do not want additions write - \"no\")");
            String add = n.nextLine();
            String[] arr_add = add.split(",");
            for (int i =0;i < arr_add.length; i++)
            {
                switch (arr_add[i].trim())
                {
                    case "olives"://, " olives ", " olives", "olives":
                        amount += 3;
                        break;
                    case "corn ", " corn ", " corn", "corn":
                        amount += 3;
                        break;
                    case "mushrooms ", " mushrooms ", " mushrooms", "mushrooms":
                        amount += 3;
                        break;
                    case "tomatoes ", " tomatoes ", " tomatoes", "tomatoes":
                        amount += 4;
                        break;
                    case "bulgarian ", " bulgarian ", " bulgarian", "bulgarian":
                        amount += 4;
                        break;
                    case "onion ", " onion ", " onion", "onion":
                        amount += 4;
                        break;
                    case "no ", " no ", " no", "no":
                        System.out.println("You choose without additions");
                        break;
                    default:
                        System.out.println(i + " - Dose not exist");
                        break;
                }
            }
                    System.out.println("The Additions List is:");
                    System.out.println("1.Olives" + "\n" + "2.Corn" + "\n" + "3.Mushrooms");
                    System.out.println("4.Tomatoes" + "\n" + "5.Bulgarian" + "\n" + "6.Onion");

            System.out.print("do you want to stay in additions ? (yes/no)");
            addition = n.nextLine();
        }
            System.out.println("It cost : " + amount + " shekels");

        return amount;
    }
}