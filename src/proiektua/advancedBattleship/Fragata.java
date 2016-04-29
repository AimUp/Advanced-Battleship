package proiektua.advancedBattleship;

public class Fragata extends ItsasoIbilgailua{
	public Fragata(int pPrezioa,boolean pEgoera, int pLuzera){
		super(pPrezioa,pEgoera,pLuzera);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 2 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");
	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Fragata";
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		int txanda=AdvancedBattleship.getAdvancedBattleship().erasoaEgin();
		
	}
}