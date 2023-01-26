package class8;

public class NestedLoopss4 {
    public static void main(String[] args) {


        for(int i = 0; i < 3; i++) {


            if(i==1){
                System.out.println();
                continue;
            }
            for (int j = 0; j< 5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++){

            if (i==1 || i == 3){
                System.out.println();
                continue;
            }
            for (int j = 0; j <= 5; j++)
                System.out.print(j+ " ");
        }
        System.out.println();
    }
}
