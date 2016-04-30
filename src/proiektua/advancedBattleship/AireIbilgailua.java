package proiektua.advancedBattleship;

public abstract class AireIbilgailua extends ErasoMota{
	public AireIbilgailua(int pPrezioa){
		super(pPrezioa);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		System.out.println(getIzena());
		System.out.println("Prezioa: "+getPrezioa());
	}

	@Override
	protected abstract void informazioaInprimatu();
}
