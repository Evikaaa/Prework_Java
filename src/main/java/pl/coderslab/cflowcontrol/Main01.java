package pl.coderslab.cflowcontrol;

/**
 Zadanie 1
 Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach java, przygotowanych do zadań.

 Zadanie 1
 W pliku Main01.java stwórz dwie zmienne, o nazwach nr1 i nr2, przechowujące liczby całkowite o wartościach 3 i 7.
 Następnie za pomocą instrukcji warunkowej if ... else , wypisz w konsoli, która z nich jest większa.
 Tekst wypisz wg wzoru: Większa liczba to 7
 */
public class Main01 {

    public static void main(String[] args) {
        int nr1 = 3;
        int nr2 = 7;
        if (nr2 > nr1) {
            System.out.println("Większa liczba to " + nr2);
        } else if (nr1 > nr2) {
            System.out.println("Większa liczba to " + nr1);
        }
    }
}
