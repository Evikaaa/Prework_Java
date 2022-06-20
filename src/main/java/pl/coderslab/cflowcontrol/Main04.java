package pl.coderslab.cflowcontrol;

/**
 Zadanie 4
 W pliku Main04.java stwórz pętlę, która wypisze w konsoli, w jednej linii, liczby od 1 do 10.
 Napisz zarówno pętlę for jak i while.
 W sumie zostanie wypisanych 20 liczb.
 Oczekiwany wynik:

 1 2 3 4 5 6 7 8 9 10
 1 2 3 4 5 6 7 8 9 10
 */
public class Main04 {

	public static void main(String[] args) {

		for (int i = 1; i <=10; i=i+1) {
			System.out.print(i + " ");
		}

		System.out.println();

		int i = 1;
		while (i <=10) {
			System.out.print(i + " ");
			i++;
		}

	}

}
