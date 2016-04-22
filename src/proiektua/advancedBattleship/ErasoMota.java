package proiektua.advancedBattleship;

public abstract class ErasoMota {

	private int prezioa;
	
	public ErasoMota(int pPrezioa){
		prezioa=pPrezioa;
	}
	
	protected int getPrezioa(){
		return prezioa;
	}
	
	protected abstract void espezifikazioakInprimatu();
	
	protected abstract void informazioaInprimatu();
	
}
