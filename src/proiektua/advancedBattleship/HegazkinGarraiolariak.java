package proiektua.advancedBattleship;

public class HegazkinGarraiolariak extends ItsasoIbilgailua {
	public HegazkinGarraiolariak(int pPrezioa,int pLuzera, boolean pEgoera){
		super(pPrezioa,pEgoera,pLuzera);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 4 izango duen itsaso erasolaria izango da \n bere erasoa kasila  bakarrekoa izango da");
	}

	@Override
	protected String getIzena() {
		return "HegazkinGarraiolaria";
	}

}
