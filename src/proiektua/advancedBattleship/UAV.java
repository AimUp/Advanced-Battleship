package proiektua.advancedBattleship;

public class UAV extends AireIbilgailua{
	
	public UAV(){
		super("UAV",25);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Aurkariaren tableroan 5x5 eko laukiaren edukia bistaratuko du. \n ezin daiteke mugitu");	
	}

	@Override
	protected String getIzena() {
		return "UAV";
	}

	@Override
	protected boolean erasoaEgin(int x, int y) {
		AdvancedBattleship.getAdvancedBattleship().uavErasoa(x, y);
		return false;
	}
}