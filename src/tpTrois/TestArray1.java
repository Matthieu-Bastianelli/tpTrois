package tpTrois;

import java.util.Arrays;

public class TestArray1 {
	
	public static void main(String[] args) {
		
		// Définition du tableau
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		System.out.println("Affichage des éléments du tableau dans l'ordre croissant");
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Affichage des éléments du tableau dans l'ordre décroissant."); //Attention dimensions du tableau
		for (int i = array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("Affichage des valeurs du tableau supérieures à 3");
		for (int i = 0; i<array.length; i++) {
			if (array[i] >=3) {
				System.out.println(array[i]);				
			}
		}
		
		System.out.println("Affichage des entiers pairs du tableau");
		for (int i = 0; i<array.length; i++) {
			if ((array[i]%2) ==0) {
				System.out.println(array[i]);				
			}
		}
		
		System.out.println("Affichage du plus grand et le plus petit élément du tableau");
		// Nécessite d'importer le package java.util.Arrays
        int max = Arrays.stream(array).max().getAsInt();
		int min = Arrays.stream(array).min().getAsInt();

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        
        //Other method :
        int resultatMax = Integer.MIN_VALUE;
        int resultatMax2 = Integer.MIN_VALUE;
        for (int i=0; i<array.length;i++) {
        	if (resultatMax < array[i]) {
        		resultatMax = array[i];
        	}
        	//OU
        	resultatMax2 = (resultatMax2 < array[i])? array[i] : resultatMax2;
        }
        System.out.println("Plus grande valeur méthode 'for' 1 : "+resultatMax+"\nPlus grande valeur méthode 'for' 2 : "+resultatMax2);
		
	}
}
