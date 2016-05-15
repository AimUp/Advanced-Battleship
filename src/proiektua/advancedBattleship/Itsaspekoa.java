package proiektua.advancedBattleship;

import proiektua.salbuespenak.Hondoratua;

public class Itsaspekoa extends ItsasoIbilgailua{
	
	public Itsaspekoa(){
		super("Itsaspekoa",15, 1);
	}

	@Override
	public String informazioaInprimatu() {
		return "Tiro batekin itsasontzia hondoratu dezake";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		return AdvancedBattleship.getAdvancedBattleship().itsaspekoErasoaEgin(zut,err);
	}
}
