package proiektua.advancedBattleship;

import proiektua.advanncedBattleship.baliabideak.Textua;
import proiektua.salbuespenak.Hondoratua;

public class Fragata extends ItsasoIbilgailua{
	
	public Fragata(){
		super(Textua.fragata,4,2);
	}

	@Override
	public String informazioaInprimatu() {
		return "Fragataren eraso kasila bakarrekoa da";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}