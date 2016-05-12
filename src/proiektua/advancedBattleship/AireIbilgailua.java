package proiektua.advancedBattleship;

public abstract class AireIbilgailua extends ErasoMota{
	public AireIbilgailua(String pIzena, int pPrezioa){
		super(pIzena, pPrezioa);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		System.out.println(getIzena());
		System.out.println("Prezioa: "+getPrezioa());
	}

	@Override
	public abstract String informazioaInprimatu();
}
