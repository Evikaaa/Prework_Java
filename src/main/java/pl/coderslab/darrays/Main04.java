package pl.coderslab.darrays;

/**
 Zadanie 4
 W pliku Main04.java

 Stwórz tablicę z liczbami (4, 643, 112, 9999, 69), tablicę nazwij numbers.
 W pętli for sprawdź, które są parzyste i wypisz je w konsoli jedna pod drugą.
 Utwórz dodatkową zmienną sumOdd o wartości 0.
 Zmodyfikuj pętlę z pkt. 2 w ten sposób, aby dodatkowo sumowała liczby nieparzyste.
 Wyświetl w konsoli dodatkowy komunikat, wg wzoru: SUMA: 10711..
 Oczekiwany wynik:

 4
 112
 SUMA: 10711.
 */
public class Main04 {

	public static void main(String[] args) {

		int numbers[] = {4, 643, 112, 9999, 69};
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			} else {
			    sumOdd = sumOdd + numbers[i];
			}
		}
		System.out.println("SUMA: " + sumOdd + ".");
		}
}

