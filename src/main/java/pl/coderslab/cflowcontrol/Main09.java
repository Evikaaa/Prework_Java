package pl.coderslab.cflowcontrol;

/**
 Zadanie 9
 W pliku Main09.java napisz program rysujący na podstawie wartości zmiennej nponiższy schemat, dla zawartego w metodzie main int n = 5;

 *
 * *
 * * *
 * * * *
 * * * * *

 Możesz to zadanie rozwiązać na dwa sposoby:

 używając pętli zależnych,
 używając pętli niezależnych i instrukcji warunkowej if.
 Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.
 */
public class Main09 {

    public static void main(String[] args) {
        int n = 5;


        //pętla generuje rzędy
        for (int i = n; i >= 0 ; i=i-1) {
            String row = "";
            for (int j = i; j < n; j++) {
                row = row + "*";
            }
            System.out.print(row + "\n");
        }
    }

}
