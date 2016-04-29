package proiektua.advancedBattleship;

public abstract class ItsasoIbilgailua extends ErasoMota{
	
	private boolean egoera;
	private int luzera;
	
	public ItsasoIbilgailua(int pPrezioa, int pLuzera){
		super(pPrezioa);
		egoera=true;
		luzera=pLuzera;
	}
	protected void espezifikazioakInprimatu(){
	System.out.println(this.getIzena());
	System.out.println("Prezioa: "+this.getPrezioa());
	System.out.println("Prezioa: " +egoera);
	System.out.println("Prezioa: " +luzera);
}
	
	protected abstract void informazioaInprimatu();
	protected abstract String getIzena();
	protected abstract void erasoaEgin(int zut, int err);
}
