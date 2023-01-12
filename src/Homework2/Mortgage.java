package Homework2;

public class Mortgage {
    public static void main(String[] args) {

        float mortgageRate = 4.0f;
        int mortgagePrice = 250000;

        if (mortgageRate > 4.5) {
            System.out.println("Do not buy house");
        } else {
            System.out.println("Ok, I might consider buying");
        }
        if (mortgagePrice > 200000) {
            System.out.println("I will need loan");
        } else {
            System.out.println("I will pay cash");
        }
    }
}
