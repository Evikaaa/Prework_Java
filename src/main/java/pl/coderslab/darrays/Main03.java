package pl.coderslab.darrays;

/**
 Zadanie 3
 W pliku Main03.java

 Stwórz tablicę typu int z wartościami (4, 643, 112, 9999, 69 ), tablicę nazwij numbers.
 Stwórz zmienną sum i przypisz do niej liczbę 0.
 Za pomocą pętli for oblicz sumę liczb z tablicy.
 Wypisz sumę na konsoli, wg wzoru: SUMA: 10827..
 */
public class Main03 {

	public static void main(String[] args) {

		int numbers[] = {4, 643, 112, 9999, 69};
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		System.out.println(sum);
	}
}