package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        // Create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements which are present in even indexes and print it after adding them.

        // create an array and store 10,20,30,4,5,6,7,80
        // add all the elements which are multiple of 2

        int [] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        int sumEven=0;
        for(int i=0; i < numbers.length; i++ ){
           if(i%2==0){
               sumEven+=numbers[i];
            }
        }
        System.out.println(sumEven);
        System.out.println("************");

        int [] numbers2={10,20,30,4,5,6,7,80};
        int sumMultiple=0;
        for(int j=0; j< numbers2.length; j++){
            if(numbers2[j]%2==0){
                sumMultiple+=numbers2[j];
            }
        }
        System.out.println(sumMultiple);
    }
}
