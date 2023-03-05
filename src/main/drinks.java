package main;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class drinks {
    public static int drinks() {
        Scanner n = new Scanner(System.in);
        int drink_price = 0;
        System.out.println("List of drinks :\n1.Coca-Cola\n2.Orange\n3.None");
        System.out.print("Which option you choose ? : (1/3) ");
        String drink = n.nextLine();
        Pattern pattern = Pattern.compile("[W+0-9A-Za-z!-*]"); // or letter or signs //
        Matcher match = pattern.matcher(drink);
        boolean matching = match.find();
        while(drink.equals("1") || drink.equals("2") || drink.equals("3") ||matching) {
        // if it is equal to 1 or 2 or 3 or letter/signs/numbers //

            if (drink.equals("1") || drink.equals("Coca-Cola")) {
                // equal to "cola" or 1 //
                drink_price = 8;
                System.out.println("You choose Coca-Cola" + "\n" + "It cost : " + drink_price + " shekels");
                break;

            }else if(drink.equals("2") || drink.equals("orange")){
                // equal to "orange" or 2 //
                drink_price = 8;
                System.out.println("You choose Orange" + "\n" + "It cost : " + drink_price + " shekels");
                break;
            }
            else if(drink.equals("none") || drink.equals("3")) {
                // equal to "no" or 3
                drink_price = 0;
                System.out.println("You do not choose any-thing");
                break;
            }
            System.out.println(drink+" - Not exist");
            System.out.println("Choose only from the list :\n1.Coca-Cola\n2.Orange\n3.None");
            System.out.print("Which option you choose ? : (1/3) ");
            drink = n.nextLine();
        }
        return drink_price;
    }
}
