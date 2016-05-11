package proiektua.advancedBattleship;

public class Mina extends ErasoMota{
	
	public Mina(){
		super("Mina",10);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		System.out.println("Izena: Mina");
		System.out.println("Prezioa: " +this.getPrezioa());
		
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Minak beste jokalariaren tableroan 2x2ko erasoa egingo du");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		//TODO 3x3
		return false;
	}
	
}
