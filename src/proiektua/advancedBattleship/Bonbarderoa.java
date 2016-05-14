package proiektua.advancedBattleship;

import java.util.Random;

import proiektua.salbuespenak.Hondoratua;

public class Bonbarderoa extends AireIbilgailua{
	
	public Bonbarderoa(){
		super("Bonbarderoa",5);
	}

	@Override
	public String informazioaInprimatu() {
		return"3 zutabe zeharkatuko ditu 5 misil jaurtiz";
	}

	@Override
	public boolean erasoaEgin(int err, int zut) throws Hondoratua{
		boolean b = false;
		boolean jo = false;
		err=-1;
		Random rnd=new Random();
		for(int i=0;i<5;i++){
			int z=rnd.nextInt(2)-1;
			err=(1+rnd.nextInt(2))+(3*i);
			b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(err,zut+z);
			if(b){
				jo = true;
			}
		}
		return jo;
	}
}
