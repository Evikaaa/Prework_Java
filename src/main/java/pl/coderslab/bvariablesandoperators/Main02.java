package pl.coderslab.bvariablesandoperators;

/**
 Zadanie 2
 W pliku Main02.java w metodzie main stwórz trzy zmienne:

 nr1, typu byte o wartości 94,
 nr2, typu short o wartości 257,
 result, typu int, przechowującą sumę dwóch poprzednich zmiennych (użyj znaku dodawania +).
 Wartości mają być nadawane w jednej linii, razem z deklaracją, czyli: type variableName = variableValue;

 Wypisz wartość zmiennej result na konsoli.
 */
public class Main02 {

	public static void main(String[] args) {
        byte nr1 = 94;
		short nr2 = 257;
		int result = nr1 + nr2;
		System.out.println(result);

	}

}
