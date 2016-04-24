package proiektua.advancedBattleship;

public class Itsaspekoa extends ItsasoIbilgailua{
	public Itsaspekoa(int pPrezioa,boolean pEgoera, int pLuzera){
		super(pPrezioa,pEgoera, pLuzera);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 3 izango  duen itsaso erasoa izango da \n Itsaspekoa 5 txandatan hondoratu daiteke tableroan ikusezina izanez \n Txanda hauetan ezin da itsaspekoa ikutu ezta hondoratu");
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
