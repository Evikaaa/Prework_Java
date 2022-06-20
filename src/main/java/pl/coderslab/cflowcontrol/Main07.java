package pl.coderslab.cflowcontrol;

/**
 Zadanie 7
 W pliku Main07.java stwórz dwie pętle niezależne i wypisz wartości ich liczników w każdej iteracji dla i < 3 oraz j < 3.
 Wykorzystaj: System.out.println("i = " + i + " j = " + j);
 Zadanie rozwiąż używając dwóch pętli for.
 Podpowiedź: Zasada tworzenia pętli zagnieżdżonych (zależnych i niezależnych) została omówiona w prezentacji Podstawy programowania. Jeśli masz wątpliwości, zajrzyj do sekcji Pętle: for, for zagnieżdżony oraz while w tej prezentacji.

 Oczekiwany wynik:

 i= 0 j= 0
 i= 0 j= 1
 i= 0 j= 2
 i= 1 j= 0
 i= 1 j= 1
 i= 1 j= 2
 i= 2 j= 0
 i= 2 j= 1
 i= 2 j= 2
 */
public class Main07 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i=" + i + " j=" + j);
			}
		}






	}

}
