package proiektua.advancedBattleship;

public class Itsaspekoa extends ItsasoIbilgailua{
	
	public Itsaspekoa(){
		super("Itsaspekoa",15, 1);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Luzera: Kasila bakarra \n Erasoa: Kasila bakarrarekin itsasontzia hondoratu.");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().itsaspekoErasoaEgin(zut,err);
		
	}
}
