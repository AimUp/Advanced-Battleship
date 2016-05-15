package proiektua.advancedBattleship;

import java.util.Random;

import proiektua.salbuespenak.Hondoratua;

public class Korazatua extends ItsasoIbilgailua {
	
	public Korazatua(){
		super("Korazatua",6,3);
	}

	@Override
	public String informazioaInprimatu() {
		return "5x5ko laukian ausaz 3 misileko jaurti";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		Hondoratua hondoratu=null;
		boolean jo=false;
		boolean b = false;
		Random rnd= new Random();
		for(int i=0;i<3;i++){
			int z=rnd.nextInt(4)-2;
			int e=rnd.nextInt(4)-2;
			try {
				b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+z,err+e);
			} catch (Hondoratua e1) {
				hondoratu = e1;
			}
			if(b){
				jo = true;
			}
		}
		if(hondoratu!=null){
			{throw hondoratu;}
		}
		return jo;
	}
}