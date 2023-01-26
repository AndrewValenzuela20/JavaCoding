package class13;

public class ReplaceAllMethodDSemo {

    public static void main(String[] args) {

        String str=";lsadkjf;laskjdf!@#$^$%&%)^()*_@lkashngoiasg";
        System.out.println(str.replaceAll("[A-K]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
    }
}
