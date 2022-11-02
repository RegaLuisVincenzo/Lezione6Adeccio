package lezione6Adecco2Set;

import java.util.Scanner;

/*
 * CREARE UN PROGRAMMA 
 * CHE PRENDA UNA SEQUENZA DI NUMERI 
 * CHE TERMINA QUANDO SI INSERISCI 
 * IL VALORE  DI -1
 * AL TERMINE DELLA SEQUENZA 
 * IL PROGRAMMA STAMPA QUANTI NUMERI 
 * SONO STATI INSERITI
 * 
 * 
 */
public class Esercizio1CicliInfiniti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.println("INSERISCI NUMERO");
		int number = key.nextInt();
		int contaPari = 0;

		do {
			System.out.println("inserisci");
			number = key.nextInt();
			
			// ANDIAMO A DICHIARARE DI CONTARE I NUMERI PARI
			if (contaPari % 2 == 0)

				contaPari++;
		} while (number != -1);// CONTIAMO I NUMERI FINO QUANDO NON INCORTRIAMO -1
		
		System.out.println("inserisci numero"+contaPari);
		key.close();

	}

}
