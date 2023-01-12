package class5;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        /* Write a program to find the largest number among three distinct numbers using nested if condition
        Please use Scanner class to take input from users
         */
Scanner Scanner=new Scanner(System.in);

        int number1=100, number2=20, number3=30;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 3 numbers ");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println(number1+" is the largest number ");
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println(number2+ " is the largest number");
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println(number3+ " is the largest number");
            }
        }
    }
}
