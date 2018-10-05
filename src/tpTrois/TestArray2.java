package tpTrois;

public class TestArray2 {
	
	public static void main(String[] args) {
		
		// Array's initialization
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;		
		
		// Mean of the array :
		
		//Sum of the array
		int somme = 0;
		for (int i =0 ; i < array.length; i++) {
			somme += array[i];
		}
		
//		// Conversion from Integer to double
//		double moyenne = new Integer(somme).doubleValue();
//		System.out.println("Somme du tableau = "+moyenne);
//		double taille = new Integer(array.length).doubleValue();
//		double
//		System.out.println("Taille du tableau = "+taille);
//		//mean calculation :
//		moyenne = somme/taille;
//		System.out.println("Moyenne du tableau = "+moyenne);
		//OU
		
		//Dirct calculation of the mean :
		double moyenne = (double)(somme)/array.length; 
		// (double)(somme) permet de considérer l'entier 'somme' comme double. 
		// diviser un double par un entier rend un double
		System.out.println("Moyenne du tableau = "+moyenne);
		
		//Index of the first 15 value element:
		int index15 = -1;
		for (int i=0; i<array.length; i++) {
			if (array[i] ==15) {
				index15 = i;
				break;
			}
		}
		
		if (index15 == -1) {
			System.out.println("L'élément 15 ne se trouve pas dans le tableau 'array'");
		}else {
			System.out.println("Index du premier élément du tableau de valeur 15 = "+index15);		
		}
		
		//Number of duplicated element :
		int nombreDoublon = 0;
		// Parcours des éléments 'i' du tableau moins le dernier
		for(int i=0; i<array.length-1; i++) {
			//Parcours des éléments 'j' suivant 'i' dans le tableau
			for(int j=i+1;j<array.length;j++) {
				//Comparaison de l'élément 'j' avec l'élément 'i'
				if(array[i]==array[j]) {
					//S'ils sont égaux j'incrémente le nombre de doublon
					nombreDoublon++;
					break;
				}
			}
		}
		System.out.println("Le nombre de doublon est : "+nombreDoublon);
		
		
	}

}
