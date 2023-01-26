package class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String straw="Java is not pair";
        System.out.println(straw.indexOf("J"));
        System.out.println(straw.indexOf("a"));
        System.out.println(straw.indexOf("p"));
        for (int i = 0; i < straw.length(); i++) {
            System.out.println(straw.charAt(i)+" has the index " +i);
        }
    }
}
