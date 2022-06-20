package pl.coderslab.cflowcontrol;

/**
 Zadanie 5
 W pliku Main05.java stwórz zmienne resultFor oraz resultWhile i przypisz do nich liczbę 0.
 Następnie stwórz pętlę, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej resultFor lub resultWhile.
 Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej resultFor lub resultWhile kolejną liczbę z podanego zakresu.
 Napisz zarówno pętlę for jak i while.
 Wypisz w konsoli w oddzielnych liniach zmienne: resultFor i resultWhile.
 Oczekiwany wynik:

 55
 55
 */
public class Main05 {

	public static void main(String[] args) {

		int resultFor = 0 ;

		for(int i=1;i<=10; i++) {
			resultFor = resultFor + i;
		}

		System.out.println(resultFor);


		int resultWhile = 0 ;
		int i = 1;
		while (i <=10) {
			resultWhile = resultWhile + i;
			i++;
		}

		System.out.println(resultWhile);

	}
		}



