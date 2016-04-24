package proiektua.advancedBattleship;

public class Korazatua extends ItsasoIbilgailua {
	public Korazatua(int pPrezioa,boolean pEgoera, int pLuzera){
		super(pPrezioa,pEgoera,pLuzera);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");

	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Korazatua";
	}
}