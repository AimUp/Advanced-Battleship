package proiektua.advancedBattleship;

public class Itsaspekoa extends ItsasoIbilgailua{
	
	public Itsaspekoa(){
		super("Itsaspekoa",100, 1);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Luzera 3 izango  duen itsaso erasoa izango da \n Itsaspekoa 5 txandatan hondoratu daiteke tableroan ikusezina izanez \n Txanda hauetan ezin da itsaspekoa ikutu ezta hondoratu \n Erasoa kasila bakarrekoa izango da, baina itsasontzi baten puntu bat ukitzerakoan hondoratu egingo du.");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		
	}

	public boolean itsaspekoErasoaEgin(int x, int i) {
		return AdvancedBattleship.getAdvancedBattleship().itsaspekoErasoaEgin(x,i);
	}
}
