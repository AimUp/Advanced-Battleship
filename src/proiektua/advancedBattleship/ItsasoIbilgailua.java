package proiektua.advancedBattleship;

public abstract class ItsasoIbilgailua extends ErasoMota{
	
	private boolean egoera;
	private int luzera;
	
	public ItsasoIbilgailua(String pIzena, int pPrezioa, int pLuzera){
		super(pIzena, pPrezioa);
		egoera=true;
		luzera=pLuzera;
	}
	
	public int getLuzera(){
		return luzera;
	}
	
	protected void espezifikazioakInprimatu(){
		System.out.println(this.getIzena());
		System.out.println("Prezioa: "+this.getPrezioa());
		System.out.println("Luzera: " +luzera);
	}
	
	public void erasoaJaso(){
		luzera--;
	}
	
	protected abstract void informazioaInprimatu();
	protected abstract boolean erasoaEgin(int zut, int err);
}
