package pl.coderslab.cflowcontrol;

/**
 Zadanie 2
 W pliku Main02.java stwórz trzy zmienne, o nazwach nr1, nr2, nr3 , przechowujące liczby całkowite o wartościach 3, 7, 11.
 Następnie za pomocą instrukcji warunkowej if ... else if ... else, wypisz na stronie, która z nich jest największa.
 Tekst wypisz wg wzoru: Największa z liczb to 11.
 */
public class Main02 {

	public static void main(String[] args) {
     int nr1 = 3;
	 int nr2 = 7;
	 int nr3 = 11;


		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println("Największa z liczb to " + nr1);
		}
		if (nr2 > nr1 && nr2 > nr3) {
			System.out.println("Największa z liczb to " + nr2);
		} else {
			System.out.println("Największa z liczb to " + nr3); }



	}

}
