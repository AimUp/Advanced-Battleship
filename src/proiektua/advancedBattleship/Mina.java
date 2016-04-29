package proiektua.advancedBattleship;

public class Mina extends ErasoMota{
	
	public Mina(){
		super(1);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Izena: Mina");
		System.out.println("Prezioa: " +this.getPrezioa());
		
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Minak beste jokalariaren tableroan 2x2ko erasoa egingo du");
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		
	}
	
}
