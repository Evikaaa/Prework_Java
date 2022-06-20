package pl.coderslab.bvariablesandoperators;

/**
 Zadanie 5
 W pliku Main05.java w metodzie main stwórz trzy zmienne:

 nr1, typu double o wartości 5.1,
 nr2, typu float o wartości 5.0f,
 result, typu boolean, przechowującą wynik sprawdzania, czy pierwsza liczba jest większa od drugiej.
 Wartości mają być nadawane w jednej linii, razem z deklaracją, czyli: type variableName = variableValue;

 Wypisz wartość zmiennej result na konsoli.

 Oczekiwany wynik:

 true
 */
public class Main05 {

	public static void main(String[] args) {
      double nr1 = 5.1;
	  float nr2 = 5.0f;
	  boolean result = nr1 > nr2;
	  System.out.println(result);
	}

}
