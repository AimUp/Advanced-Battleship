package proiektua.advancedBattleship;

public abstract class ErasoMota {

	private String izena;
	private int prezioa;
	
	public ErasoMota(int pPrezioa){
		prezioa=pPrezioa;
	}
	
	protected int getPrezioa(){
		return prezioa;
	}
	
	protected String getIzena(){
		return izena;
	}
	
	protected abstract void espezifikazioakInprimatu();
	
	protected abstract void informazioaInprimatu();
	
	protected abstract boolean erasoaEgin(int zut, int err);
}
 