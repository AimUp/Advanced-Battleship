package proiektua.advancedBattleship;

public class UAV extends AireIbilgailua{
	public UAV(int pPrezioa){
		super(pPrezioa);
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
}
