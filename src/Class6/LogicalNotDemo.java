package Class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="Pas123";
        System.out.println(password.equals("Pas123"));
        if(!password.equals("Pas123")){
            System.out.println("Wrong Password");
        }
        boolean isRaining=true;

        if(!isRaining){
            System.out.println("letsgo for a walk");
        }else{
            System.out.println("Lets take the umbrella");
        }
    }
}
