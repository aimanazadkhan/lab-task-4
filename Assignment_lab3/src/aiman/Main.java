package aiman;
/*
 * AIMAN AZAD KHAN
 * 2012020253
 *SEC 5F
 *cse_2012020253@lus.ac.bd
 **/
 
public class Main {

	public static void main(String[] args) {
		Player player=new Player("Shakib",75);
		Cricket specialPlayer=new Cricket("International match",20,player);
		specialPlayer.display();
		Football football=new Football();
		
		
	}

}
