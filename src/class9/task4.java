package class9;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {

        /* Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */

        /* 1.) Ask user for item price and item name
           2.) accumulate the price
           3.) tell  the user how much total that they should pay
           4.)If user give more money program should return a change.
           5.) When user is done with payment, program should say "Thank you for shopping".
         */
        Scanner scanner = new Scanner(System.in);
        double total=0;
        for(int i = 0; i < 1; i++) {
            System.out.println("Please enter its item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount that you have to pay " +total);
        }
        System.out.println("Please pay for the items");
        double amountPaid = scanner.nextDouble();

        if(amountPaid>total){
            double change=amountPaid-total;
            System.out.println("Hey here is your change " + change);
        } else if(amountPaid < total){
            System.out.println("You cant buy all the items");
        }
        System.out.println("Thank you for shopping");
    }
}
