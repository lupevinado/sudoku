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
		// méthode rapportant les erreurs 
		public String erreur (int valeur, int col, int li){
			if (estColonne(col,valeur) || estLigne(li, valeur) || estZone(col, li, valeur)){
				return "placement impossible car l'une des règles n'est pas respectée";
			}else{
				return "placement possible"; 
			}
		}
		
	}
	
	
