package proiektua.advancedBattleship;

public class Denda {

	private static Denda nDenda = null;
	
	
	private Denda(){
		
	}
	
	public Denda getDenda(){
		if(nDenda==null){
			nDenda = new Denda();
		}
		return nDenda;
	}
	
}
