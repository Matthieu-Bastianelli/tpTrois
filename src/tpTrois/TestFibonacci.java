package tpTrois;

import java.util.Scanner;

public class TestFibonacci {
	
	public static void main(String[] args) {
		
		// Scanner initialization
		Scanner scan = new Scanner(System.in);
		
		// Message to ask the N order :
		int positif=0;
		int rangN=0;
		System.out.println("Veuillez choisir un rang N positif:");
		
		// While loop in order to ensure that the chosen N rank is positive.
		while (positif==0) {
			rangN = scan.nextInt();
			
			if (rangN < 0) {
				System.out.println("Attention, le rang N doit être supérieur à 0!\n Choisissez une nouvelle valeur de N :");
			}else {
				positif = 1;
			}
			
		}
		scan.close(); // Fermeture 
		System.out.println("Le rang choisi est N = "+rangN);
		
		System.out.print( "Le nombre de la suite de Fibonacci de rang "+rangN+" est : ");
		
		// Initialization for Fibonacci suite :
		if (rangN == 0) {
			System.out.println(0);
		} else if (rangN == 1) {
			System.out.println(1);
		} else {
			
			// calculation of Fibonacci value for N rank upper than 2;
			//Initialization
			int val1 = 0;
			int val2 = 1;
			int valeurN=val2+val1;
			int indice=2;
			
			// Calculation of the Fibonacci's value which is associated with 'indice' until the 'indice' reach the N rank.
			while (indice != rangN) {
				val1=val2;
				val2=valeurN;
				valeurN = val2+val1;
				indice++;
				// System.out.println(valeurN); // for test
			}
			
			System.out.println(valeurN);
			
		}
		
	}

}
