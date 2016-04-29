package proiektua.advancedBattleship;

public class Bonbarderoa extends AireIbilgailua{
	public Bonbarderoa(int pPrezioa){
		super(pPrezioa);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Tableroa zeharkatuko du 3 kasilako zabalera duen lerro batean erasoz  \n erasoak random baten bidez egingo dira \n erabilzaileak zutabe bat edo errenkada bat soilik aukeratu beharizango du.");
	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Bonbarderoa";
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		
	}
}
