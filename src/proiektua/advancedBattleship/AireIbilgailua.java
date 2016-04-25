package proiektua.advancedBattleship;

public abstract class AireIbilgailua extends ErasoMota{
	public AireIbilgailua(int pPrezioa){
		super(pPrezioa);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		// TODO Auto-generated method stub
		System.out.println(this.getIzena());
		System.out.println("Prezioa: "+this.getPrezioa());
	}

	@Override
	protected abstract void informazioaInprimatu();
	protected abstract String getIzena();
}
