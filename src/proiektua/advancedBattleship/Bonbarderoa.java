package proiektua.advancedBattleship;

import java.util.Random;

import proiektua.advanncedBattleship.baliabideak.Textua;
import proiektua.salbuespenak.Hondoratua;

public class Bonbarderoa extends AireIbilgailua{
	
	public Bonbarderoa(){
		super(Textua.bonbarderoa,5);
	}

	@Override
	public String informazioaInprimatu() {
		return"3 zutabe zeharkatuko ditu 5 misil jaurtiz";
	}

	@Override
	public boolean erasoaEgin(int err, int zut) throws Hondoratua{
		Hondoratua hondoratu=null;
		boolean b = false;
		boolean jo = false;
		err=-1;
		Random rnd=new Random();
		for(int i=0;i<5;i++){
			int z=rnd.nextInt(2)-1;
			err=(1+rnd.nextInt(2))+(3*i);
			try {
				b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(err,zut+z);
			} catch (Hondoratua e) {
				hondoratu=e;
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
