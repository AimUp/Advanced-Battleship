package proiektua.advancedBattleship;

public class HegazkinGarraiolaria extends ItsasoIbilgailua {
	
	public HegazkinGarraiolaria(){
		super("Hegazkin Garraiolaria",10, 4);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera: 4 \n Erasoa: Kasila bakarra");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}
