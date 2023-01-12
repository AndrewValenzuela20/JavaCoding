package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);
        /*
        if the score in all the subjects are greater than 90 print brilliant student
         otherwise print you need to work hard
         */

        double mathScore = 52.5;
        double historyScore = 91.5;
        double scienceScoreee = 93.5;

        if (mathScore > 90.0) {
            if (historyScore > 90) {
                if (scienceScoreee > 90) {
                    System.out.println("You are a brilliant Student");
                } else {
                    System.out.println("You need wowrk harder in science");
                }
            } else {
                System.out.println("You need work harder in history");
            }
        } else {
            System.out.println("work hard in math");
        }
    }
    }

            /*if(mathScore>90&&historyScore>90&&scienceScoreee>90){

                System.out.println("You are a brilliant student");
            }else{
                System.out.println("You need work harder");
            }*/




