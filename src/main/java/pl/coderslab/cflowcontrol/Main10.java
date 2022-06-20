package pl.coderslab.cflowcontrol;

/**
 Zadanie 10
 W pliku Main10.java napisz program rysujący, na podstawie wartości zmiennej n,
 następujący schemat (tutaj dla n = 5):

 * 2 3 4 5
 * * 3 4 5
 * * * 4 5
 * * * * 5
 * * * * *
 * * * * *
 * * * * 5
 * * * 4 5
 * * 3 4 5
 * 2 3 4 5

 Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego if,
 dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.
 */
public class Main10 {

    public static void main(String[] args) {

        int n = 5;


        for (int i = 0; i < n; i++) { // ile rzędów
            String row = "";//variable storing asterisks in a row, it is zeroed at the beginning of each iteration

            for (int j = 0; j < n; j++) { // ile miejsc w rzędzie ma wyświetlić
                if (j>i) {
                    System.out.print(j+1);
                }   else {
                    System.out.print("*");
                }
            }
            System.out.println();}

        for (int i = n; i > 0; i--) {
            String row = "";

            for (int j = 1; j <= n; j++) { // ile miejsc w rzędzie ma wyświetlić
                if (j>i) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }
}


