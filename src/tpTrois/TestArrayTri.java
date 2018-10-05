package tpTrois;

import java.util.Arrays;

public class TestArrayTri {
	
	public static void main(String[] args) {
		
		// Initialisation
		Integer[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4} ;
		// Affichage des éléments du tableau
		System.out.println("Affichage du tableau array avant tri des valeurs :");
		Arrays.asList(array).forEach(System.out::println);
		
		// Tri des éléments du tableau avec la classe Array
		Arrays.sort(array);
		System.out.println("Affichage du tableau array après tri des valeurs :");
		Arrays.asList(array).forEach(System.out::println);
		
		//OU

		System.out.println("Affichage avec boucle for du tableau array après tri des valeurs :");
		for (int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	
	}

}
