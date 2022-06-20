package pl.coderslab.cflowcontrol;

/**
 Zadanie 3
 W pliku Main03.java stwórz pętlę, która 3 razy wypisze w konsoli tekst Java.
 Napisz zarówno pętlę for jak i while.
 W sumie napis będzie widoczny 6 razy.
 Oczekiwany wynik:

 Java
 Java
 Java
 Java
 Java
 Java
 */
public class Main03 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Java");
		}

		int i = 0;
		while (i < 3) {
			System.out.println("Java");
			i++;
		}

	}
}
