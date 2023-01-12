package class7;

public class ForLoops1 {
    public static void main(String[] args) {

        //using a for loop print odd numbers from 1 to 20;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            /*When you know exactly how many times you want to loop
            through a block of code, use the for loop instead of a while loop
            when we don't know how many times wee need to repeat a block of code we
            should be going with while loop most of the time it happens when the user
            input is involved
             */

        }
    }
}
