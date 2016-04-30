package proiektua.advancedBattleship;

public class UAV extends AireIbilgailua{
	
	public UAV(){
		super(100);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Aurkariaren tableroan 5x5 eko laukiaren edukia bistaratuko du. \n ezin daiteke mugitu");
		
	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "UAV";
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return false;
	}
}