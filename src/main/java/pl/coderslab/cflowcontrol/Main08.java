package pl.coderslab.cflowcontrol;

/**
 Zadanie 8
 W pliku Main08Sample, jest program, który wypisuje w konsoli schemat z n gwiazdek, taki jak poniżej.
 Przeanalizuj go bardzo dokładnie. Przykład dla n = 5:

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

 Używamy do tego zadania pętli zagnieżdżonych!

 W pliku Main08.java napisz program rysujący, na podstawie wartości zmiennej n, poniższy schemat,
 dla zawartego w metodzie main int n = 5;

 * 2 3 4 5
 * * 3 4 5
 * * * 4 5
 * * * * 5
 * * * * *

 Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego if,
 dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.
 */
public class Main08 {
    public static void main(String[] args) {
        //defining a variable with number of rows and asterisks in a row


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

    }
}