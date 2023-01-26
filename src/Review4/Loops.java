package Review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int b = 1;
        do {
            System.out.println("do while");
            b++;

        } while (b <= 3);

        //Ask students if they understand loops?
        //if they don't --> tell them to practice more loops
        //if they understand --> you good move to array concept
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        } while (answer.equalsIgnoreCase("no"));

        System.out.println("Great job, let's learn arrays now");
    }
}
