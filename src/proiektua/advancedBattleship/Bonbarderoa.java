package proiektua.advancedBattleship;

import java.util.Random;

import proiektua.salbuespenak.Hondoratua;

public class Bonbarderoa extends AireIbilgailua{
	
	public Bonbarderoa(){
		super("Bonbarderoa",10);
	}

	@Override
	public String informazioaInprimatu() {
		return"3 zutabe zeharkatuko ditu 5 misil jaurtiz";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		boolean b = false;
		boolean jo = false;
		err=14;
		Random rnd=new Random();
		for(int i=0;i<5;i++){
			int z=rnd.nextInt(zut+1 - zut-1 +1)+zut-1;
			err=err-rnd.nextInt(2)+1;
			b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,err);
			if(b){
				jo = true;
			}
		}
		return jo;
	}
}
