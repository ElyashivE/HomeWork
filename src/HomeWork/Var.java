package HomeWork;

public class Var {
    public static void main(String[] args) {
        /* good - hello, hello2, hello_2, $hello */
        /* not good - 2hello, hello-5, my var, @hello */

        int num1 = 2;
        int num2 = 5;
        int sum = num1 * num2;
        System.out.println("the sum is: " + sum);

        String two_first_dig_year = "20";
        String two_last_dig_year = "22";
        System.out.println("the year is : " + two_first_dig_year + two_last_dig_year);

        String name = "elyashiv";
        int age = 38;
        System.out.print("my name is " + name + " and my age is " + age);

        int first = 1;
        int second = 2;
        int third = 3;
        String summary = "outout";
        System.out.print("\nthe " + summary + " of var1 + var2 + var3 is: ");
        System.out.println(first + second + third);

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("the days of the week are:");
        for (int i = 0; i <= 6; i++) {
            if (i != 0)
                System.out.print(" | " + weekdays[i]);
            else
                System.out.print(weekdays[i]);
        }
        System.out.println("\nthe length of the weekedays array is: " + weekdays.length);

    }
}
