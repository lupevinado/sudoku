public class Grille {
	public int [][] tab; 
	
	public Grille (){
		tab = new int [9][9]; 
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				tab [i][j] = 0;
			}
		}
	}
	
		public int [][] ajouterValeur (int col, int li, int valeur){
			int[][] t = new int[9][9];
			t = tab; 
			if (valeur<10 && valeur >0){
				t[li][col] = valeur; 
			} 
			return t; 
		}
		
		//méthode qui trouve si un nombre est dans une colonne
		public boolean estColonne (int colonne, int nombre){
			boolean est = false; 
			for(int j = 0; j<9; j++){ 
				if(tab[j][colonne]==nombre && nombre!=0){
					est= true; 
				}
			}
			return est;
		}
		//méthode qui trouve si un nombre est dans une ligne 
		public boolean estLigne (int ligne, int nombre){
			boolean est = false; 
			for(int j = 0; j<9; j++){ 
				if(tab[ligne][j]==nombre && nombre!=0){
					est= true;
				}
			}
			return est;
		}
		//méthode qui trouve si un nombre est dans une zone (carré de neuf cases)
		public boolean estZone (int colonne, int ligne, int nombre){
			boolean est = false; 
			int CaseGauche = 3*(colonne/3);
			int CaseHaut = 3*(ligne/3); 
			for(int i = CaseGauche; i<CaseGauche+3; i++){ 
				for(int j = CaseHaut; i<CaseHaut+3; j++){ 
					if(tab[j][i]==nombre && nombre!=0){
						est = true; 
					}
				}
			}
			return est;
		}
	
		// méthode pour vérifier si une valeur k est valide
    
		public boolean estValide (int ligne, int colonne, int k) {
			if (estColonne (colonne, k) == false && estLigne(ligne, k) == false && estZone(colonne, ligne, k) == false)
			return true;
			else 
			    return false;

		}
    
		    // méthode rapportant les erreurs 
		    public String erreur (int valeur, int col, int li){
			if (estValide(li, col, valeur) == false){
			    return "placement impossible car l'une des règles n'est pas respectée";
			}else{
			    return "placement possible"; 
			}
		    }

		    // méthode qui permet de vérifier si la cellule est vide
		    public boolean estVide(int ligne, int colonne) {
			if (tab[ligne][colonne] == 0)
			    return true;
			else
			    return false;
		    }
		
	}
	
	
