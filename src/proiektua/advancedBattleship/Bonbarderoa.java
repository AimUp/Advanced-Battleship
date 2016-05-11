package proiektua.advancedBattleship;

import java.util.Random;

public class Bonbarderoa extends AireIbilgailua{
	
	public Bonbarderoa(){
		super("Bonbarderoa",10);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Erasoa: 3 zutabe zeharkatuko ditu 5 random misil jaurtiz");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
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
