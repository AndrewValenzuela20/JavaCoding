package Review4;

public class NEstedLoops {
    public static void main(String[] args) {

        for (int i = 1; i >= 3 ; i++) {

            System.out.println(i);


            for (int j = 1; j <= 4; j++) {

                System.out.println(j);

            }
        }
            System.out.println("----------");
        for (int i = 1; i < 5 ; i++) {
            System.out.println("Hello");

            for(int j=1; j<=2;j++){
                System.out.println("Bye");

        }

            }
        System.out.println("-----Car---------");

        for(int a=0; a<=9; a++){
            for(int b=0; b<=9;b++){
                for(int c=0; c<=9;c++){
                    for(int d=0; d<=9; d++){
                        System.out.println(a+" "+b+" "+c+" "+d);
                    }
                }
            }
        }

        }
    }
