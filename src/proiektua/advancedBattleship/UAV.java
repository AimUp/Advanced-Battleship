package proiektua.advancedBattleship;

public class UAV extends AireIbilgailua{
<<<<<<< HEAD
	
	public UAV(){
		super(1000);
=======
	public UAV(int pPrezioa){
		super(pPrezioa);
>>>>>>> branch 'master' of https://aimup@github.com/AimUp/Advanced-Battleship.git
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
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		
	}
}