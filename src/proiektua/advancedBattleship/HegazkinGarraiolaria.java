package proiektua.advancedBattleship;

import proiektua.advanncedBattleship.baliabideak.Textua;
import proiektua.salbuespenak.Hondoratua;

public class HegazkinGarraiolaria extends ItsasoIbilgailua {
	
	public HegazkinGarraiolaria(){
		super(Textua.HegazkinGarraiolaria,8, 4);
	}

	@Override
	public String informazioaInprimatu() {
		return "Kasila bakarreko erasoa";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		return AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
	}
}
