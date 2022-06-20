package pl.coderslab.bvariablesandoperators;

/**
 Zadanie 3
 W pliku Main03.java w metodzie main stwórz trzy zmienne:

 nr1, typu int o wartości 5,
 nr2, typu int o wartości 3,
 result typu int, przechowującą resztę z dzielenia (modulo) tych liczb – nr1 modulo nr2.
 Wartości mają być nadawane w jednej linii, razem z deklaracją, czyli: type variableName = variableValue;

 Wypisz wartość zmiennej result na konsoli.
 */
public class Main03 {

	public static void main(String[] args) {
       int nr1 = 5;
	   int nr2 = 3;
	   int result = nr1 % nr2;
	   System.out.println(result);
	}

}
