package proiektua.advancedBattleship;

public class HegazkinGarraiolariak extends ItsasoIbilgailua {
	
	public HegazkinGarraiolariak(){
		super(100, 4);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 4 izango duen itsaso erasolaria izango da \n bere erasoa kasila  bakarrekoa izango da");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}
