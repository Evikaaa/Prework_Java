package pl.coderslab.darrays;

/**
 Zadanie 7
 W pliku Main07.java znajduje się tablica z temperaturami.

 Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na stopnie Fahrenheita.
 Przelicznik jest następujący: tempCelc * 1,8 + 32.
 Aby to zrobić przeiteruj tablicę i nadpisz daną temperaturę nową, obliczoną wartością.
 Oblicz średnią temperaturę z nowo wyliczonych wartości i przypisz do zmiennej avg.
 Wypisz ją w konsoli wg wzoru: ŚREDNIA: 3,95 – zaokrąglij liczbę do dwóch miejsc po przecinku.
 Możesz użyć metody:
 String.format( "%.2f", variableToFormat );
 */
public class Main07 {

	public static void main(String[] args) {

		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double sum = 0;
		double avg = 0;
		for (int i = 0; i < temps.length; i++) {
			temps[i] = temps[i] * 1.8 + 32;
			System.out.println(temps[i]);
			sum += temps[i];

		}

        // System.out.println(sum);
        System.out.println();
		avg = sum / temps.length;

		System.out.println("AVG: " + String.format( "%.2f", avg));
		}
	}

