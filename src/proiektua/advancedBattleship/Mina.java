package proiektua.advancedBattleship;

public class Mina extends ErasoMota{
	
	public Mina(){
		super("Mina",1);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		System.out.println("Izena: Mina");
		System.out.println("Prezioa: " +this.getPrezioa());
		
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Minak beste jokalariaren tableroan 3x3ko erasoa egingo du");
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err-1);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err-1);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err-1);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err+1);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err+1);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err+1);
		
		
	}
	
}
