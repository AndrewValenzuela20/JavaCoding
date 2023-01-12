package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        // Below line helps us get the input from the keyboard
        Scanner name= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1=name.nextLine();
        System.out.println("My name is "+name1);
    }
}
