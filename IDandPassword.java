package Algo;

import java.util.Random;

public class IDandPassword {
	
	public static void main(String[] args) {
		
		
		//D�claration des variables
		String nom, prenom, id, extract;
		
		
		//Initialisation du nom 
		nom = Saisie.lire_String("Veuillez saisir votre nom :");
		
		
		//Initialisation du pr�nom 
		prenom = Saisie.lire_String("Veuillez saisir votre pr�nom :");
		
		
		//Definition de l'id
		extract = prenom.substring(0,1);	
        id = extract + nom;
	
        
        //D�finition des 4 chiffres al�atoire
    	Random random = new Random();
    	int nb = 999;{
    		
    	while (true){
    	    nb = random.nextInt(10000);
    	    if(nb !=0) break;
    		}
    	} 
    	
    	
    	//D�finition des caract�res al�atoire en minuscule
		Random minus = new Random();
		char n = (char)(minus.nextInt(26) + 97);
		
		
    	//D�finition des caract�res al�atoire en majuscule
		Random majus = new Random();
		char m = (char)(majus.nextInt(26) + 65);
		
		
    	//D�finition des caract�res al�atoire avec # % et plus
	    Random spe = new Random();
	    char s = (char)(spe.nextInt(3) + 35); 
		
	    
		//Message de fin
        System.out.println();
		System.out.println("Voici vos informations \n"); 
        System.out.println("Identifiant : " + id);
	    System.out.println("Mot de passe : " + m + n + s + nb);
	}
}

