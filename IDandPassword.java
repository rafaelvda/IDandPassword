package Algo;

import java.util.Random;

public class IDandPassword {
	
	public static void main(String[] args) {
		
		
		//Déclaration des variables
		String nom, prenom, id, extract;
		
		
		//Initialisation du nom 
		nom = Saisie.lire_String("Veuillez saisir votre nom :");
		
		
		//Initialisation du prénom 
		prenom = Saisie.lire_String("Veuillez saisir votre prénom :");
		
		
		//Definition de l'id
		extract = prenom.substring(0,1);	
        id = extract + nom;
	
        
        //Définition des 4 chiffres aléatoire
    	Random random = new Random();
    	int nb = 999;{
    		
    	while (true){
    	    nb = random.nextInt(10000);
    	    if(nb !=0) break;
    		}
    	} 
    	
    	
    	//Définition des caractères aléatoire en minuscule
		Random minus = new Random();
		char n = (char)(minus.nextInt(26) + 97);
		
		
    	//Définition des caractères aléatoire en majuscule
		Random majus = new Random();
		char m = (char)(majus.nextInt(26) + 65);
		
		
    	//Définition des caractères aléatoire avec # % et plus
	    Random spe = new Random();
	    char s = (char)(spe.nextInt(3) + 35); 
		
	    
		//Message de fin
        System.out.println();
		System.out.println("Voici vos informations \n"); 
        System.out.println("Identifiant : " + id);
	    System.out.println("Mot de passe : " + m + n + s + nb);
	}
}

