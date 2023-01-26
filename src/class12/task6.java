package class12;

public class task6 {
    public static void main(String[] args) {
        /* Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and
        calculate how many total countries been stored.
         */
        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United", "Kingdom", "France", "Spain"},
                {"China", "India", "Japan", "Russia"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}
        };
        System.out.println(countries.length);
        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                counter++;

            }
            System.out.println();
        }
        for (String[] country: countries){
            for(String s: country) {
                System.out.println(s + " ");
                counter++;
            }
        }
        System.out.println("Total countries "+counter);
    }

    }
