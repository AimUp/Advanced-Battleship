package proiektua.advancedBattleship;

public abstract class ItsasoIbilgailua extends ErasoMota{
	private boolean egoera;
	private int luzera;
	private boolean egoera;
	public ItsasoIbilgailua(int pPrezioa){
		super(pPrezioa);
		egoera=
	}
protected void espezifikazioakInprimatu(){
	System.out.println(this.getIzena());
	System.out.println("Prezioa: "+this.getPrezioa());
	System.out.println("Prezioa: " +egoera);
	System.out.println("Prezioa: " +luzera);
}
	
protected abstract void informazioaInprimatu();
}
