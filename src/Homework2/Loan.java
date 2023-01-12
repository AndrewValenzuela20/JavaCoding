package Homework2;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner loan = new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int loanAmount = loan.nextInt();

        if (loanAmount <= 200000) {
            System.out.println("I lend money");
        } else {
            System.out.println("I reject you");
        }

    }
}
