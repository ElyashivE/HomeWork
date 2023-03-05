package main;
public class age_numbers {

    public static int age_numbers(int number){
    int discount = 0;
    if (number >= 15 && number <= 18) {
    // if number between 15 and 18 - get 5 shekels discount //
        discount = 5;
        System.out.println("You got 5 shekels discount :)");}
    return discount;
    }
}


