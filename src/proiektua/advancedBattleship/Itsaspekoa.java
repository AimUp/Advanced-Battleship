package proiektua.advancedBattleship;

public class Itsaspekoa extends ItsasoIbilgailua{	
	public Itsaspekoa(){
		super(100, 1);
		ikusgarria=pIkusgarria;
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 3 izango  duen itsaso erasoa izango da \n Itsaspekoa 5 txandatan hondoratu daiteke tableroan ikusezina izanez \n Txanda hauetan ezin da itsaspekoa ikutu ezta hondoratu \n Erasoa kasila bakarrekoa izango da, baina itsasontzi baten puntu bat ukitzerakoan hondoratu egingo du.");
	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Itsaspekoa";
	}
	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		
	}
}
