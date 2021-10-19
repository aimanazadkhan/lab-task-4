package aiman;
/*
 * AIMAN AZAD KHAN
 * 2012020253
 *SEC 5F
 *cse_2012020253@lus.ac.bd
 **/
 
public class Cricket extends Sports  {
	 String matchType;
	 int over;
	 Player player;
	 Cricket(String matchType,int over,Player player){
		 this.matchType=matchType;
		 this.over=over;
		 this.player=player;
	 }
	 void display() {
		 System.out.println("MatchType: "+matchType);
		 System.out.println("Over: "+over);
		 System.out.println("Player's Name: "+player.playerName);
		 System.out.println("Playerr's Jersey Number: "+player.jerseyNumber);
	 }
   
   
}
