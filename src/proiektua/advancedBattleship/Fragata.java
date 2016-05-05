package proiektua.advancedBattleship;

public class Fragata extends ItsasoIbilgailua{
	
	public Fragata(){
		super("Fragata",4,2);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera: 2 \n Erasoa: Kasila bakarra");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}