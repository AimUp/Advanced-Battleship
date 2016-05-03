package proiektua.advancedBattleship;

public abstract class ErasoMota {

	private String izena;
	private int prezioa;
	
	public ErasoMota(String pIzena, int pPrezioa){
		izena = pIzena;
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

	public void itsaspekoErasoaEgin(int i, int j) {
		// TODO Auto-generated method stub
		this.itsaspekoErasoaEgin(i,j);
	}
}
 