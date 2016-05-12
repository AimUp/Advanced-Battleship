package proiektua.advancedBattleship;

public abstract class AireIbilgailua extends ErasoMota{
	public AireIbilgailua(String pIzena, int pPrezioa){
		super(pIzena, pPrezioa);
	}

	@Override
	public abstract String informazioaInprimatu();
}
