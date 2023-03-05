package main;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import main.age_numbers;
public class age_letters {

public int age_letters(String letter){
// class of letters //
Pattern pattern = Pattern.compile("([0-9])");
Matcher match = pattern.matcher(letter);
boolean matching = match.find();
int letter_to_num =0;
int discount_from_numbers=0;
while (!matching) {
    // test if is a number //
    Scanner n = new Scanner(System.in);
    System.out.print("Write a number: ");
    letter = n.nextLine();
    Matcher match_num = pattern.matcher(letter);
    boolean matching_num = match_num.find();
    if(matching_num) {
        // if I write a number i will go here //
        System.out.println("This is a number - " + letter_to_num);
        letter_to_num = Integer.parseInt(letter);
        if(letter_to_num>100 || letter_to_num<5){
        // go to out range class //
            out_range a3 = new out_range();
            discount_from_numbers =a3.out_range(letter_to_num);
            break;}
        else{
        // go to class of numbers //
        age_numbers a2 = new age_numbers();
        discount_from_numbers = a2.age_numbers(letter_to_num);
        break;}
        }}
return discount_from_numbers;
}}



