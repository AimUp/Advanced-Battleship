package proiektua.advancedBattleship;

public class Fragata extends ItsasoIbilgailua{
	
	public Fragata(){
		super(10,2);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 2 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}